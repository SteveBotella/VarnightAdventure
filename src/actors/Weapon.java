package actors;

public class Weapon extends Usable {

    public Weapon(String WeaponName) {
        setName(WeaponName);
        switch (WeaponName) {
            case "Sword" :
                setDamageBonus(6);
                setDamageMin((4));
                useText = " slay the target with ";
                break;
            case "Mace" :
                setDamageBonus(4);
                setDamageMin((2));
                useText = " smash the target with ";
                break;
            case "Magic Book" :
                setDamageBonus(3);
                setDamageMin((1));
                useText = " cast a spell to the target with ";
                break;
            case "Wand" :
                setDamageBonus(2);
                setDamageMin((2));
                useText = " cast a spell to the target with ";
                break;
            default:
                setDamageBonus(0);
                setDamageMin((0));
                useText = " hit the target with ";
        }
    }
}
