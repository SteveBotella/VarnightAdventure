package ui;

import actors.Character;
import actors.*;
import com.steve.DataBase;
import tools.Utils;

import java.util.Scanner;

public class Menu {
    private Scanner sc;
    private int controllerChoiceInt;
    private String controllerChoiceString;
    private Boolean scB;

    private Utils utils;
    private DataBase dataBase;

    private Character player1;
    private CharacterSheet characterSheet;

    public Menu() {
        this.utils = new Utils();
        this.sc = new Scanner(System.in);
        this.controllerChoiceInt = 1;
        this.controllerChoiceString = "";
        this.player1 = new Character();
        this.characterSheet = new CharacterSheet();
        this.scB = false;
        this.dataBase = new DataBase();
    }

    // Use to display the menu
    public Character start() {
        System.out.println("                       uuuuuuu                         ");
        System.out.println("   uuu                 |     |                   uuu   ");
        System.out.println("   | |_u_u_u_WELCOME TO VARNIGHT ADVENTURE_u_u_u_| |   ");
        System.out.println("   |_|_________________|[-|-]|___________________|_|   ");
        System.out.println("                        |   |                          ");
        utils.waitSec(3, true, true);
        createCharacter();
        return player1;
    }

    // Character Creation Menu
    public void createCharacter() {
        System.out.println("      ------------------------       -----------       ");
        System.out.println("     | Create a New Character |     | Quit Game |      ");
        System.out.println("      ------------------------       -----------       ");
        System.out.println("            1 (Numpad)               2 (Numpad)        ");
        boolean inputNotNull = true;
        while (inputNotNull) {
            try {
                controllerChoiceInt = sc.nextInt();
                inputNotNull = false;
            }
            catch (Exception e) {
                System.out.println("Choose an answer");
                sc.nextLine();
            }
        }
        System.out.println();
        if (controllerChoiceInt == 1) {
            utils.waitSec(1, false, false);
            System.out.println("            --- Character Creation ---             ");
            System.out.println("                 Choose a class :                  ");
            System.out.println("             ---------       --------              ");
            System.out.println("            | Warrior |     |  Mage  |             ");
            System.out.println("             ---------       --------              ");
            System.out.println("            1 (Numpad)      2 (Numpad)             ");
            controllerChoiceInt = sc.nextInt();
            if (controllerChoiceInt == 1) {
                player1 = new Warrior();
                player1.setSkillOne(new Weapon("Handcraft Sword"));
                player1.setSkillFour(new Item("Health Potion"));
                System.out.println("     Choose a name that feel Heroic, with muscles & Raaaaaage !!!               ");
                System.out.println("     (PS : No... DarkSasukeDu69 is not Skilled... But Varnight...)              ");
                System.out.println("     (Any way, take the name you want... But Varnight...)                       ");
                player1.setName(controllerChoiceString = sc.next());
                utils.storyText("Once upon a time, in a Far far away Kingdom of peace & love,",
                        "Lived a Strong, Proud & Honorable Family !",
                        player1,
                        characterSheet,
                        controllerChoiceInt,
                        sc);
                utils.storyText("They worked hard on day and enjoy their life at night...",
                        "So... One day comes a new born",
                        player1,
                        characterSheet,
                        controllerChoiceInt,
                        sc);
                utils.storyText("Likes his Dad he was Proud, likes his Mother he was Strong !",
                        "Likes his family, he was Honorable...",
                        player1,
                        characterSheet,
                        controllerChoiceInt,
                        sc);
                System.out.println("     And here he comes ! Today is a great day to raid Dungeons & burn Villages !");
                System.out.println("     Here comes... The WARRIOR !!!                                              ");
                System.out.println("     We call him :                                                              ");
                System.out.println("               --- " + player1.getName() + " !!! ---                            ");
                dataBase.saveHero(player1);

            } else if (controllerChoiceInt == 2) {
                player1 = new Mage();
                player1.setSkillOne(new Weapon("Handcraft Wand"));
                player1.setSkillFour(new Item("Health Potion"));
                System.out.println("     Choose a name that feel Magic, with brains & Spirit !!!               ");
                System.out.println("     (PS : No... DarkSasukeDu69 is not Skilled... But Varmagus...)              ");
                System.out.println("     (Any way, take the name you want... But Varmagus...)                       ");
                player1.setName(controllerChoiceString = sc.next());
                utils.storyText("Once upon a time, in a Far far away Kingdom of peace & love,",
                        "Lived a Clever, Virtuous & Noble Family !",
                        player1,
                        characterSheet,
                        controllerChoiceInt,
                        sc);
                utils.storyText("They learn all about magic on day and enjoy their life at night...",
                        "So... One day comes a new born",
                        player1,
                        characterSheet,
                        controllerChoiceInt,
                        sc);
                utils.storyText("Likes his Dad he was Virtuous, likes his Mother he was Clever !",
                        "Likes his family, he was Noble...",
                        player1,
                        characterSheet,
                        controllerChoiceInt,
                        sc);
                System.out.println("     And here he comes ! Today is a great day to spell Love Filter & summon Deamons !");
                System.out.println("     Here comes... The Mage !!!                                              ");
                System.out.println("     We call him :                                                              ");
                System.out.println("               --- " + player1.getName() + " !!! ---                            ");
            }

            System.out.println("     (Now you can use the 9 Numpad input to display your Character Sheet         ");
            System.out.println("     (Try it now : )                                                             ");
            controllerChoiceInt = sc.nextInt();
            if (controllerChoiceInt == 9) {
                characterSheet.paperSheet(player1);
            }

        } else if (controllerChoiceInt == 2) {
            utils.exitGame();
            this.controllerChoiceInt = sc.nextInt();
            if (controllerChoiceInt == 1) {
                System.exit(0);
            } else if (controllerChoiceInt == 2) {
                start();
            }
        }
    }
}
