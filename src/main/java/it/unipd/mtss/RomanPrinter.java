////////////////////////////////////////////////////////////////////
// Davide Testolin 2079242
// Filippo Guerra 2077681
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.Map;
import java.util.HashMap;

public class RomanPrinter {
        public static String print(int num) {
                return printAsciiArt(IntegerToRoman.convert(num));
        }

        private static final Map<Character, String[]> ROMAN_ASCII_MAP = new HashMap<>();

        static {
                ROMAN_ASCII_MAP.put('I', new String[] {
                                " _____  ",
                                "|_   _| ",
                                "  | |   ",
                                "  | |   ",
                                " _| |_  ",
                                "|_____| ",
                });
                ROMAN_ASCII_MAP.put('V', new String[] {
                                "__      __ ",
                                "\\ \\    / / ",
                                " \\ \\  / /  ",
                                "  \\ \\/ /   ",
                                "   \\  /    ",
                                "    \\/     ",
                });
                ROMAN_ASCII_MAP.put('X', new String[] {
                                " __   __ ",
                                " \\ \\ / / ",
                                "  \\ V /  ",
                                "   > <   ",
                                "  / . \\  ",
                                " /_/ \\_\\ ",
                });
                ROMAN_ASCII_MAP.put('L', new String[] {
                                " _       ",
                                "| |      ",
                                "| |      ",
                                "| |      ",
                                "| |____  ",
                                "|______| ",
                });
                ROMAN_ASCII_MAP.put('C', new String[] {
                                "  _____  ",
                                " / ____| ",
                                "| |      ",
                                "| |      ",
                                "| |____  ",
                                " \\_____| ",
                });
                ROMAN_ASCII_MAP.put('D', new String[] {
                                " _____   ",
                                "| __  \\  ",
                                "| |  | | ",
                                "| |  | | ",
                                "| |__| | ",
                                "|_____/  ",
                });
                ROMAN_ASCII_MAP.put('M', new String[] {
                                " __  __  ",
                                "|  \\/  | ",
                                "| \\  / | ",
                                "| |\\/| | ",
                                "| |  | | ",
                                "|_|  |_| ",
                });
        }

        public static String printAsciiArt(String romanNumber) {
                if (romanNumber == null || romanNumber.isEmpty()) {
                        return "";
                }

                // Convert to uppercase and validate all characters
                String upperRoman = romanNumber.toUpperCase();
                for (char c : upperRoman.toCharArray()) {
                        if (!ROMAN_ASCII_MAP.containsKey(c)) {
                                throw new IllegalArgumentException("Invalid character in Roman numeral: " + c);
                        }
                }

                // Get all the lines for each character
                String[][] allLines = new String[upperRoman.length()][];
                for (int i = 0; i < upperRoman.length(); i++) {
                        allLines[i] = ROMAN_ASCII_MAP.get(upperRoman.charAt(i));
                }

                // Build the result line by line
                StringBuilder result = new StringBuilder();
                for (int line = 0; line < 6; line++) { // All ASCII arts have 6 lines
                        for (int character = 0; character < allLines.length; character++) {
                                result.append(allLines[character][line]);
                        }
                        result.append("\n");
                }

                return result.toString();
        }

}