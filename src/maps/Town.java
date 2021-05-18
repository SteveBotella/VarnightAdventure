package maps;

import actors.Character;
import actors.Spell;
import actors.Warrior;
import actors.Weapon;
import tools.Utils;
import ui.CharacterSheet;
import ui.Room;

import java.util.Scanner;

public class Town extends Dungeon {

    public Town() {
        super();
    }

    public void gameStart(Character player) {
        player.setWorldLocation(0);

        getUtils().storyText("-----     THE TOWN     -----",
                             "-----  Peaceful Place  -----",
                player,
                getCharacterSheet(),
                getControllerChoiceInt(),
                getSc());

        if (player.getArchetype().equals("Warrior") && player.getHp() < 5) {
            player.setHp(5);
        } else if (player.getArchetype().equals("Mage") && player.getHp() < 3) {
            player.setHp(3);
        }
        setControllerChoiceInt(999);
        System.out.println(" ");
        System.out.println("             --------                         --------------                  ");
        System.out.println("            | Shop > |                       |  Adventure > |                 ");
        System.out.println("             --------                         --------------                  ");
        System.out.println("            1 (Numpad)                          2 (Numpad)                    ");
        while (getControllerChoiceInt() != 1 && getControllerChoiceInt() != 2) {
            setControllerChoiceInt(getSc().nextInt());
            switch (getControllerChoiceInt()) {
                case 1 :
                    System.out.println("You enter the shop...");
                    getUtils().waitSec(3, false, true);
                    System.out.println("Seller : - Hello traveler. What can I do for you ?");
                    System.out.println(" ");
                    System.out.println(player.getName() + " Gold : " + player.getGold());
                    System.out.println("     -----------    -----------    --------------    --------------     ");
                    System.out.println("    | Sword   > |  | Mace    > |  | Lightning B. |  | Fireball   > |    ");
                    System.out.println("    | Gold : 10 |  | Gold :  5 |  | Gold :      5|  | Gold :    10 |    ");
                    System.out.println("     -----------    -----------    --------------    --------------     ");
                    System.out.println("     1 (Numpad)      2 (Numpad)     3 (Numpad)      4 (Numpad)          ");
                    System.out.println("                       Leave shop : 0 (Numpad)                          ");
                    while (getControllerChoiceInt() != 0) {
                        setControllerChoiceInt(getSc().nextInt());
                        switch (getControllerChoiceInt()) {
                            case 1 :
                                if (player.getSkillOne().getName().equals("Sword") || player.getGold() < 10 || player.getArchetype().equals("Mage")) {
                                    System.out.println("You can't buy it.");
                                } else {
                                    player.setSkillOne(new Weapon("Sword"));
                                    player.setGold(player.getGold() - 10);
                                    System.out.println("Seller : - Nice choice.");
                                    System.out.println("You bought a Sword");
                                    System.out.println(player.getName() + " Gold : " + player.getGold());
                                }
                                break;
                            case 2 :
                                if (player.getSkillOne().getName().equals("Mace") || player.getGold() < 5 || player.getArchetype().equals("Mage")) {
                                    System.out.println("You can't buy it.");
                                } else {
                                    player.setSkillOne(new Weapon("Mace"));
                                    player.setGold(player.getGold() - 5);
                                    System.out.println("Seller : - Nice choice.");
                                    System.out.println("You bought a Mace");
                                    System.out.println(player.getName() + " Gold : " + player.getGold());
                                }
                                break;
                            case 3 :
                                if (player.getSkillTwo().getName().equals("Lightning Bolt") || player.getGold() < 5 || player.getArchetype().equals("Warrior")) {
                                    System.out.println("You can't buy it.");
                                } else {
                                    player.setSkillTwo(new Spell("Lightning Bolt"));
                                    player.setGold(player.getGold() - 5);
                                    System.out.println("Seller : - Nice choice.");
                                    System.out.println("You learn Lightning Bolt");
                                    System.out.println(player.getName() + " Gold : " + player.getGold());
                                }
                                break;
                            case 4 :
                                if (player.getSkillFour().getName().equals("Fireball") || player.getGold() < 10 || player.getArchetype().equals("Warrior")) {
                                    System.out.println("You can't buy it.");
                                } else {
                                    player.setSkillTwo(new Spell("Fireball"));
                                    player.setGold(player.getGold() - 10);
                                    System.out.println("Seller : - Nice choice.");
                                    System.out.println("You learn Fireball");
                                    System.out.println(player.getName() + " Gold : " + player.getGold());
                                }
                                break;
                            case 9 :
                                getCharacterSheet().paperSheet(player);
                                break;
                            default :
                        }
                    }
                    System.out.println("Leaving Shop");
                    getUtils().waitSec(3,false, true);
                    this.gameStart(player);
                    break;
                case 2 :
                    Game game = new Game(15, 7, 3, 5, 5, 5, 5, 5, 5, 9 );
                    game.gameStart(player);
                    break;
                case 9 :
                getCharacterSheet().paperSheet(player);
                break;
            }
        }
    }
}
