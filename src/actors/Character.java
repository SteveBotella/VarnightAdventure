package actors;

import tools.Utils;

public abstract class Character {
    String archetype = "Peasant";
    String name = "Name";
    int hp = 1;
    int maxHp = 1;
    int ap = 1;
    int maxAp = 1;

    public void characterSheet() {
        System.out.println("     --- " + archetype + " ---     ");
        tools.Utils.logoPeasant();
        System.out.println("  Name : " + this.name);
        System.out.println("  HP : " + this.hp);
        System.out.println("  AP : " + this.ap);
        System.out.println("     ---------------     ");
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

}
