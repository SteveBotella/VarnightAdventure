package actors;

public class Item extends Usable {
    public Item(String ItemName) {
        setName(ItemName);
        switch (ItemName) {
            case "Health Potion" :
                setHealthBonus(2);
                setUseText(" drink ");
                break;
            case "Mana Potion" :
                setDamageBonus(4);
                setDamageMin((2));
                setUseText(" drink ");
                break;
            default:
                setDamageBonus(0);
                setDamageMin((0));
                setUseText(" hit the target with ");
        }
    }
}