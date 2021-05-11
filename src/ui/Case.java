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

    // fight system
    public void fight(Character player, Character enemy) {
        int turn = 1;
        while (player.getHp() > 0 && enemy.getHp() > 0) {
            System.out.println("Start Turn " + turn);
            getCharacterSheet().paperSheet(player);
            System.out.println("Versus");
            getCharacterSheet().paperSheet(enemy);
            ;
            this.setSkillChoice(getSc().nextInt());
            switch (getSkillChoice()) {
                case 1:
                    player.getSkillOne().itemEvent("damage", player, enemy, player.getSkillOne(), getUtils());
                    break;
                case 2:
                    player.getSkillTwo().itemEvent("damage", player, enemy, player.getSkillTwo(), getUtils());
                    break;
                case 3:
                    player.getSkillThree().itemEvent("damage", player, enemy, player.getSkillThree(), getUtils());
                    break;
                case 4:
                    player.getSkillFour().itemEvent("health", player, enemy, player.getSkillFour(), getUtils());
                    break;
            }
            getCharacterSheet().paperSheet(enemy);
            System.out.println("Versus");
            getCharacterSheet().paperSheet(player);
            if (enemy.getHp() <= 0) {
                System.out.println(player.getName() + " win the fight !");
                player.setGold(player.getGold() + getUtils().rollGold(enemy));
            } else {
                enemy.getSkillOne().itemEvent("damage", enemy, player, enemy.getSkillOne(), getUtils());
                System.out.println("End Turn " + turn);
                turn++;
                if (player.getHp() <= 0) {
                    System.out.println("Game Over");
                }
            }
        }
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
