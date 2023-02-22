public class NestedIfElseExample {
  public static void main(String[] args) {
    int x = 31;
    int y = 20;

    if(30 == x) {
      if(20 == y) {
        // This region is entered when both if statements are true
        System.out.println("x is equal to 30 and y is equal to 20");
      } else {
        // This region is entered when the first if statement is true, but the second is not
        System.out.println("x is equal to 30, but y is not equal to 20");
      }
    } else {
      // This region is entered when the first statement is false
      System.out.println("x is not equal to 30");
    }
  }
}
