public class TerminalColors {
  /*
   * See the following Stack Overflow entry for a more detailed discussion about
   * rendering color in your command line interface:
   *
   * https://stackoverflow.com/questions/4842424/list-of-ansi-color-escape-sequences
   *
   */
  public static void main(String[] args) {
    final String RESET = "\u001b[0m";
    final String HIGHLIGHT = "\u001b[33m";

    System.out.println("The following is " + HIGHLIGHT + "highlighted " + RESET + "and this is not");
  }
}
