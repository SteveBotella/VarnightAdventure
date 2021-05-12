package ui;

import actors.Character;
import actors.Spell;

public class ChestFireball extends Case {
    @Override
    public void run(Character player){
        System.out.println("Chest Fireball");
        if (player.getSkillThree().getName().equals("Fireball")) {
            System.out.println("Already know Fireball");
        } else {
            player.setSkillThree(new Spell("Fireball"));
            System.out.println("You learn Fireball");
        }
    }
}
