// Note: In Windows 10, the ANSI color escape sequences in examples/CLIColors.java
// may output the sequences instead of setting the colors. The implementation of a
// workaround is not currently planned.
import helpers.CLIColors;
import helpers.Print;

public class MaxValuesForNumericPrimitives {
  public static void main(String[] args) {
    // A good mnemonic for remembering the widths of numeric types, from smallest to
    // largest, is BaSIL FD (the letter “a” doesn’t stand for anything):
    //
    // byte, short, integer, long, float, and double
    //
    Print.p("A " + CLIColors.RED + "byte" + CLIColors.NORMAL +
      "’s max value is " + CLIColors.RED + Byte.MAX_VALUE + CLIColors.NORMAL);

    Print.p();

    Print.p("A " + CLIColors.CYAN + "short" + CLIColors.NORMAL +
      "’s max value is " + CLIColors.CYAN + Short.MAX_VALUE + CLIColors.NORMAL);

    Print.p();

    Print.p("An " + CLIColors.GREEN + "int" + CLIColors.NORMAL +
      "’s max value is " + CLIColors.GREEN + Integer.MAX_VALUE + CLIColors.NORMAL);

    Print.p();

    Print.p("An " + CLIColors.BLUE + "long" + CLIColors.NORMAL +
      "’s max value is " + CLIColors.BLUE + Integer.MAX_VALUE + CLIColors.NORMAL);

    Print.p();

    Print.p("A " + CLIColors.YELLOW + "float" + CLIColors.NORMAL +
      "’s max value is " + CLIColors.YELLOW + Float.MAX_VALUE + CLIColors.NORMAL);

    Print.p();

    Print.p("A " + CLIColors.MAGENTA + "double" + CLIColors.NORMAL +
      "’s max value is " + CLIColors.MAGENTA + Double.MAX_VALUE + CLIColors.NORMAL);

    Print.p();
  }
}
