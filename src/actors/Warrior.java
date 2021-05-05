package actors;

public class Warrior extends Character {

    public Warrior() {
        this.name = getName();
        setArchetype("Warrior");
        setHp(5);
        setMaxHp(10);
        setAp(5);
        setMaxAp(10);
        getSkillOne().setName("Bare Hands");
        getSkillTwo().setName("Bare Hands");
        getSkillThree().setName("Bare Hands");
        getSkillFour().setName("Bare Hands");
    }
}
