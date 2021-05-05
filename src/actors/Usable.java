package actors;

import tools.Utils;
import ui.CharacterSheet;

public abstract class Usable {
    CharacterSheet characterSheet = new CharacterSheet();

    Utils utils = new Utils();

    String name;
    int number = 1;
    boolean stackable = false;
    int damageBonus;
    int damageMin;
    int healthBonus;
    String useText;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isStackable() {
        return stackable;
    }

    public void setStackable(boolean stackable) {
        this.stackable = stackable;
    }

    public int getHealthBonus() {
        return healthBonus;
    }

    public void setHealthBonus(int healthBonus) {
        this.healthBonus = healthBonus;
    }

    public int getDamageBonus() {
        return damageBonus;
    }

    public void setDamageBonus(int damageBonus) {
        this.damageBonus = damageBonus;
    }

    public int getDamageMin() {
        return damageMin;
    }

    public void setDamageMin(int damageMin) {
        this.damageMin = damageMin;
    }

    public void damage(Character player, Character enemy) {
        int damageRange = player.getAp() + utils.rollDamage(getDamageMin(), getDamageBonus());
        System.out.println(player.getName() + useText + player.getSkillOne().getName());
        System.out.println(player.getName() + " deal " + damageRange + " to " + enemy.getName());
        enemy.setHp(enemy.getHp() - damageRange);
    }
}
