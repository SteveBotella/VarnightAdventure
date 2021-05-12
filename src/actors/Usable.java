package actors;

import tools.Utils;
import ui.CharacterSheet;

/**
 * Use this class to create Object that the player can use
 *
 * @see Item
 * @see Weapon
 * @see Spell
 */
public class Usable {
    private CharacterSheet characterSheet;

    /**
     * Call this class to access utilities methods such as dice roll, story telling etc...
     *
     * @see Utils
     */
    private Utils utils;

    /**
     * Usable name displayed
     */
    private String name;

    /**
     * Number in inventory
     */
    private int number;

    /**
     * Tell this usable is stackable or not
     *
     * Use only one slot for carrying potions for example
     */
    private boolean stackable;

    /**
     * Bonus damage to apply
     */
    private int damageBonus;

    /**
     * Minimum bonus damage to apply
     */
    private int damageMin;

    /**
     * Health restored by using this
     */
    private int healthBonus;

    /**
     * Text displayed when a Character using this usable
     *
     * @see Character
     */
    private String useText;

    /**
     * Base constructor
     */
    public Usable() {
        this.name = "";
        this.number = 1;
        this.stackable = false;
        this.damageBonus = 0;
        this.damageMin = 0;
        this.healthBonus = 0;
        this.useText = "";
    }

    /**
     * Call this method to trigger a damage event or healing or another effect
     * @param eventName String Event name to trigger the switch case.
     * @param player Character using this event
     * @param enemy Character targeting by this event
     * @param usable Usable used to display informations like his name in text
     * @param utils Utils As parameter from the class used
     */
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
}
