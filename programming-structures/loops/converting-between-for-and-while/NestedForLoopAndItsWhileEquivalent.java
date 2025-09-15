public class NestedForLoopAndItsWhileEquivalent {
  public static void main(String[] args) {
    final int MAX = 2;

    for(int i = 0; i < MAX; i++) {
      for(int j = 0; j < MAX; j++) {
        System.out.println(i + "|" + j);
      }
    }

    System.out.println();

    int i = 0;

    while(i < MAX) {

      int j = 0;

      while(j < MAX) {
        System.out.println(i + "|" + j);

        j++;
      }

      i++;
    }
  }
}
