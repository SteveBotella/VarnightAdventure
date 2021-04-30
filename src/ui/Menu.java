package ui;

import actors.Mage;
import actors.Warrior;
import tools.Utils;

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
        Utils.waitSec(3, true, true);
        System.out.println("      ------------------------       -----------       ");
        System.out.println("     | Create a New Character |     | Quit Game |      ");
        System.out.println("      ------------------------       -----------       ");
        System.out.println("            1 (Numpad)               2 (Numpad)        ");
        this.controllerChoiceInt = sc.nextInt();
        System.out.println();
        if (controllerChoiceInt == 1) {
            Utils.waitSec(1, false, false);
            System.out.println("            --- Character Creation ---             ");
            System.out.println("                 Choose a class :                  ");
            System.out.println("             ---------       --------              ");
            System.out.println("            | Warrior |     |  Mage  |             ");
            System.out.println("             ---------       --------              ");
            System.out.println("            1 (Numpad)      2 (Numpad)             ");
            this.controllerChoiceInt = sc.nextInt();
            if (controllerChoiceInt == 1) {
                Warrior warriorP1 = new Warrior();
                System.out.println("     Choose a name that feel Heroic, with muscles & Raaaaaage !!!               ");
                System.out.println("     (PS : No... DarkSasukeDu69 is not Skilled... But Varnight...)              ");
                System.out.println("     (Any way, take the name you want... But Varnight...)                       ");
                warriorP1.setName(this.controllerChoiceString = sc.next());
                if (controllerChoiceString != "") {
                    Utils.storyText("Once upon a time, in a Far far away Kingdom of peace & love,",
                                    "Lived a Strong, Proud & Honorable Family !" );
                }
                this.controllerChoiceInt = sc.nextInt();
                if (controllerChoiceInt == 0) {
                    Utils.storyText("They worked hard on day and enjoy their life at night...",
                                    "So... One day comes a new born" );
                }
                this.controllerChoiceInt = sc.nextInt();
                if (controllerChoiceInt == 0) {
                    Utils.storyText("Likes his Dad he was Proud, likes his Mother he was Strong !",
                                    "Likes his family, he was Honorable..." );
                }
                this.controllerChoiceInt = sc.nextInt();
                if (controllerChoiceInt == 0) {
                    System.out.println("     And here he comes ! Today is a great day to raid Dungeons & burn Villages !");
                    System.out.println("     Here comes... The WARRIOR !!!                                              ");
                    System.out.println("     We call him :                                                              ");
                    System.out.println("               --- " + warriorP1.getName() + " !!! ---                            ");
                }
                System.out.println("     (Now you can use the 9 Numpad input to display your Character Sheet         ");
                System.out.println("     (Try it now : )                                                             ");
                this.controllerChoiceInt = sc.nextInt();
                if (controllerChoiceInt == 9) {
                    warriorP1.characterSheet();
                }
            } else if (controllerChoiceInt == 2) {
                Mage mageP1 = new Mage();
                System.out.println("     Choose a name that feel Magic, with brains & Spirit !!!               ");
                System.out.println("     (PS : No... DarkSasukeDu69 is not Skilled... But Varmagus...)              ");
                System.out.println("     (Any way, take the name you want... But Varmagus...)                       ");
                mageP1.setName(this.controllerChoiceString = sc.next());
                if (controllerChoiceString != "") {
                    Utils.storyText("Once upon a time, in a Far far away Kingdom of peace & love,",
                                    "Lived a Clever, Virtuous & Noble Family !" );
                }
                this.controllerChoiceInt = sc.nextInt();
                if (controllerChoiceInt == 0) {
                    Utils.storyText("They learn all about magic on day and enjoy their life at night...",
                                    "So... One day comes a new born" );
                }
                this.controllerChoiceInt = sc.nextInt();
                if (controllerChoiceInt == 0) {
                    Utils.storyText("Likes his Dad he was Virtuous, likes his Mother he was Clever !",
                                    "Likes his family, he was Noble..." );
                }
                this.controllerChoiceInt = sc.nextInt();
                if (controllerChoiceInt == 0) {
                    System.out.println("     And here he comes ! Today is a great day to spell Love Filter & summon Deamons !");
                    System.out.println("     Here comes... The Mage !!!                                              ");
                    System.out.println("     We call him :                                                              ");
                    System.out.println("               --- " + mageP1.getName() + " !!! ---                            ");
                }
                System.out.println("     (Now you can use the 9 Numpad input to display your Character Sheet         ");
                System.out.println("     (Try it now : )                                                             ");
                this.controllerChoiceInt = sc.nextInt();
                if (controllerChoiceInt == 9) {
                    mageP1.characterSheet();
                }
            }
        } if (controllerChoiceInt == 2){
            tools.Utils.exitGame();
            this.controllerChoiceInt = sc.nextInt();
            if (controllerChoiceInt == 1) {
                System.exit(0);
            } else if (controllerChoiceInt == 2){
            }
        }
    }
}
