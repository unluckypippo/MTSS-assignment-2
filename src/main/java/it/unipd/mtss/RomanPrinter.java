////////////////////////////////////////////////////////////////////
// Davide Testolin 2079242
// Filippo Guerra 2077681
////////////////////////////////////////////////////////////////////


package it.unipd.mtss;
public class RomanPrinter {
  public static String print(int num){
  return printAsciiArt(IntegerToRoman.convert(num));
}
  private static final String[] I = {
    " _____ ",
    "|_   _|",
    "  | |  ",
    "  | |  ",
    " _| |_ ",
    "|_____|"
  };

  private static final String[] V = {
    "__      __",
    "\ \    / /",
    " \ \  / / ",
    "  \ \/ /  ",
    "   \  /   ",
    "    \/    "
  };
  private static final String[] X = {
    "__    __",
    "\ \  / /",
    " \ V  / ",
    "  > <   ",
    " / . \  ",
    "/_/ \_\ "
  };
  private static final String[] L = {
    " _      ",
    "| |     ",
    "| |     ",
    "| |     ",
    "| |____ ",
    "|______|"
  };
  private static final String[] C = {
    "  _____ ",
    " / ____|",
    "| |     ",
    "| |     ",
    "| |____ ",
    " \_____|"
  };
  private static final String[] D = {
    " _____  ",
    "|  __ \ ",
    "| |  | |",
    "| |  | |",
    "| |__| |",
    "|_____/ "
  };
  private static final String[] M = {
    " __  __ ",
    "|  \/  |",
    "| \  / |",
    "| |\/| |",
    "| |  | |",
    "|_|  |_|"
  };
  
  public static String printAsciiArt(String romanNumber) {
      if (romanNumber == null) {
          throw new IllegalArgumentException("Input cannot be null");
      }

      if (romanNumber.isEmpty()) {
          return "";
      }

      StringBuilder[] lines = new StringBuilder[6];
      for (int i = 0; i < 6; i++) {
          lines[i] = new StringBuilder();
      }

      for (char c : romanNumber.toCharArray()) {
          String[] letterArt = getLetterArt(c);
          for (int i = 0; i < 6; i++) {
              if (lines[i].length() > 0) {
                  lines[i].append(" ");
              }
              lines[i].append(letterArt[i]);
          }
      }

      StringBuilder result = new StringBuilder();
      for (int i = 0; i < 6; i++) {
          if (i > 0) {
              result.append("\n");
          }
          result.append(lines[i]);
      }

      return result.toString();
  }

  private static String[] getLetterArt(char c) {
      switch (c) {
          case 'I': return I;
          case 'V': return V;
          case 'X': return X;
          case 'L': return L;
          case 'C': return C;
          case 'D': return D;
          case 'M': return M;
          default:
              throw new IllegalArgumentException("Invalid Roman numeral: " + c);
      }
  }
}
