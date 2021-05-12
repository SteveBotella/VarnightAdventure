package actors;

/**
 * Use to create player and enemies
 *
 * @see Warrior
 * @see Mage
 */
public class Character {

    /**
     * Equip weapon in this slot
     * @see Weapon
     */
    private Usable skillOne;

    /**
     * Equip spell in this slot
     * @see Spell
     */
    private Usable skillTwo;

    /**
     * Equip spell in this slot
     * @see Spell
     */
    private Usable skillThree;

    /**
     * Equip Item in this slot
     * @see Item
     */
    private Usable skillFour;

    /**
     * Gold own by this character
     */
    private int gold;

    /**
     * Minimum Gold own by this character when you loot him
     */
    private int minGold;

    /**
     * Define the archetype of the character. Change your Stats like AP, HP, Spells...
     * @see Warrior
     * @see Mage
     */
    private String archetype;

    /**
     * Character name displayed
     */
    private String name;

    /**
     * Actual Health Points
     */
    private int hp;

    /**
     * Maximum Health Point this character can have
     */
    private int maxHp;

    /**
     * Actual Attack Power
     */
    private int ap;

    /**
     * Maximum Attack Power this character can have
     */
    private int maxAp;

    /**
     * Player position in the "world"
     * @see maps.Dungeon
     * @see ui.Room
     */
    private int worldLocation = 0;

    /**
     * Base constructor.
     * This constructor create a basic character. Be able to change this later
     */
    public Character(){
        this.archetype = "Peasant";
        this.name = "Enguerand";
        this.hp = 4;
        this.maxHp = 10;
        this.ap = 1;
        this.maxAp = 1;
    }

    /**
     * Use this constructor to create a character by choosing his name, hp & ap
     * @param name String Character name
     * @param hp int Character HP
     * @param ap int Character AP
     */
    public Character(String name, int hp, int ap) {
        this();
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    /**
     * Use this constructor to create a character by choosing all parameters
     * @param archetype String Character archetype
     * @param name String Character name
     * @param hp int Character HP
     * @param maxHp int Character maxHP
     * @param ap int Character AP
     * @param maxAp int Character maxAP
     * @param skillOne Weapon Character weapon slot
     * @param skillTwo Spell Character spell slot 1
     * @param skillThree Spell Character spell slot 2
     * @param skillFour Item Character item slot
     * @param gold int Character gold earned
     * @param minGold int Character minimum gold to loot from
     */
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