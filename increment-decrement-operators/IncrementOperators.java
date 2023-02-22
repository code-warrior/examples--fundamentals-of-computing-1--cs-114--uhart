public class IncrementOperators {
  public static void main(String[] args) {
    int x = 0;
    int y = ++x;

    int a = 0;
    int b = a++;
    a += 3;

    System.out.println("The value of y is " + y); // 1
    System.out.println("The value of b is " + b); // 0
  }
}
