package maps;

import actors.Character;
import tools.Utils;
import ui.CharacterSheet;
import ui.Room;

import java.util.Scanner;

public class Dungeon {
    private Utils utils;
    private CharacterSheet characterSheet;

    private Scanner sc;
    private int controllerChoiceInt;
    private String controllerChoiceString;

    private int N;
    private Room room;

    private String roomArchetype = "Corridor";
    private String roomTitle = "empty";

    public Dungeon() {
        this.utils = new Utils();
        this.characterSheet = new CharacterSheet();
        this.sc = new Scanner(System.in);
        this.controllerChoiceInt = 1;
        this.controllerChoiceString = "";
        this.N = 19;
        this.room = new Room();
    }

    public Dungeon(Utils utils, CharacterSheet characterSheet, Scanner sc, int controllerChoiceInt, String controllerChoiceString, int N, Room room ) {
        this.utils = utils;
        this.characterSheet = characterSheet;
        this.sc = sc;
        this.controllerChoiceInt = controllerChoiceInt;
        this.controllerChoiceString = controllerChoiceString;
        this.N = 19;
        this.room = room;
    }

    public Utils getUtils() {
        return utils;
    }

    public void setUtils(Utils utils) {
        this.utils = utils;
    }

    public CharacterSheet getCharacterSheet() {
        return characterSheet;
    }

    public void setCharacterSheet(CharacterSheet characterSheet) {
        this.characterSheet = characterSheet;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int getControllerChoiceInt() {
        return controllerChoiceInt;
    }

    public void setControllerChoiceInt(int controllerChoiceInt) {
        this.controllerChoiceInt = controllerChoiceInt;
    }

    public String getControllerChoiceString() {
        return controllerChoiceString;
    }

    public void setControllerChoiceString(String controllerChoiceString) {
        this.controllerChoiceString = controllerChoiceString;
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

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
    }
}