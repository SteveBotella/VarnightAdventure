package ui;

import actors.Character;
import actors.Item;

public abstract class CaseEnemy extends Case {

    public void fight(Character player, Character enemy) {
        int turn = 1;
        while (player.getHp() > 0 && enemy.getHp() > 0) {
            System.out.println("Start Turn " + turn);
            getCharacterSheet().paperSheet(player);
            System.out.println("Versus");
            getCharacterSheet().paperSheet(enemy);

            this.setSkillChoice(getSc().nextInt());
            switch (getSkillChoice()) {
                case 1:
                    player.getSkillOne().itemEvent("damage", player, enemy, player.getSkillOne(), getUtils());
                    break;
                case 2:
                    player.getSkillTwo().itemEvent("damage", player, enemy, player.getSkillTwo(), getUtils());
                    break;
                case 3:
                    player.getSkillThree().itemEvent("damage", player, enemy, player.getSkillThree(), getUtils());
                    break;
                case 4:
                    if (player.getSkillFour().getNumber() >= 1) {
                        player.getSkillFour().itemEvent("health", player, enemy, player.getSkillFour(), getUtils());
                        player.getSkillFour().setNumber(player.getSkillFour().getNumber() - 1);
                    } else {
                        System.out.println("No more item ! Let's fight...");
                        player.setSkillFour(new Item(" "));
                        player.getSkillThree().itemEvent("damage", player, enemy, player.getSkillThree(), getUtils());
                    }
                    break;
            }
            getUtils().storyText("Enemy turn",
                    "Prepare yourself...",
                    player,
                    getCharacterSheet(),
                    getSkillChoice(),
                    getSc());
            getCharacterSheet().paperSheet(enemy);
            System.out.println("Versus");
            getCharacterSheet().paperSheet(player);
            if (enemy.getHp() <= 0) {
                System.out.println(player.getName() + " win the fight !");
                player.setGold(player.getGold() + getUtils().rollGold(enemy));
            } else {
                enemy.getSkillOne().itemEvent("damage", enemy, player, enemy.getSkillOne(), getUtils());
                System.out.println("End Turn " + turn);
                getUtils().storyText("Get ready",
                        "...",
                        player,
                        getCharacterSheet(),
                        getSkillChoice(),
                        getSc());
                turn++;
                if (player.getHp() <= 0) {
                    System.out.println("Game Over");
                }
            }
        }
    }
}
