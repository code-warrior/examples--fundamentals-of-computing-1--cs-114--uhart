// *****************************************************************************
// SeasonTester.java       Author: Lewis/Loftus
//
// Demonstrates the use of a full enumerated type.
// *****************************************************************************

public class SeasonTester {
  // ---------------------------------------------------------------------------
  //  Iterates through the values of the Season enumerated type.
  // ---------------------------------------------------------------------------
  public static void main(String[] args) {
    System.out.println();

    for (Season time : Season.values()) {
      System.out.println("\t" + time + "　→　" + time.getSpan());
    }
  }
}
