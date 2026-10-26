import helpers.CLIColors;
import helpers.Print;

/*
 * Compile the helpers package:
 *
 * javac -d . ../helpers/Print.java
 * javac -d . ../helpers/CLIColors.java
 */

public class PrintArrays {
  public static void print(byte[] byteArray) {
    for(int index = 0; index < byteArray.length; index++) {
      Print.p("byteArray[" + CLIColors.GREEN + index + CLIColors.NORMAL + "]: " +
        CLIColors.GREEN + byteArray[index] + CLIColors.NORMAL);
    }

    Print.p();
  }

  public static void print(short[] shortArray) {
    for(int index = 0; index < shortArray.length; index++) {
      Print.p("shortArray[" + CLIColors.GREEN + index + CLIColors.NORMAL + "]: " +
        CLIColors.GREEN + shortArray[index] + CLIColors.NORMAL);
    }

    Print.p();
  }

  public static void print(int[] intArray) {
    for(int index = 0; index < intArray.length; index++) {
      Print.p("intArray[" + CLIColors.GREEN + index + CLIColors.NORMAL + "]: " +
        CLIColors.GREEN + intArray[index] + CLIColors.NORMAL);
    }

    Print.p();
  }

  public static void print(long[] longArray) {
    for(int index = 0; index < longArray.length; index++) {
      Print.p("longArray[" + CLIColors.GREEN + index + CLIColors.NORMAL + "]: " +
        CLIColors.GREEN + longArray[index] + CLIColors.NORMAL);
    }

    Print.p();
  }

  public static void print(float[] floatArray) {
    for(int index = 0; index < floatArray.length; index++) {
      Print.p("floatArray[" + CLIColors.GREEN + index + CLIColors.NORMAL + "]: " +
        CLIColors.GREEN + floatArray[index] + CLIColors.NORMAL);
    }

    Print.p();
  }

  public static void print(double[] doubleArray) {
    for(int index = 0; index < doubleArray.length; index++) {
      Print.p("doubleArray[" + CLIColors.GREEN + index + CLIColors.NORMAL + "]: " +
        CLIColors.GREEN + doubleArray[index] + CLIColors.NORMAL);
    }

    Print.p();
  }
}
