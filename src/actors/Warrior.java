package actors;

public class Warrior {
    String name = "Name";
    int hp = 5;
    int maxHp = 10;
    int ap = 5;
    int maxAp = 10;
    String weapon = "Bare Hands";
    String shield = "Empty Slot";

    public void characterSheet() {
        System.out.println("     --- Warrior ---     ");
        System.out.println("  Name : " + this.name);
        System.out.println("  HP : " + this.hp);
        System.out.println("  AP : " + this.ap);
        System.out.println("     ---   ---  ---      ");
        System.out.println("  Weapon : " + this.weapon);
        System.out.println("  Shield : " + this.shield);
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

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getShield() {
        return shield;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }
}
