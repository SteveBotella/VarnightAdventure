package actors;

public class Item extends Usable {
    public Item(String ItemName) {
        setName(ItemName);
        switch (ItemName) {
            case "Health Potion" :
                setHealthBonus(2);
                useText = " drink ";
                break;
            case "Mana Potion" :
                setDamageBonus(4);
                setDamageMin((2));
                useText = " drink ";
                break;
            default:
                setDamageBonus(0);
                setDamageMin((0));
                useText = " hit the target with ";
        }
    }
}
