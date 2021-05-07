package actors;

import tools.Utils;
import ui.CharacterSheet;

public class Usable {
    private CharacterSheet characterSheet;

    private Utils utils;

    private String name;
    private int number;
    private boolean stackable;
    private int damageBonus;
    private int damageMin;
    private int healthBonus;
    private String useText;

    public Usable() {
        this.name = "";
        this.number = 1;
        this.stackable = false;
        this.damageBonus = 0;
        this.damageMin = 0;
        this.healthBonus = 0;
        this.useText = "";
    }

    public CharacterSheet getCharacterSheet() {
        return characterSheet;
    }

    public void setCharacterSheet(CharacterSheet characterSheet) {
        this.characterSheet = characterSheet;
    }

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

    public String getUseText() {
        return useText;
    }

    public void setUseText(String useText) {
        this.useText = useText;
    }

    public void itemEvent(String eventName, Character player, Character enemy, Usable usable, Utils utils) {
        switch (eventName) {
            case "damage":
                int damageRange = player.getAp() + utils.rollDamage(getDamageMin(), getDamageBonus());
                System.out.println(player.getName() + useText + usable.getName());
                System.out.println(player.getName() + " deal " + damageRange + " to " + enemy.getName());
                enemy.setHp(enemy.getHp() - damageRange);
                break;
            case "health":
                System.out.println(player.getName() + useText + usable.getName());
                System.out.println(player.getName() + " rest " + usable.healthBonus + " HP ");
                player.setHp(player.getHp() + usable.healthBonus);
                if (player.getHp() > player.getMaxHp()) {
                    player.setHp(player.getMaxHp());
                }
                break;
            default:
        }
    }
}
