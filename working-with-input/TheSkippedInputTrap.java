import java.util.Scanner;

public class TheSkippedInputTrap {
  public static void main (String[] args) {
    Scanner myInput;
    String myString;
    int myInteger;
    float myFloat;

    myInput = new Scanner(System.in);

    System.out.println("Enter an integer:");
    myInteger = myInput.nextInt();

    System.out.println("Enter a floating-point value:");
    myFloat = myInput.nextFloat();

    /*
     * Invoke myInput.nextLine(), but do nothing with the call. This is done in order
     * to absorb the trailing, unprocessed newline character left behind by the
     * preceding call to nextFloat() on line 16, leaving the input stream ready for
     * text input on line 32. Omitting the following myInput.nextLine() invocation
     * would leave the newline character left by myInput.nextFloat() on line 16 in
     * the buffer. Any subsequent call to newLine() would interpret the new line char
     * as though the user hit the return key, and no input would be consumed from the
     * user.
     */
    myInput.nextLine();

    System.out.println("Enter a line of text:");
    myString = myInput.nextLine();

    // Always close your Scanner
    myInput.close();

    System.out.println("The integer you entered was " + myInteger);
    System.out.println("The float you entered was " + myFloat);
    System.out.println("And, the line of text you entered was " + myString);
  }
}
