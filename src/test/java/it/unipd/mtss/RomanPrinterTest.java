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
    public void stampaLetteraSingolaI(){
        String vera = 
        " _____ \n" +
        "|_   _|\n" +
        "  | |  \n" +
        "  | |  \n" +
        " _| |_ \n" +
        "|_____|\n";
        String ris = RomanPrinter.printAsciiArt("I");
        
        assertEquals(vera, ris);
    }

    @Test
    public void stampaLetteraSingolaV(){
        String vera = 
        "__      __\n" +
        "\\ \\    / /\n" +
        " \\ \\  / / \n" +
        "  \\ \\/ /  \n" +
        "   \\  /   \n" +
        "    \\/    \n";
        String ris = RomanPrinter.printAsciiArt("V");

        assertEquals(vera, ris);
    }

    @Test
    public void stampaLetteraSingolaX(){
        String vera = 
        "__    __\n" +
        "\\ \\  / /\n" +
        " \\ \\/ / \n" +
        "  >  <  \n" +
        " / .  \\ \n" +
        "/_/ \\_\\ \n";
        String ris = RomanPrinter.printAsciiArt("X");

        assertEquals(vera, ris);
    }

    @Test
    public void stampaLetteraSingolaL(){
        String vera = 
        " _      \n" +
        "| |     \n" +
        "| |     \n" +
        "| |     \n" +
        "| |____ \n" +
        "|______|\n";
        String ris = RomanPrinter.printAsciiArt("L");

        assertEquals(vera, ris);
    }

    @Test
    public void stampaLetteraSingolaC(){
        String vera = 
        "  _____ \n" +
        " / ____|\n" +
        "| |     \n" +
        "| |     \n" +
        "| |____ \n" +
        " \\_____|\n";
        String ris = RomanPrinter.printAsciiArt("C");

        assertEquals(vera, ris);
    }

    @Test
    public void stampaLetteraSingolaD(){
        String vera = 
        " _____  \n" +
        "|  __ \\ \n" +
        "| |  | |\n" +
        "| |  | |\n" +
        "| |__| |\n" +
        "|_____/ \n";
        String ris = RomanPrinter.printAsciiArt("D");

        assertEquals(vera, ris);
    }

    @Test
    public void stampaLetteraSingolaM(){
        String vera = 
        " __  __ \n" +
        "|  \\/  |\n" +
        "| \\  / |\n" +
        "| |\\/| |\n" +
        "| |  | |\n" +
        "|_|  |_|\n";
        String ris = RomanPrinter.printAsciiArt("M");

        assertEquals(vera, ris);
    }
}