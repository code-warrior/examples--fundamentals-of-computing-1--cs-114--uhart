public class WorkingWithPrintF {
  public static void main(String[] args) {
    System.out.println();
    System.out.printf("→ %s ←", "Hello, world!");
    System.out.println();

    int x = 10;

    System.out.println();
    System.out.printf("→ %d ←", x);
    System.out.println();

    String name = "EdBob";

    System.out.println();
    System.out.printf("%s%d%n", name, x);

    char letter = 'c';

    System.out.println();
    System.out.printf("→ The first letter in the word “car” is %c ←", letter);
    System.out.println();
  }
}
