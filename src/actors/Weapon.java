package actors;

/**
 * Use to create Weapons extends Usable
 *
 * @see Usable
 */
public class Weapon extends Usable {

    /**
     * Base constructor
     *
     * @param WeaponName String Call the weapon parameters by identifying it with a name
     */
    public Weapon(String WeaponName) {
        setName(WeaponName);
        switch (WeaponName) {
            case "Sword" :
                setDamageBonus(6);
                setDamageMin(4);
                setUseText(" slay the target with ");
                setItemEffect("damage");
                break;
            case "Mace" :
                setDamageBonus(4);
                setDamageMin((2));
                setUseText(" smash the target with ");
                setItemEffect("damage");
                break;
            case "Magic Book" :
                setDamageBonus(3);
                setDamageMin((1));
                setUseText(" cast a spell to the target with ");
                setItemEffect("damage");
                break;
            case "Wand" :
                setDamageBonus(2);
                setDamageMin((2));
                setUseText(" cast a spell to the target with ");
                setItemEffect("damage");
                break;
            case "Handcraft Wand" :
                setDamageBonus(0);
                setDamageMin((0));
                setUseText(" cast a spell to the target with ");
                setItemEffect("damage");
                break;
            case "Handcraft Sword" :
                setDamageBonus(0);
                setDamageMin((0));
                setUseText(" slay the target with ");
                setItemEffect("damage");
                break;
            case "Heavy axe" :
                setDamageBonus(0);
                setDamageMin((0));
                setUseText(" shred the target with ");
                setItemEffect("damage");
                break;
            case "Gobwin dawggewr" :
                setDamageBonus(0);
                setDamageMin((0));
                setUseText(" cut the target with ");
                setItemEffect("damage");
                break;
            case "Dragon Strike" :
                setDamageBonus(0);
                setDamageMin(0);
                setUseText(" snatch the target with ");
                setItemEffect("damage");
                break;
            case "Dark Magic" :
                setDamageBonus(0);
                setDamageMin(0);
                setUseText(" cursed the target with ");
                setItemEffect("damage");
            default:
                setDamageBonus(0);
                setDamageMin((0));
                setUseText(" hit the target with ");
                setItemEffect("damage");
        }
    }
}
