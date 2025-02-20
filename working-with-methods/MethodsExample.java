public class MethodsExample {
  public static void printName() {
    System.out.printf("%n%s%n", "Ed Bob");
  }

  public static String getName() {
    return "EdBob";
  }

  public static int getSum(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    int x = 20;
    int y = 40;

    printName();
    System.out.printf("The cat’s name is %s%n", getName());
    System.out.printf("The sum of %d and %d is %d%n", x, y, getSum(x, y));
  }
}
