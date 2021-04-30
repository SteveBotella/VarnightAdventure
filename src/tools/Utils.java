package tools;

public class Utils {

    // Exit Game
    public static void exitGame() {
        System.out.println("Do you want to leave the game ?");
        System.out.println("             ----------                          ----------                  ");
        System.out.println("            |   Yes  > |                        |   No   > |                 ");
        System.out.println("             ----------                          ----------                  ");
        System.out.println("             0 (Numpad)                          1 (Numpad)                  ");
    }

    // Call a loading event for "x" secondes and enable/disable "Loading" & dots
    public static void waitSec(int second, boolean loading, boolean dot) {
        try
        {
            System.out.println();
            if (loading) {
                System.out.print("Loading ");
            }
            for (int i = 0; i < second; i++) {;
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
    public static void storyText(String lineOne, String lineTwo) {
        System.out.println("     " + lineOne + "            ");
        System.out.println("     " + lineTwo + "            ");
        System.out.println("             ----------                                                      ");
        System.out.println("            |   Next > |                                                     ");
        System.out.println("             ----------                                                      ");
        System.out.println("             0 (Numpad)                                                      ");
    }

    // Display peasant logo
    public static void logoPeasant() {
        System.out.println("           / /           ");
        System.out.println("            /\\/         ");
        System.out.println("           /             ");
        System.out.println("     ---------------     ");
    }

    // display warrior logo
    public static void logoWarrior() {
        System.out.println("                         ");
        System.out.println("       O==|=======>      ");
        System.out.println("                         ");
        System.out.println("     ---------------     ");
    }

    // display mage logo
    public static void logoMage() {
        System.out.println("            *            ");
        System.out.println("            /\\          ");
        System.out.println("          _/__\\_        ");
        System.out.println("     ---------------     ");
    }
}
