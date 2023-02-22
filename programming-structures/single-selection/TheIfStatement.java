public class TheIfStatement {
  public static void main(String[] args) {
    int x = 30;
    int y = 20;

    if((x == 30) & (++y == 21)) {
      System.out.println("The short-circuited AND case!");
    }

    if((y++ == 21) | (x == 30)) {
      System.out.println("The short-circuited OR case!");
    }

    System.out.println("The final value of y is " + y);

    // if(300 == x) {
    //   System.out.println("x is 30!");
    //   System.out.println("x is still 30!");
    // }

    // } else {
    //   System.out.println("x is not 30!");
    // }
  }
}
