package actors;

public class Weapon extends Usable {

    public Weapon(String WeaponName) {
        setName(WeaponName);
        switch (WeaponName) {
            case "Sword" :
                setDamageBonus(6);
                setDamageMin((4));
                setUseText(" slay the target with ");
                break;
            case "Mace" :
                setDamageBonus(4);
                setDamageMin((2));
                setUseText(" smash the target with ");
                break;
            case "Magic Book" :
                setDamageBonus(3);
                setDamageMin((1));
                setUseText(" cast a spell to the target with ");
                break;
            case "Wand" :
                setDamageBonus(2);
                setDamageMin((2));
                setUseText(" cast a spell to the target with ");
                break;
            case "Handcraft Wand" :
                setDamageBonus(0);
                setDamageMin((0));
                setUseText(" cast a spell to the target with ");
                break;
            case "Handcraft Sword" :
                setDamageBonus(0);
                setDamageMin((0));
                setUseText(" slay the target with ");
                break;
            case "Heavy axe" :
                setDamageBonus(0);
                setDamageMin((0));
                setUseText(" shred the target with ");
                break;
            case "Gobwin dawggewr" :
                setDamageBonus(0);
                setDamageMin((0));
                setUseText(" cut the target with ");
                break;
            default:
                setDamageBonus(0);
                setDamageMin((0));
                setUseText(" hit the target with ");
        }
    }
}
