package actors;

public class Character {

    private Usable skillOne;
    private Usable skillTwo;
    private Usable skillThree;
    private Usable skillFour;

    private int gold;
    private int minGold;

    private String archetype;
    private String name;
    private int hp;
    private int maxHp;
    private int ap;
    private int maxAp;

    private int worldLocation = 0;

    public Character(){
        this.archetype = "Peasant";
        this.name = "Enguerand";
        this.hp = 4;
        this.maxHp = 10;
        this.ap = 1;
        this.maxAp = 1;
    }

    public Character(String name, int hp, int ap) {
        this();
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    public Character(String archetype, String name, int hp, int maxHp, int ap, int maxAp, String skillOne, String skillTwo, String skillThree, String skillFour, int gold, int minGold) {
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