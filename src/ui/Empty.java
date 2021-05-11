package ui;

import actors.Character;

public class Empty extends Case {

    @Override
    public void run(Character player) {
        System.out.println("Empty");
    }
}
