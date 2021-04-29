package actors;

public class Warrior extends Character {
    String weapon = "Bare Hands";
    String shield = "Empty Slot";

    public Warrior() {
        this.name = getName();
        setArchetype("Warrior");
    }

    @Override
    public String getArchetype() {
        return this.archetype;
    }

    @Override
    public int getHp() {
        return 5;
    }

    @Override
    public void setHp(int hp) {

    }

    @Override
    public int getMaxHp() {
        return 10;
    }

    @Override
    public void setMaxHp(int maxHp) {

    }

    @Override
    public int getAp() {
        return 5;
    }

    @Override
    public void setAp(int ap) {

    }

    @Override
    public int getMaxAp() {
        return 10;
    }

    @Override
    public void setMaxAp(int maxAp) {

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
