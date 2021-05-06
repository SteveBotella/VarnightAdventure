package maps;

import actors.Character;
import tools.Utils;
import ui.CharacterSheet;
import ui.Room;

import java.util.Scanner;

public class DungeonVar {
    Utils utils = new Utils();
    CharacterSheet characterSheet = new CharacterSheet();

    Scanner sc = new Scanner(System.in);
    int controllerChoiceInt = 999;
    String controllerChoiceString = "";

    int N = 19;
    Room room = new Room();

    String roomArchetype = "Corridor";
    String roomTitle = "empty";

    public String getRoomArchetype() {
        return roomArchetype;
    }

    public void setRoomArchetype(String roomArchetype) {
        this.roomArchetype = roomArchetype;
    }

    public String getRoomTitle() {
        return roomTitle;
    }

    public void setRoomTitle(String roomTitle) {
        this.roomTitle = roomTitle;
    }

    public void gameStart(Character player1) {
        player1.setWorldLocation(0);

        utils.waitSec(3, true, true);
        utils.storyText("-----     CHAPTER I     -----",
                        "-----    Dungeon Var    -----",
                        player1,
                        characterSheet);

        utils.waitSec(1, false, false);
        utils.storyText("After many days traveling across the dangerous forest, the lost villages",
                        "and enjoy your rest in 'lovely' Inn...",
                        player1,
                        characterSheet);

        utils.storyText("You prepare yourself to enter...",
                        "!!! The Dungeon Var - No one been return !!!",
                        player1,
                        characterSheet);

        System.out.println("The sun is falling, night is coming, a cold wind run into your clothes");
        System.out.println("TAn abandoned Castle is front of you. It stink monsters... Or cheese maybe.");

        while (player1.getHp() > 0 && player1.getWorldLocation() < N) {
            utils.storyText("You are in level " + (player1.getWorldLocation() + 1),
                            "(Roll the dice to move your character inside the dungeon)",
                            player1,
                            characterSheet);
                    int diceResult = utils.rollDice(6);
                    player1.setWorldLocation(player1.getWorldLocation() + diceResult);

            Character empty = new Character();
            switch (player1.getWorldLocation()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    setRoomArchetype("Enemy");
                    setRoomTitle("Entrance ");
                    Character gobelin = new Character();
                    gobelin.createCharacter("Gobelin", "Bazakarak", 6, 6, 1, 1, "Gobwin dawggewr", "Wrock throw", "Rwun Waway", "Whelp", 3, 0);
                    room.room(player1, gobelin, this, "Stinky place... Gobelin : - Koup koup touwa !");
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    setRoomArchetype("Corridor");
                    setRoomTitle("Corridor to Armory ");
                    room.room(player1, empty, this, "You ear something strange... : 'WArEwlwLwlwLwLEee !'");
                    break;
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    setRoomArchetype("Enemy");
                    setRoomTitle("Armory ");
                    Character gobelin1 = new Character();
                    gobelin1.createCharacter("Gobelin", "Kazazouille", 6, 6, 1, 1, "Gobwin dawggewr", "Wrock throw", "Rwun Waway", "Whelp", 3, 0);
                    room.room(player1, gobelin1, this, "A Goblin is bashing another one lay on the ground. He doesn't see you yet.");
                    break;
                default:
            }
        }

        player1.setWorldLocation(N);

        Character boss = new Character();

        boss.createCharacter("Orc Chief", "Zoruk", 12, 12, 2, 2, "Heavy axe", "Shield Bash", "Axe throw", "Battle Cry", 10, 2);
        setRoomArchetype("Enemy");
        setRoomTitle("Dungeon Master ");
        room.room(player1, boss, this, "Orc Chief : - Today, you launch in hell ! Waaaarg !");

        player1.setWorldLocation(N);
        if (player1.getHp() > 0) {
            System.out.println("You raid the Dungeon succefully");
        }
        System.out.println(" ");
        System.out.println("             -----------                         ----------                  ");
        System.out.println("            | Restart > |                       |  Quit >  |                 ");
        System.out.println("             -----------                         ----------                  ");
        System.out.println("             1 (Numpad)                          2 (Numpad)                  ");
        while (controllerChoiceInt != 1 && controllerChoiceInt != 2) {
            this.controllerChoiceInt = sc.nextInt();
            switch (controllerChoiceInt) {
                case 1:
                    gameStart(player1);
                    break;
                case 2:
                    System.out.println("Leaving game...");
                    break;
                case 9:
                    characterSheet.characterSheet(player1);
                    break;
            }
        }
    }
}