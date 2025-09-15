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
    int y = 5;

    printDivisionAndModulo(1, y);
    printDivisionAndModulo(2, y);
    printDivisionAndModulo(3, y);
    printDivisionAndModulo(4, y);
    printDivisionAndModulo(5, y);
    printDivisionAndModulo(6, y);
    printDivisionAndModulo(7, y);
    printDivisionAndModulo(8, y);
    printDivisionAndModulo(9, y);
    printDivisionAndModulo(10, y);

    return;
  }
}
