package actors;

public class Spell extends Usable {

    public Spell(String SpellName) {
        setName(SpellName);
        switch (SpellName) {
            case "Fireball" :
                setDamageBonus(6);
                setDamageMin((4));
                useText = " burn the target with ";
                break;
            case "Lightning Bolt" :
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
