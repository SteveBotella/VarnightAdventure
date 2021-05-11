package ui;

import actors.Character;
import actors.Item;

public class ChestPotion extends Case {

    @Override
    public void run(Character player) {
        System.out.println("Chest potion");
        if (player.getSkillFour().getName().equals("Health Potion")) {
            player.getSkillFour().setNumber((player.getSkillFour().getNumber() + 1));
        } else {
            player.setSkillFour(new Item("Health Potion"));
        }
    }
}
