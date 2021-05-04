package actors;

import tools.Utils;

public class Character {
    Utils utils = new Utils();

    String archetype = "Peasant";
    String name = "Enguerand";
    int hp = 4;
    int maxHp = 10;
    int ap = 1;
    int maxAp = 1;
    String skillOne = "Fork Strike";
    String skillTwo = "Empty";
    String skillThree = "Empty";
    String skillFour = "Empty";
    int worldLocation = 0;

    public void createCharacter(String archetype, String name, int hp, int maxHp, int ap, int maxAp, String skillOne, String skillTwo, String skillThree, String skillFour) {
        this.archetype = archetype;
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.ap = ap;
        this.maxAp = maxAp;
        this.skillOne = skillOne;
        this.skillTwo = skillTwo;
        this.skillThree = skillThree;
        this.skillFour = skillFour;
    }

    public String getArchetype() {
        return this.archetype;
    }

    public void setArchetype(String archetype) {
        this.archetype = archetype;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getMaxAp() {
        return maxAp;
    }

    public void setMaxAp(int maxAp) {
        this.maxAp = maxAp;
    }

    public String getSkillOne() {
        return skillOne;
    }

    public void setSkillOne(String skillOne) {
        this.skillOne = skillOne;
    }

    public String getSkillTwo() {
        return skillTwo;
    }

    public void setSkillTwo(String skillTwo) {
        this.skillTwo = skillTwo;
    }

    public String getSkillThree() {
        return skillThree;
    }

    public void setSkillThree(String skillThree) {
        this.skillThree = skillThree;
    }

    public String getSkillFour() {
        return skillFour;
    }

    public void setSkillFour(String skillFour) {
        this.skillFour = skillFour;
    }

    public int getWorldLocation() {
        return worldLocation;
    }

    public void setWorldLocation(int worldLocation) {
        this.worldLocation = worldLocation;
    }
}