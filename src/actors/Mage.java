package actors;

public class Mage extends Character {

    public Mage() {
        this.name = getName();
        setArchetype("Mage");
        setHp(3);
        setMaxHp(6);
        setAp(8);
        setMaxAp(15);
        setSkillOne("Staff");
        setSkillTwo("Empty");
        setSkillThree("Empty");
        setSkillFour("Empty");
    }
}
