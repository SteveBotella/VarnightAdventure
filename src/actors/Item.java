package actors;

public class Item extends Usable {
    public Item() {
        setName("Health Potion");
    }

    public void damage(Character player, Character enemy) {
        System.out.println(player.getName() + " attack " + " and deal " + player.getAp() + " to " + enemy.getName());
        enemy.setHp(enemy.getHp() - player.getAp());
    }
}
