public class TerminalColors {
  public static void main(String[] args) {
    final String RESET = "\u001b[0m";
    final String HIGHLIGHT = "\u001b[33m";

    System.out.println("The following is " + HIGHLIGHT + "highlighted " + RESET + "and this is not");
  }
}
