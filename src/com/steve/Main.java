package com.steve;

import actors.Character;
import maps.DungeonVar;
import tools.Utils;
import ui.Menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();

        Character player1 = null;
        DungeonVar level1 = new DungeonVar();

        player1 = menu.start();
        level1.gameStart(player1);
    }
}