public class NestedWhileLoops {
  public static void main(String[] args) {
    final int MAX = 3;

    for(int row = 0; row < MAX; row++) {
      for(int col = 0; col < MAX; col++) {
        System.out.println("Row: " + row + "; Col: " + col);
      }
    }

    System.out.println();

    int row = 0;

    while(row < MAX) {
      int col = 0;

      while(col < MAX) {
        System.out.println("Row: " + row + "; Col: " + col);

        col++;
      }

      row++;
    }
  }
}
