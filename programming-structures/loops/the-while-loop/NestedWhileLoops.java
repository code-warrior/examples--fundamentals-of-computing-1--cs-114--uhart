public class NestedWhileLoops {
  public static void main(String[] args) {
    final int MAX = 3;

    for(int row = 0; row < MAX; row++) {
      for(int col = 0; col < MAX; col++) {
        System.out.println("row is " + row + " and col is " + col);
      }
    }
  }
}
