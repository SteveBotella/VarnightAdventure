package actors;

public class Warrior extends Character {

    public Warrior() {
        this.name = getName();
        setArchetype("Warrior");
        setHp(5);
        setMaxHp(10);
        setAp(5);
        setMaxAp(10);
        setSkillOne("John Cenaaaa !!!");
        setSkillTwo("Patate de forain");
        setSkillThree("Coup de tête balayette manchette");
        setSkillFour("Leeeroyyyy JENKINS !!!");
    }
}
