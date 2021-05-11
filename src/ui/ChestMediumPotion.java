package ui;

import actors.Character;
import actors.Item;

public class ChestMediumPotion extends Case{
    @Override
    public void run(Character player) {
        System.out.println("Chest Medium Potion");
        if (player.getSkillFour().getName().equals("Health Medium Potion")) {
            player.getSkillFour().setNumber((player.getSkillFour().getNumber() + 1));
        } else {
            player.setSkillFour(new Item("Health Medium Potion"));
        }
    }
}
