public class TernaryOperatorExample {
  public static void main(String[] args) {
    int y = 20;
    String output = "";

    if(20 == y) {
      System.out.println("y is equal to 20");
    } else {
      System.out.println("y is not equal to 20");
    }

    output = (20 == y) ? "y is equal to 20" : "y is not equal to 20";

    System.out.println(output);

    /*
     * Regular expression characters
     *
     * * = 0 or more
     * + = 1 or more
     * ? = 0 or 1
     */
  }
}
