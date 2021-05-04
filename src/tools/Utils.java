package tools;

public class Utils {

    // Exit Game
    public void exitGame() {
        System.out.println("Do you want to leave the game ?");
        System.out.println("             ----------                          ----------                  ");
        System.out.println("            |   Yes  > |                        |   No   > |                 ");
        System.out.println("             ----------                          ----------                  ");
        System.out.println("             1 (Numpad)                          2 (Numpad)                  ");
    }

    // Call a loading event for "x" secondes and enable/disable "Loading" & dots
    public void waitSec(int second, boolean loading, boolean dot) {
        try
        {
            System.out.println();
            if (loading) {
                System.out.print("Loading ");
            }
            for (int i = 0; i < second; i++) {
                Thread.sleep(1000);
                if (dot) {
                    System.out.print(". ");
                }
            }
            System.out.println();
            System.out.println();
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    // Use this function to display text in game
    public void storyText(String lineOne, String lineTwo) {
        System.out.println("     " + lineOne + "            ");
        System.out.println("     " + lineTwo + "            ");
        System.out.println("             ----------                                                      ");
        System.out.println("            |   Next > |                                                     ");
        System.out.println("             ----------                                                      ");
        System.out.println("             0 (Numpad)                                                      ");
    }

    // Display peasant logo
    public void logoPeasant() {
        System.out.println("           / /           ");
        System.out.println("            /\\/         ");
        System.out.println("           /             ");
        System.out.println("     ---------------     ");
    }

    // display warrior logo
    public void logoWarrior() {
        System.out.println("                         ");
        System.out.println("       O==|=======>      ");
        System.out.println("                         ");
        System.out.println("     ---------------     ");
    }

    // display mage logo
    public void logoMage() {
        System.out.println("            *            ");
        System.out.println("            /\\          ");
        System.out.println("          _/__\\_        ");
        System.out.println("     ---------------     ");
    }

    // Ask rolling dice
    public void askToRoll() {
        System.out.println("      Your turn to roll the dice...            ");
        System.out.println("             ----------                                                      ");
        System.out.println("            |   Roll > |                                                     ");
        System.out.println("             ----------                                                      ");
        System.out.println("             0 (Numpad)                                                      ");
    }

    // Roll dice "x" Faces
    public int rollDice(int face) {
        int dice = (int)(Math.random()*face+1);
        System.out.println("Dice " + face + " roll... " + dice + " !");
        System.out.println("             ----------                                                      ");
        System.out.println("            |   Next > |                                                     ");
        System.out.println("             ----------                                                      ");
        System.out.println("             0 (Numpad)                                                      ");
        return dice;
    }
}
