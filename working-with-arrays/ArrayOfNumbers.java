public class ArrayOfNumbers {
  public static void main(String[] args) {
    final int MAX = 3;

    /*
     * Arrays may be declared with brackets before or after the type:
     *
     *   int[] arrayOfIntegers
     *
     * or
     *
     *   int arrayOfIntegers[]
     *
     * However, the Java convention is the former: int[] arrayOfIntegers
     */
    int[] arrayOfIntegers = {74, 86, 77};

    // Indexes may be byte, short, or even char

    // The length variable is defined as `public final int`
    System.out.println("\nThe length of `arrayOfIntegers` is " +
      arrayOfIntegers.length + "\n");

    /*
     * Array literals are created and initialized when the program is run, not when
     * the program is compiled. Thus, line 16 is equivalent to…
     *
     * int[] arrayOfIntegers = new int[3];
     * arrayOfIntegers[0] = 74;
     * arrayOfIntegers[1] = 86;
     * arrayOfIntegers[2] = 77;
     */

    System.out.println("Cycling through the array:");
    for(int index = 0; index < arrayOfIntegers.length; index++) {
      System.out.println("\tarrayOfIntegers[" + index + "] holds value " +
        arrayOfIntegers[index]);
    }

    System.out.println(
      "\nThe previous is read as, “arrayOfIntegers at INDEX holds value VALUE”\n");

    System.out.println("Cycling through the array, this time only to retrieve " +
      "values using Java’s `foreach` syntax:");
    for(int valueInArrayIndex : arrayOfIntegers) {
      System.out.println("\t" + valueInArrayIndex);
    }

    System.out.println("\nLet’s cast down to a char each integer in the array:");
    for(int i = 0; i < MAX; i++) {
      System.out.println("\t" + (char)arrayOfIntegers[i]);
    }

    System.out.println();
  }
}
