////////////////////////////////////////////////////////////////////
// Davide Testolin 2079242
// Filippo Guerra 2077681
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    @Test(expected = IllegalArgumentException.class)
    public void carattereNonValido() {
        RomanPrinter.printAsciiArt("N");
        RomanPrinter.printAsciiArt("boh");
        RomanPrinter.printAsciiArt(null);
    }

    @Test
    public void stampaStringaVuota() {
        String vera = "";
        String ris = RomanPrinter.printAsciiArt("");
        assertEquals(vera, ris);
    }

    @Test
    public void singoleLettereTest() {
        String i = " _____  \n" +
                "|_   _| \n" +
                "  | |   \n" +
                "  | |   \n" +
                " _| |_  \n" +
                "|_____| \n";
        assertEquals(i, RomanPrinter.printAsciiArt("I"));

        String v = "__      __ \n" +
                "\\ \\    / / \n" +
                " \\ \\  / /  \n" +
                "  \\ \\/ /   \n" +
                "   \\  /    \n" +
                "    \\/     \n";
        assertEquals(v, RomanPrinter.printAsciiArt("V"));

        String x = " __   __ \n" +
                " \\ \\ / / \n" +
                "  \\ V /  \n" +
                "   > <   \n" +
                "  / . \\  \n" +
                " /_/ \\_\\ \n";
        assertEquals(x, RomanPrinter.printAsciiArt("X"));

        String l = " _       \n" +
                "| |      \n" +
                "| |      \n" +
                "| |      \n" +
                "| |____  \n" +
                "|______| \n";
        assertEquals(l, RomanPrinter.printAsciiArt("L"));

        String c = "  _____  \n" +
                " / ____| \n" +
                "| |      \n" +
                "| |      \n" +
                "| |____  \n" +
                " \\_____| \n";
        assertEquals(c, RomanPrinter.printAsciiArt("C"));

        String d = " _____   \n" +
                "| __  \\  \n" +
                "| |  | | \n" +
                "| |  | | \n" +
                "| |__| | \n" +
                "|_____/  \n";
        assertEquals(d, RomanPrinter.printAsciiArt("D"));

        String m = " __  __  \n" +
                "|  \\/  | \n" +
                "| \\  / | \n" +
                "| |\\/| | \n" +
                "| |  | | \n" +
                "|_|  |_| \n";
        assertEquals(m, RomanPrinter.printAsciiArt("M"));
    }
    /* */
    @Test
    public void MultipleLettereTest(){
        String cmxcix = "  _____   __  __   __   __   _____   _____   __   __ \n" +
                    " / ____| |  \\/  |  \\ \\ / /  / ____| |_   _|  \\ \\ / / \n" + 
                    "| |      | \\  / |   \\ V /  | |        | |     \\ V /  \n"+
                    "| |      | |\\/| |    > <   | |        | |      > <   \n"+
                    "| |____  | |  | |   / . \\  | |____   _| |_    / . \\  \n"+
                    " \\_____| |_|  |_|  /_/ \\_\\  \\_____| |_____|  /_/ \\_\\ \n";
        assertEquals(cmxcix, RomanPrinter.printAsciiArt("CMXCIX"));

    }
}