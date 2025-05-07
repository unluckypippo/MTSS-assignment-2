////////////////////////////////////////////////////////////////////
// Davide Testolin 2079242
// Filippo Guerra 2077681
////////////////////////////////////////////////////////////////////


package it.unipd.mtss;
import java.util.Map;
import java.util.HashMap;

public class RomanPrinter {

    private static final Map<Character, String> ROMAN_ASCII_MAP = new HashMap<>();

    static {
        ROMAN_ASCII_MAP.put('I', " _____ \n" +
                "|_   _|\n" +
                "  | |  \n" +
                "  | |  \n" +
                " _| |_ \n" +
                "|_____|\n");
        ROMAN_ASCII_MAP.put('V', "__      __\n" +
                "\\ \\    / /\n" +
                " \\ \\  / / \n" +
                "  \\ \\/ /  \n" +
                "   \\  /   \n" +
                "    \\/    \n");
        ROMAN_ASCII_MAP.put('X', "__    __\n" +
                "\\ \\  / /\n" +
                " \\ \\/ / \n" +
                "  >  <  \n" +
                " / .  \\ \n" +
                "/_/ \\_\\ \n");
        ROMAN_ASCII_MAP.put('L', " _      \n" +
                "| |     \n" +
                "| |     \n" +
                "| |     \n" +
                "| |____ \n" +
                "|______|\n");
        ROMAN_ASCII_MAP.put('C', "  _____ \n" +
                " / ____|\n" +
                "| |     \n" +
                "| |     \n" +
                "| |____ \n" +
                " \\_____|\n");
        ROMAN_ASCII_MAP.put('D', " _____  \n" +
                "|  __ \\ \n" +
                "| |  | |\n" +
                "| |  | |\n" +
                "| |__| |\n" +
                "|_____/ \n");
        ROMAN_ASCII_MAP.put('M', " __  __ \n" +
                "|  \\/  |\n" +
                "| \\  / |\n" +
                "| |\\/| |\n" +
                "| |  | |\n" +
                "|_|  |_|\n");
    }

    public static String printAsciiArt(String romanNumber) {
        if (romanNumber == null || romanNumber.isEmpty()) {
            return "";
        }

        StringBuilder asciiArt = new StringBuilder();
        for (char character : romanNumber.toUpperCase().toCharArray()) {
            String art = ROMAN_ASCII_MAP.get(character);
            if (art == null) {
                throw new IllegalArgumentException("Invalid character: " + character);
            }
            asciiArt.append(art);
        }

        return asciiArt.toString();
    }
}