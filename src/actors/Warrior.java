package actors;

public class Warrior extends Character {

    public Warrior() {
        this.name = getName();
        setArchetype("Warrior");
        setHp(5);
        setMaxHp(10);
        setAp(5);
        setMaxAp(10);
        setSkillOne("Bare Hands");
        setSkillTwo("Empty");
        setSkillThree("Empty");
        setSkillFour("Empty");
    }
}
