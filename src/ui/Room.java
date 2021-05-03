package ui;

import java.util.Scanner;

import maps.DungeonVar;
import tools.Utils;
import actors.Character;

public class Room {
    Scanner sc = new Scanner(System.in);
    Utils utils = new Utils();
    CharacterSheet characterSheet = new CharacterSheet();

    int skillChoice = 0;

    public void room(Character player, Character enemy, DungeonVar dungeonVar) {
        System.out.println("     --- " + dungeonVar.getRoomTitle() + " " + ( player.getWorldLocation() + 1) +"  ---     ");
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
            characterSheet.characterSheet(player);
            System.out.println("Versus");
            characterSheet.characterSheet(enemy);
            this.skillChoice = sc.nextInt();
            switch (skillChoice) {
                case 1 :
                    System.out.println(player + " use " + player.getSkillOne());
                    break;
                case 2 :
                    System.out.println(player + " use " + player.getSkillTwo());
                    break;
                case 3 :
                    System.out.println(player + " use " + player.getSkillThree());
                    break;
                case 4 :
                    System.out.println(player + " use " + player.getSkillFour());
                    break;
            }
            System.out.println(player + " attack " + " and deal " + player.getAp() + " to " + enemy);
            enemy.setHp(enemy.getHp() - player.getAp());
            characterSheet.characterSheet(enemy);
            System.out.println("Versus");
            characterSheet.characterSheet(player);
            if (enemy.getHp() <= 0) {
                System.out.println(player + " win the fight !");
            } else {
                System.out.println(enemy + " attack " + " and deal " + enemy.getAp() + " to " + player);
                player.setHp(player.getHp() - enemy.getAp());
                System.out.println("End Turn " + turn);
                turn++;
                if (player.getHp() <= 0) {
                    System.out.println("Game Over");
                }
            }
        }
    }
}
