package maps;
//TODO Set this class as parent
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