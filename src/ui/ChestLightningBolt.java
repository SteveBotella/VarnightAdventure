package ui;

import actors.Character;
import actors.Spell;

public class ChestLightningBolt extends Case {
    @Override
    public void run(Character player) {
        System.out.println("Chest Lightning Bolt");
        if (player.getArchetype().equals("Mage")) {
            if (player.getSkillTwo().getName().equals("Lightning Bolt")) {
                System.out.println("Already know Lightning Bolt");
            } else {
                player.setSkillTwo(new Spell("Lightning Bolt"));
                System.out.println("You learn Lightning Bolt");
            }
        } else {
            System.out.println("You don't have the mind to learn this spell");
        }
    }
}
