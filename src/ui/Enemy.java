package ui;

import actors.Character;
import tools.Utils;
import ui.CharacterSheet;

import java.util.Scanner;

public class Enemy extends Case {

    Character enemy;

    public Enemy() {
        super();
        this.enemy = null;
    }

    @Override
    public void run(Character player) {
        System.out.println("Enemy");
        this.enemy = new Character("Gobelin", " ", 6, 6, 1, 1, "Gobwin dawggewr", "Wrock throw", "Rwun Waway", "Whelp", 3, 0);
        fight(player, enemy);
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
}
