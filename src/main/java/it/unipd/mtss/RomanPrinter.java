////////////////////////////////////////////////////////////////////
// Davide Testolin 2079242
// Filippo Guerra 2077681
////////////////////////////////////////////////////////////////////


package it.unipd.mtss;
public class RomanPrinter {
  public static String print(int num){
  return printAsciiArt(IntegerToRoman.convert(num));
}


public static String printAsciiArt(String romanNumber) {
  if (romanNumber == null || romanNumber.isEmpty()) {
      return ""; 
  }

  StringBuilder asciiArt = new StringBuilder();
  for (char character : romanNumber.toUpperCase().toCharArray()) {
      switch (character) {
          case 'I':
              asciiArt.append(" _____ \n")
                      .append("|_   _|\n")
                      .append("  | |  \n")
                      .append("  | |  \n")
                      .append(" _| |_ \n")
                      .append("|_____|\n");
              break;
          case 'V':
              asciiArt.append("__      __\n")
                      .append("\\ \\    / /\n")
                      .append(" \\ \\  / / \n")
                      .append("  \\ \\/ /  \n")
                      .append("   \\  /   \n")
                      .append("    \\/    \n");
              break;
          case 'X':
              asciiArt.append("__    __\n")
                      .append("\\ \\  / /\n")
                      .append(" \\ \\/ / \n")
                      .append("  >  <  \n")
                      .append(" / .  \\ \n")
                      .append("/_/ \\_\\ \n");
              break;
          case 'L':
              asciiArt.append(" _      \n")
                      .append("| |     \n")
                      .append("| |     \n")
                      .append("| |     \n")
                      .append("| |____ \n")
                      .append("|______|\n");
              break;
          case 'C':
              asciiArt.append("  _____ \n")
                      .append(" / ____|\n")
                      .append("| |     \n")
                      .append("| |     \n")
                      .append("| |____ \n")
                      .append(" \\_____|\n");
              break;

          case 'D':
              asciiArt.append(" _____  \n")
                      .append("|  __ \\ \n")
                      .append("| |  | |\n")
                      .append("| |  | |\n")
                      .append("| |__| |\n")
                      .append("|_____/ \n");
          break;
          case 'M':
              asciiArt.append(" __  __ \n")
                      .append("|  \\/  |\n")
                      .append("| \\  / |\n")
                      .append("| |\\/| |\n")
                      .append("| |  | |\n")
                      .append("|_|  |_|\n");
          break;

          default:
              throw new IllegalArgumentException(" Carattere non valido: " + character);
      }
  }

  return asciiArt.toString();
}
}