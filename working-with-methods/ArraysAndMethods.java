public class ArraysAndMethods {
  /**
   * Prints every element in an integer array, separated by spaces.
   *
   * @param array The array to be printed.
   */
  public static void printArray(int[] array) {
    for (int index : array) {
      System.out.print(index + " ");
    }

    System.out.printf("%n");
  }

  /**
   * Modifies the integer element at <code>index</code> in <code>array</code> to a new <code>value</code>. Imagine you
   * have array <code>int[] myArray = {8, 1, 5, 0}</code> and you’d like to replace <code>8</code> with <code>5</code>.
   * Thus, you’d invoke <code>modifyElementInArray(myArray, 0, 5)</code>, yielding <code>{5, 1, 5, 0}</code>.
   *
   * @param array The array whose value will be modified at position <code>index</code>
   * @param index The index of the <code>array</code> where a current value will be replaced with <code>value</code>
   * @param value The new value in <code>array</code> that will be placed at position <code>index</code>
   */
  public static void modifyElementInArray(int[] array, int index, int value) {
    array[index] = value;
  }

  public static void main(String[] args) {
    int[] myArray = {111, 222, 333, 444, 555};
    int[] myOtherArray = new int[5];

    System.out.println("\n------ Printing myArray ------");
    printArray(myArray);
    System.out.println();

    System.out.println("------ Printing myOtherArray (Note default values) ------");
    printArray(myOtherArray);
    System.out.println();

    System.out.println("Making an evil modification to myArray…\n");
    modifyElementInArray(myArray, 0, 666);

    System.out.println("------ Printing myArray ------");
    printArray(myArray);
    System.out.println();
  }
}
