package ui;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    int controllerChoice = 1;

    // Use to display the menu
    public void start() {
        System.out.println("                    uuuuuuu                      ");
        System.out.println("uuu                 |     |                   uuu");
        System.out.println("| |_u_u_u_WELCOME TO VARNIGHT ADVENTURE_u_u_u_| |");
        System.out.println("|_|_________________|[-|-]|___________________|_|");
        System.out.println("                     |   |                       ");
        waitSec();
        System.out.println(" ------------------------     -----------  ");
        System.out.println("| Create a New Character |   | Quit Game | ");
        System.out.println(" ------------------------     -----------  ");
        System.out.println("       1 (Numpad)             2 (Numpad)   ");
        this.controllerChoice = sc.nextInt();
        System.out.println();
        if (controllerChoice == 1) {
            System.out.println("A New Character is born");
        } if (controllerChoice == 2){
            System.out.println("Quit Game");
            System.exit(0);
        }
    }

    // Call a loading event for 3 secondes
    private void waitSec() {
        try
        {
            System.out.println();
            System.out.print("Loading ");
            Thread.sleep(1000);
            System.out.print(". ");
            Thread.sleep(1000);
            System.out.print(". ");
            Thread.sleep(1000);
            System.out.print(". ");
            System.out.println();
            System.out.println();
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
