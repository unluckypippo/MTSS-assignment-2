////////////////////////////////////////////////////////////////////
// Davide Testolin 2079242
// Filippo Guerra 2077681
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class App {
    public static void main(String[] args) {
        if (args == null || args.length != 1) {
            System.err.println("Usage: java -jar roman-number-1.0-SNAPSHOT.jar <number>");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);
            System.out.println(RomanPrinter.print(num));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
