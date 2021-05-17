package ui;

import actors.Character;
import actors.Weapon;

public class ChestSword extends Case {
    @Override
    public void run(Character player) {
        if (player.getArchetype().equals("Warrior")) {
            System.out.println("Chest Sword");
            if (player.getSkillOne().getName().equals("Sword")) {
                System.out.println("Already got a sword");
            } else {
                player.setSkillOne(new Weapon("Sword"));
                System.out.println("You take the Sword");
            }
        } else {
            System.out.println("You don't have enough muscles to use this weapon");
        }
    }
}
