package actors;

public class Spell extends Usable {

    public Spell() {
        setName("Fireball");
        setDamageBonus(3);
    }

    public void damage(Character player, Character enemy) {
        System.out.println(player.getName() + " attack " + " and deal " + player.getAp() + " to " + enemy.getName());
        enemy.setHp(enemy.getHp() - player.getAp());
    }
}
