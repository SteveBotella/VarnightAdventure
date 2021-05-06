package maps;
//TODO Set this class as parent
import actors.Character;
import tools.Utils;
import ui.CharacterSheet;
import ui.Room;

import java.util.Scanner;

public class Dungeon {
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

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public void gameStart(Character player1) {
        player1.setWorldLocation(0);

        while (player1.getHp() > 0 && player1.getWorldLocation() < N) {
            utils.storyText("You are in level " + (player1.getWorldLocation() + 1),
                    "(Roll the dice to move your character inside the dungeon)",
                    player1,
                    characterSheet);
            int diceResult = utils.rollDice(6);
            player1.setWorldLocation(player1.getWorldLocation() + diceResult);
            room.roomRand(player1, this, "");
        }

        player1.setWorldLocation(N);

        Character boss = new Character();

        // Final Level
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