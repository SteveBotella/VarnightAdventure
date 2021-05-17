package com.steve;

import actors.Character;
import maps.DungeonVar;
import maps.Game;
import ui.Menu;

/**
 * Manage the application & call classes
 *
 * @author steve
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();

        Character player1 = null;
        DungeonVar level1 = new DungeonVar();
        Game game = new Game(15, 7, 3, 5, 5, 5, 5, 5, 5, 9 );

        player1 = menu.start();
        //level1.gameStart(player1);
        game.gameStart(player1);
    }
}