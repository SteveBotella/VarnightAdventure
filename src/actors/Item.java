package actors;

public class Item extends Usable {
    public Item(String ItemName) {
        setName(ItemName);
        switch (ItemName) {
            case "Health Potion" :
                setDamageBonus(6);
                setDamageMin((4));
                useText = " burn the target with ";
                break;
            case "Mana Potion" :
                setDamageBonus(4);
                setDamageMin((2));
                useText = " blast the target with ";
                break;
            default:
                setDamageBonus(0);
                setDamageMin((0));
                useText = " hit the target with ";
        }
    }
}
