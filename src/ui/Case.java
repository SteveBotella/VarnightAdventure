package ui;

import tools.Utils;
import actors.Character;
import maps.DungeonVar;

import java.util.Scanner;

public abstract class Case {
    private Scanner sc;
    private Utils utils;
    private CharacterSheet characterSheet;
    private Character player;
    private int skillChoice;

    public Case() {
        this.sc = new Scanner(System.in);
        this.utils = new Utils();
        this.characterSheet = new CharacterSheet();
        this.skillChoice = 999;
    }

    public void run(Character player) {
        System.out.println("");
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
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

    public Character getPlayer() {
        return player;
    }

    public void setPlayer(Character player) {
        this.player = player;
    }

    public int getSkillChoice() {
        return skillChoice;
    }

    public void setSkillChoice(int skillChoice) {
        this.skillChoice = skillChoice;
    }
}
