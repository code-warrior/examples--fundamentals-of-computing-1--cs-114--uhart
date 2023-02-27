public class WhileLoopExample {
  public static void main(String[] args) {
    final int MAX = 3;

    for(int row = 0; row < MAX; row++) {
      System.out.println("row is " + row);
    }

    System.out.println();

    int row = 0;

    while(row < MAX) {
      System.out.println("row is " + row);

      row++;
    }

    System.out.println("The final value of row is " + row);
  }
}
