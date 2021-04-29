package tools;

public class Utils {

    // Call a loading event for "x" secondes
    public static void waitSec(int second) {
        try
        {
            System.out.println();
            System.out.print("Loading ");
            for (int i = 0; i < second; i++) {;
                Thread.sleep(1000);
                System.out.print(". ");
            }
            System.out.println();
            System.out.println();
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public static void storyText(String lineOne, String lineTwo) {
        System.out.println("     " + lineOne + "            ");
        System.out.println("     " + lineTwo + "            ");
        System.out.println("             ----------                                                      ");
        System.out.println("            |   Next > |                                                     ");
        System.out.println("             ----------                                                      ");
        System.out.println("             0 (Numpad)                                                      ");
    }
}
