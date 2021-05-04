package actors;

public class Mage extends Character {

    public Mage() {
        this.name = getName();
        setArchetype("Mage");
        setHp(3);
        setMaxHp(6);
        setAp(8);
        setMaxAp(15);
        getSkillOne().setName("Spell Book");
        getSkillTwo().setName("Empty");
        getSkillThree().setName("Empty");
        getSkillFour().setName("Empty");
    }
}
