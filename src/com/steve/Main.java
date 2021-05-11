package com.steve;

import actors.Character;
import maps.DungeonVar;
import maps.Game;
import ui.Menu;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();

        Character player1 = null;
        //DungeonVar level1 = new DungeonVar();
        Game game = new Game(10);

        player1 = menu.start();
        //level1.gameStart(player1);
        game.gameStart(player1, 10);
    }
}