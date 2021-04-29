package ui;

import actors.Mage;
import actors.Warrior;
import com.steve.Main;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    int controllerChoiceInt = 1;
    String controllerChoiceString = "";

    // Use to display the menu
    public void start() {
        System.out.println("                       uuuuuuu                         ");
        System.out.println("   uuu                 |     |                   uuu   ");
        System.out.println("   | |_u_u_u_WELCOME TO VARNIGHT ADVENTURE_u_u_u_| |   ");
        System.out.println("   |_|_________________|[-|-]|___________________|_|   ");
        System.out.println("                        |   |                          ");
        Main.waitSec(3);
        System.out.println("      ------------------------       -----------       ");
        System.out.println("     | Create a New Character |     | Quit Game |      ");
        System.out.println("      ------------------------       -----------       ");
        System.out.println("            1 (Numpad)               2 (Numpad)        ");
        this.controllerChoiceInt = sc.nextInt();
        System.out.println();
        if (controllerChoiceInt == 1) {
            Main.waitSec(1);
            System.out.println("            --- Character Creation ---             ");
            System.out.println("                 Choose a class :                  ");
            System.out.println("             ---------       --------              ");
            System.out.println("            | Warrior |     |  Mage  |             ");
            System.out.println("             ---------       --------              ");
            System.out.println("            1 (Numpad)      2 (Numpad)             ");
            this.controllerChoiceInt = sc.nextInt();
            if (controllerChoiceInt == 1) {
                Warrior warrior = new Warrior();
                System.out.println("     Choose a name that feel Heroic, with muscles & Raaaaaage !!!               ");
                System.out.println("     (PS : No... DarkSasukeDu69 is not Skilled... But Varnight...)              ");
                System.out.println("     (Any way, take the name you want... But Varnight...)                       ");
                warrior.setName(this.controllerChoiceString = sc.next());
                if (controllerChoiceString != "") {
                    System.out.println("     Once upon a time, in a Far far away Kingdom of peace & love,            ");
                    System.out.println("     Lived a Strong, Proud & Honorable Family !                              ");
                    System.out.println("             ----------                                                      ");
                    System.out.println("            |   Next > |                                                     ");
                    System.out.println("             ----------                                                      ");
                    System.out.println("             0 (Numpad)                                                      ");
                }
                this.controllerChoiceInt = sc.nextInt();
                if (controllerChoiceInt == 0) {
                    System.out.println("     They worked hard on day and enjoy their life at night...                ");
                    System.out.println("     So... One day comes a new born                                          ");
                    System.out.println("             ----------                                                      ");
                    System.out.println("            |   Next > |                                                     ");
                    System.out.println("             ----------                                                      ");
                    System.out.println("             0 (Numpad)                                                      ");
                }
                this.controllerChoiceInt = sc.nextInt();
                if (controllerChoiceInt == 0) {
                    System.out.println("     Likes his Dad he was Proud, likes her Mother he was Strong !            ");
                    System.out.println("     Likes his family, he was Honorable...                                   ");
                    System.out.println("             ----------                                                      ");
                    System.out.println("            |   Next > |                                                     ");
                    System.out.println("             ----------                                                      ");
                    System.out.println("             0 (Numpad)                                                      ");
                }
                this.controllerChoiceInt = sc.nextInt();
                if (controllerChoiceInt == 0) {
                    System.out.println("     And here he comes ! Today is a great day to raid Dungeons & burn Villages !");
                    System.out.println("     Here comes... The WARRIOR !!!                                              ");
                    System.out.println("     We call him :                                                              ");
                    System.out.println("               --- " + warrior.getName() + " !!! ---                            ");
                }
                System.out.println("     (Now you can use the 9 Numpad input to display your Character Sheet         ");
                System.out.println("     (Try it now : )                                                             ");
                this.controllerChoiceInt = sc.nextInt();
                if (controllerChoiceInt == 9) {
                    warrior.characterSheet();
                }
            } else if (controllerChoiceInt == 2) {
                Mage mage = new Mage();
                System.out.println("     Choose a name that feel Heroic, with muscles & Raaaaaage !!!               ");
                System.out.println("     (PS : No... DarkSasukeDu69 is not Skilled... But Varnight...)              ");
                System.out.println("     (Any way, take the name you want... But Varnight...)                       ");
                mage.setName(this.controllerChoiceString = sc.next());
                if (controllerChoiceString != "") {
                    System.out.println("     Once upon a time, in a Far far away Kingdom of peace & love,            ");
                    System.out.println("     Lived a Strong, Proud & Honorable Family !                              ");
                    System.out.println("             ----------                                                      ");
                    System.out.println("            |   Next > |                                                     ");
                    System.out.println("             ----------                                                      ");
                    System.out.println("             0 (Numpad)                                                      ");
                }
                this.controllerChoiceInt = sc.nextInt();
                if (controllerChoiceInt == 0) {
                    System.out.println("     They worked hard on day and enjoy their life at night...                ");
                    System.out.println("     So... One day comes a new born                                          ");
                    System.out.println("             ----------                                                      ");
                    System.out.println("            |   Next > |                                                     ");
                    System.out.println("             ----------                                                      ");
                    System.out.println("             0 (Numpad)                                                      ");
                }
                this.controllerChoiceInt = sc.nextInt();
                if (controllerChoiceInt == 0) {
                    System.out.println("     Likes his Dad he was Proud, likes her Mother he was Strong !            ");
                    System.out.println("     Likes his family, he was Honorable...                                   ");
                    System.out.println("             ----------                                                      ");
                    System.out.println("            |   Next > |                                                     ");
                    System.out.println("             ----------                                                      ");
                    System.out.println("             0 (Numpad)                                                      ");
                }
                this.controllerChoiceInt = sc.nextInt();
                if (controllerChoiceInt == 0) {
                    System.out.println("     And here he comes ! Today is a great day to raid Dungeons & burn Villages !");
                    System.out.println("     Here comes... The WARRIOR !!!                                              ");
                    System.out.println("     We call him :                                                              ");
                    System.out.println("               --- " + mage.getName() + " !!! ---                            ");
                }
                System.out.println("     (Now you can use the 9 Numpad input to display your Character Sheet         ");
                System.out.println("     (Try it now : )                                                             ");
                this.controllerChoiceInt = sc.nextInt();
                if (controllerChoiceInt == 9) {
                    mage.characterSheet();
                }

            }
        } if (controllerChoiceInt == 2){
            System.out.println("                     Quit Game                     ");
            System.exit(0);
        }
    }
}
