// *****************************************************************************
// WinPercentage.java
//
// Original authors: Lewis/Loftus
// Modified by:      Roy Vanegas
//
// Demonstrates the use of a while loop for input validation.
// *****************************************************************************

import java.text.NumberFormat;
import java.util.Scanner;

public class WinPercentage {
  // ---------------------------------------------------------------------------
  // Computes the percentage of games won by a team.
  // ---------------------------------------------------------------------------
  public static void main(String[] args) {
    final int MAX_GAMES_WON = 12;
    int numberOfGamesWon;
    double ratio;
    NumberFormat numberFormat = NumberFormat.getPercentInstance();

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of games won (between 0–" +
      MAX_GAMES_WON + "): ");
    numberOfGamesWon = input.nextInt();

    // While the input is not within the range requested...
    while ((numberOfGamesWon < 0) || (numberOfGamesWon > MAX_GAMES_WON)) {
      System.out.print("Invalid input. Please re-enter: ");
      numberOfGamesWon = input.nextInt();
    }

    ratio = (double)numberOfGamesWon / MAX_GAMES_WON;

    System.out.println();
    System.out.println("Winning percentage: " + numberFormat.format(ratio));

    input.close();
  }
}
