package actors;

/**
 * Use to create Items extends Usable
 *
 * @see Usable
 */
public class Item extends Usable {

    /**
     * Base constructor
     *
     * @param ItemName String Call the item parameters by identifying it with a name
     */
    public Item(String ItemName) {
        setName(ItemName);
        switch (ItemName) {
            case "Health Potion" :
                setHealthBonus(2);
                setUseText(" drink ");
                setItemEffect("health");
                break;
            case "Health Medium Potion" :
                setHealthBonus(5);
                setUseText(" drink ");
                setItemEffect("health");
                break;
            case "Mana Potion" :
                setDamageBonus(4);
                setDamageMin((2));
                setUseText(" drink ");
                setItemEffect("mana");
                break;
            default:
                setDamageBonus(0);
                setDamageMin((0));
                setUseText(" hit the target with ");
                setItemEffect("damage");
        }
    }
}