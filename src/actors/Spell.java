package actors;

public class Spell extends Usable {

    public Spell(String SpellName) {
        setName(SpellName);
        switch (SpellName) {
            case "Fireball" :
                setDamageBonus(6);
                setDamageMin((4));
                setUseText(" burn the target with ");
                break;
            case "Lightning Bolt" :
                setDamageBonus(4);
                setDamageMin((2));
                setUseText(" blast the target with ");
                break;
            case "Shield Bash" :
                setDamageBonus(2);
                setDamageMin((1));
                setUseText(" push the target with ");
                break;
            case "Axe throw" :
                setDamageBonus(4);
                setDamageMin((2));
                setUseText(" throw axe to the target with ");
                break;
            case "Battle Cry" :
                setDamageBonus(0);
                setDamageMin((0));
                setUseText(" Waaaaaarg !!! with ");
                break;
            case "Wrock throw" :
                setDamageBonus(0);
                setDamageMin((0));
                setUseText(" throw rock to the target with ");
                break;
            case "Rwun Waway" :
                setDamageBonus(0);
                setDamageMin((0));
                setUseText(" try to leave the fight with ");
                break;
            case "Whelp" :
                setDamageBonus(0);
                setDamageMin((0));
                setUseText(" call friends to help screaming : - ");
                break;
            default:
                setDamageBonus(0);
                setDamageMin((0));
                setUseText(" hit the target with ");
        }
    }
}
