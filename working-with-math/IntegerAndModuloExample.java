public class IntegerAndModuloExample {
  /*
   * A simple method that prints the division and modulo of two integers
   */
  public static void printDivisionAndModulo(int x, int y) {
    System.out.println(
      x + "/" + y + " = " + (x / y) + " and " + x + "%" + y + " = " + (x % y)
    );
  }

  public static void main(String[] args) {
    printDivisionAndModulo(1, 5);
    printDivisionAndModulo(2, 5);
    printDivisionAndModulo(3, 5);
    printDivisionAndModulo(4, 5);
    printDivisionAndModulo(5, 5);
    printDivisionAndModulo(6, 5);
    printDivisionAndModulo(7, 5);
    printDivisionAndModulo(8, 5);
    printDivisionAndModulo(9, 5);
    printDivisionAndModulo(10, 5);

    return;
  }
}
