package actors;

public class Weapon extends Usable {

    public Weapon() {
        setName("Sword");
        this.number = getNumber();
        setDamageBonus(3);
    }

    public void damage(Character player, Character enemy) {
        System.out.println(player.getName() + " use " + player.getSkillOne().getName());
        System.out.println(player.getName() + " attack " + " and deal " + player.getAp() + " to " + enemy.getName());
        enemy.setHp(enemy.getHp() - player.getAp());
    }
}
