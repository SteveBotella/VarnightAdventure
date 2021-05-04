package ui;

import actors.Character;
import tools.Utils;

public class CharacterSheet {
    Utils utils = new Utils();

    public void characterSheet(Character player) {
        System.out.println("     --- " + player.getArchetype() + " ---     ");
        switch (player.getArchetype()) {
            case "Peasant":
                utils.logoPeasant();
                break;
            case "Warrior":
                utils.logoWarrior();
                break;
            case "Mage":
                utils.logoMage();
                break;
            default:
        }
        System.out.println("  Name : " + player.getName());
        System.out.println("  HP : " + player.getHp());
        System.out.println("  AP : " + player.getAp());
        System.out.println("     ---------------     ");
        System.out.println("  Slot1 : " + player.getSkillOne());
        System.out.println("  Slot2 : " + player.getSkillTwo());
        System.out.println("  Slot3 : " + player.getSkillThree());
        System.out.println("  Slot4 : " + player.getSkillFour());
        System.out.println("     ---------------     ");
    }
}
