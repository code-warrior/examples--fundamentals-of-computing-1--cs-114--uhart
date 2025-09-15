public class ForLoopAndItsWhileEquivalent {
  public static void main(String[] args) {
    final int MAX = 2;

    for(int i = 0; i < MAX; i++) {
      System.out.println(i);
    }

  System.out.println("\n-\n");

    int i = 0;

    while(i < MAX) {
      System.out.println(i);

      i++;
    }
  }
}
