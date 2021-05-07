package actors;

public class Character {

    Usable skillOne = new Weapon("Bare Hands");
    Usable skillTwo = new Spell("Bare Hands");
    Usable skillThree = new Spell("Bare Hands");
    Usable skillFour = new Item("Bare Hands");

    private int gold = 0;
    private int minGold = 0;

    private String archetype = "Peasant";
    private String name = "Enguerand";
    private int hp = 4;
    private int maxHp = 10;
    private int ap = 1;
    private int maxAp = 1;

    private int worldLocation = 0;

    public void createCharacter(String archetype, String name, int hp, int maxHp, int ap, int maxAp, String skillOne, String skillTwo, String skillThree, String skillFour, int gold, int minGold) {
        this.archetype = archetype;
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.ap = ap;
        this.maxAp = maxAp;
        this.skillOne = new Weapon(skillOne);
        this.skillTwo = new Spell(skillTwo);
        this.skillThree = new Spell(skillThree);
        this.skillFour = new Item(skillFour);
        this.gold = gold;
        this.minGold = minGold;
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

    public Usable getSkillOne() {
        return skillOne;
    }

    public void setSkillOne(Usable skillOne) {
        this.skillOne = skillOne;
    }

    public int getWorldLocation() {
        return worldLocation;
    }

    public Usable getSkillTwo() {
        return skillTwo;
    }

    public void setSkillTwo(Usable skillTwo) {
        this.skillTwo = skillTwo;
    }

    public Usable getSkillThree() {
        return skillThree;
    }

    public void setSkillThree(Usable skillThree) {
        this.skillThree = skillThree;
    }

    public Usable getSkillFour() {
        return skillFour;
    }

    public void setSkillFour(Usable skillFour) {
        this.skillFour = skillFour;
    }

    public void setWorldLocation(int worldLocation) {
        this.worldLocation = worldLocation;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getMinGold() {
        return minGold;
    }

    public void setMinGold(int minGold) {
        this.minGold = minGold;
    }
}