package actors;

public class Mage {
    String name = "Name";
    int hp = 3;
    int maxHp = 6;
    int ap = 8;
    int maxAp = 15;
    String spell = "Bare Hands";
    String filter = "Empty Slot";

    public void characterSheet() {
        System.out.println("     ---   Mage  ---     ");
        System.out.println("            *            ");
        System.out.println("            /\\           ");
        System.out.println("          _/__\\_         ");
        System.out.println("  Name : " + this.name);
        System.out.println("  HP : " + this.hp);
        System.out.println("  AP : " + this.ap);
        System.out.println("     ---   ---   ---      ");
        System.out.println("  Spell : " + this.spell);
        System.out.println("  Filter : " + this.filter);
        System.out.println("     ---------------     ");
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

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }
}
