package com.steve;

import ui.Menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        menu.start();

    }

    // Call a loading event for 3 secondes
    public static void waitSec(int second) {
        try
        {
            System.out.println();
            System.out.print("Loading ");
            for (int i = 0; i < second; i++) {;
                Thread.sleep(1000);
                System.out.print(". ");
            }
            System.out.println();
            System.out.println();
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
