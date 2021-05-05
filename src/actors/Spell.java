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
            case "Shield Bash" :
                setDamageBonus(2);
                setDamageMin((1));
                useText = " push the target with ";
                break;
            case "Axe throw" :
                setDamageBonus(4);
                setDamageMin((2));
                useText = " throw axe to the target with ";
                break;
            case "Battle Cry" :
                setDamageBonus(0);
                setDamageMin((0));
                useText = " Waaaaaarg !!! with ";
                break;
            case "Wrock throw" :
                setDamageBonus(0);
                setDamageMin((0));
                useText = " throw rock to the target with ";
                break;
            case "Rwun Waway" :
                setDamageBonus(0);
                setDamageMin((0));
                useText = " try to leave the fight with ";
                break;
            case "Whelp" :
                setDamageBonus(0);
                setDamageMin((0));
                useText = " call friends to help screaming : - ";
                break;
            default:
                setDamageBonus(0);
                setDamageMin((0));
                useText = " hit the target with ";
        }
    }
}
