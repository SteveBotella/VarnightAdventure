package com.steve;

import actors.Character;
import actors.Npc;
import maps.DungeonVar;
import maps.Game;
import ui.Menu;

import java.sql.SQLException;

/**
 * Manage the application & call classes
 *
 * @author steve
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) throws SQLException {
        Menu menu = new Menu();
        DataBase database = new DataBase();

        database.showAllHeroes();

        Character player1 = null;
        DungeonVar level1 = new DungeonVar();
        Game game = new Game(15, 7, 3, 5, 5, 5, 5, 5, 5, 9 );

        player1 = menu.start();
        if (player1 instanceof Npc) {
            String isNpc;
            if (player1.isNpc()) {
                isNpc = "NPC";
            } else {
                isNpc = "Player";
            }
            System.out.println("You are a " + isNpc + " Character");

        } else {
            System.out.println("You are not a Character");
        }
        level1.gameStart(player1);
    }
}