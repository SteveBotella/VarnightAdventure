package ui;

import actors.Character;
import maps.DungeonVar;
import tools.Utils;

import java.util.Scanner;

public class Room {
    Scanner sc = new Scanner(System.in);
    Utils utils = new Utils();
    CharacterSheet characterSheet = new CharacterSheet();

    int skillChoice = 0;

    public void room(Character player, Character enemy, DungeonVar dungeonVar, String description) {
        System.out.println("     --- " + dungeonVar.getRoomTitle() + " " + ( player.getWorldLocation() + 1) +"  ---     ");
        System.out.println("     " + description + "     ");
        switch (dungeonVar.getRoomArchetype()) {
            case "Corridor":
                utils.logoPeasant();
                break;
            case "Chest":
                utils.logoWarrior();
                break;
            case "Enemy":
                fight(player, enemy);
                break;
            default:
                utils.logoPeasant();
        }
    }

    public void fight(Character player, Character enemy) {
        int turn = 1;
        while (player.getHp() > 0 && enemy.getHp() > 0) {
            System.out.println("Start Turn " + turn);
            characterSheet.characterSheet(player);
            System.out.println("Versus");
            characterSheet.characterSheet(enemy);
            this.skillChoice = sc.nextInt();
            switch (skillChoice) {
                case 1 :
                    player.getSkillOne().itemEvent("damage", player, enemy, player.getSkillOne());
                    break;
                case 2 :
                    player.getSkillTwo().itemEvent("damage", player, enemy, player.getSkillTwo());
                    break;
                case 3 :
                    player.getSkillThree().itemEvent("damage", player, enemy, player.getSkillThree());
                    break;
                case 4 :
                    player.getSkillFour().itemEvent("health",player, enemy, player.getSkillFour());
                    break;
            }
            characterSheet.characterSheet(enemy);
            System.out.println("Versus");
            characterSheet.characterSheet(player);
            if (enemy.getHp() <= 0) {
                System.out.println(player.getName() + " win the fight !");
                player.setGold(player.getGold() + utils.rollDamage(1, 3));
            } else {
                enemy.getSkillOne().itemEvent("damage", enemy, player, enemy.getSkillOne());
                System.out.println("End Turn " + turn);
                turn++;
                if (player.getHp() <= 0) {
                    System.out.println("Game Over");
                }
            }
        }
    }
}