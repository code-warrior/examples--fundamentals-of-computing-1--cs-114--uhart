public class TheContinueStatement {
  public static void main(String[] args) {
    // Print every odd number between 1 and 10…
    for(int i = 0; i < 10; i++) {
      if((i % 2) == 0) {
        continue; // Continue to the next iteration of the loop; that is, to line 4
      }

      System.out.println(i);
    }

    System.out.println();

    // The previous for loop is equivalent to…
    for(int i = 0; i < 10; i++) {
      if((i % 2) == 0) {
        ;
      } else {
        System.out.println(i);
      }
    }

    System.out.println();

    // and…
    for(int i = 0; i < 10; i++) {
      if((i % 2) != 0) {
        System.out.println(i);
      }
    }
  }
}
