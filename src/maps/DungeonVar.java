package maps;

import actors.Character;
import tools.Utils;
import ui.CharacterSheet;
import ui.Room;

import java.util.Scanner;

public class DungeonVar extends Dungeon {

    boolean event1;
    boolean event2;
    boolean event3;

    public DungeonVar() {
        super();
        this.event1 = true;
        this.event2 = true;
        this.event3 = true;
    }

    @Override
    public void gameStart(Character player) {
        player.setWorldLocation(0);

        getUtils().waitSec(3, true, true);
        getUtils().storyText("-----     CHAPTER I     -----",
                        "-----    Dungeon Var    -----",
                        player,
                        getCharacterSheet(),
                        getControllerChoiceInt(),
                        getSc());

        getUtils().waitSec(1, false, false);
        getUtils().storyText("After many days traveling across the dangerous forest, the lost villages",
                        "and enjoy your rest in 'lovely' Inn...",
                        player,
                        getCharacterSheet(),
                        getControllerChoiceInt(),
                        getSc());

        getUtils().storyText("You prepare yourself to enter...",
                        "!!! The Dungeon Var - No one been return !!!",
                        player,
                        getCharacterSheet(),
                        getControllerChoiceInt(),
                        getSc());

        System.out.println("The sun is falling, night is coming, a cold wind run into your clothes");
        System.out.println("TAn abandoned Castle is front of you. It stink monsters... Or cheese maybe.");

        while (player.getHp() > 0 && player.getWorldLocation() < getN()) {
            getUtils().storyText("You are in level " + (player.getWorldLocation() + 1),
                            "(Roll the dice to move your character inside the dungeon)",
                            player,
                            getCharacterSheet(),
                            getControllerChoiceInt(),
                            getSc());
                    int diceResult = getUtils().rollDice(6);
                    player.setWorldLocation(player.getWorldLocation() + diceResult);

            Character empty = new Character();
            switch (player.getWorldLocation()) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    if (event1) {
                        setRoomArchetype("Enemy");
                        setRoomTitle("Entrance ");
                        Character gobelin = new Character("Gobelin", "Bazakarak", 6, 6, 1, 1, "Gobwin dawggewr", "Wrock throw", "Rwun Waway", "Whelp", 3, 0);
                        Room room1 = new Room();
                        room1.roomRP(player, gobelin, this, "Stinky place... Gobelin : - Koup koup touwa !");
                        event1 = false;
                    } else {
                        defaultRoom(player, empty);
                    }
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    if (event2) {
                        setRoomArchetype("Corridor");
                        setRoomTitle("Corridor to Armory ");
                        Room room2 = new Room();
                        room2.roomRP(player, empty, this, "You ear something strange... : 'WArEwlwLwlwLwLEee !'");
                        event2 = false;
                    } else {
                        defaultRoom(player, empty);
                    }
                    break;
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    if (event3) {
                        setRoomArchetype("Enemy");
                        setRoomTitle("Armory ");
                        Character gobelin1 = new Character("Gobelin", "Kazazouille", 6, 6, 1, 1, "Gobwin dawggewr", "Wrock throw", "Rwun Waway", "Whelp", 3, 0);
                        Room room3 = new Room();
                        room3.roomRP(player, gobelin1, this, "A Goblin is bashing another one lay on the ground. He doesn't see you yet.");
                        event3 = false;
                    } else {
                        defaultRoom(player, empty);
                    }
                    break;
                default:
                    defaultRoom(player, empty);
            }
        }

        player.setWorldLocation(getN());

        Character boss = new Character("Orc Chief", "Zoruk", 12, 12, 2, 2, "Heavy axe", "Shield Bash", "Axe throw", "Battle Cry", 10, 2);

        setRoomArchetype("Enemy");
        setRoomTitle("Dungeon Master ");
        Room roomBoss = new Room();
        roomBoss.roomRP(player, boss, this, "Orc Chief : - Today, you launch in hell ! Waaaarg !");

        player.setWorldLocation(getN());
        if (player.getHp() > 0) {
            System.out.println("You raid the Dungeon succefully");
        }
        setControllerChoiceInt(999);
        System.out.println(" ");
        System.out.println("             -----------                         ----------                  ");
        System.out.println("            | Restart > |                       |  Quit >  |                 ");
        System.out.println("             -----------                         ----------                  ");
        System.out.println("             1 (Numpad)                          2 (Numpad)                  ");
        while (getControllerChoiceInt() != 1 && getControllerChoiceInt() != 2) {
            setControllerChoiceInt(getSc().nextInt());
            switch (getControllerChoiceInt()) {
                case 1:
                    gameStart(player);
                    break;
                case 2:
                    System.out.println("Leaving game...");
                    break;
                case 9:
                    getCharacterSheet().paperSheet(player);
                    break;
            }
        }
    }

    public void defaultRoom(Character player, Character empty) {
        setRoomArchetype("Corridor");
        setRoomTitle("Corridor ");
        Room room = new Room();
        room.roomRP(player, empty, this, "");
    }

    public boolean isEvent1() {
        return event1;
    }

    public void setEvent1(boolean event1) {
        this.event1 = event1;
    }

    public boolean isEvent2() {
        return event2;
    }

    public void setEvent2(boolean event2) {
        this.event2 = event2;
    }

    public boolean isEvent3() {
        return event3;
    }

    public void setEvent3(boolean event3) {
        this.event3 = event3;
    }
}