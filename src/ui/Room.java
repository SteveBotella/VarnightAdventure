package ui;

import actors.Character;
import maps.DungeonVar;
import tools.Utils;

import java.util.Scanner;

public class Room {
    private Scanner sc;
    private Utils utils;
    private CharacterSheet characterSheet;

    private int skillChoice;

    // Constructor
    public Room() {
        this.sc = new Scanner(System.in);
        this.utils = new Utils();
        this.characterSheet = new CharacterSheet();
    }

    // Story room
    public void roomRP(Character player, Character enemy, DungeonVar dungeonVar, String description) {
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

    // Random room
    public void roomRand(Character player, DungeonVar dungeonVar, String description) {
        System.out.println("     --- " + dungeonVar.getRoomTitle() + " " + ( player.getWorldLocation() + 1) +"  ---     ");
        System.out.println("     " + description + "     ");
        int randRoom = (int)(Math.random()*3+1);
        switch (randRoom) {
            case 1 :
                dungeonVar.setRoomArchetype("Corridor");
                dungeonVar.setRoomTitle(" Corridor ");
                break;
            case 2 :
                dungeonVar.setRoomArchetype("Chest");
                dungeonVar.setRoomTitle("You find a Chest and earn some Gold");
                int goldFound = (int)(Math.random()*6+2);
                player.setGold(player.getGold() + goldFound);
                break;
            case 3:
                dungeonVar.setRoomArchetype("Enemy");
                Character gobelin = new Character("Gobelin", " ", 6, 6, 1, 1, "Gobwin dawggewr", "Wrock throw", "Rwun Waway", "Whelp", 3, 0);
                fight(player, gobelin);
                break;
        }
    }

    // fight system
    public void fight(Character player, Character enemy) {
        int turn = 1;
        while (player.getHp() > 0 && enemy.getHp() > 0) {
            System.out.println("Start Turn " + turn);
            characterSheet.paperSheet(player);
            System.out.println("Versus");
            characterSheet.paperSheet(enemy);;
            this.skillChoice = sc.nextInt();
            switch (skillChoice) {
                case 1 :
                    player.getSkillOne().itemEvent(player.getSkillOne().getItemEffect(), player, enemy, player.getSkillOne(), utils);
                    break;
                case 2 :
                    player.getSkillTwo().itemEvent(player.getSkillTwo().getItemEffect(), player, enemy, player.getSkillTwo(), utils);
                    break;
                case 3 :
                    player.getSkillThree().itemEvent(player.getSkillThree().getItemEffect(), player, enemy, player.getSkillThree(), utils);
                    break;
                case 4 :
                    player.getSkillFour().itemEvent(player.getSkillFour().getItemEffect(), player, enemy, player.getSkillFour(), utils);
                    break;
            }
            characterSheet.paperSheet(enemy);
            System.out.println("Versus");
            characterSheet.paperSheet(player);
            if (enemy.getHp() <= 0) {
                System.out.println(player.getName() + " win the fight !");
                player.setGold(player.getGold() + utils.rollGold(enemy));
            } else {
                enemy.getSkillOne().itemEvent("damage", enemy, player, enemy.getSkillOne(), utils);
                System.out.println("End Turn " + turn);
                turn++;
                if (player.getHp() <= 0) {
                    System.out.println("Game Over");
                }
            }
        }
    }
}