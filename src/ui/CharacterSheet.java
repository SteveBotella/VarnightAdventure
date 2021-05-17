package ui;

import actors.Character;
import tools.Utils;

public class CharacterSheet {
    private Utils utils;

    public CharacterSheet() {
        utils = new Utils();
    }

    public void paperSheet(Character player) {
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
        System.out.println("  Gold : " + player.getGold());
        System.out.println("     ---------------     ");
        System.out.println("  Slot1 : " + player.getSkillOne().getName());
        System.out.println("  Slot2 : " + player.getSkillTwo().getName());
        System.out.println("  Slot3 : " + player.getSkillThree().getName());
        System.out.println("  Slot4 : " + player.getSkillFour().getName() + " : " + player.getSkillFour().getNumber());
        System.out.println("     ---------------     ");
    }
}
