// **********************************************************************************
// Primes.java       Author: Lewis/Loftus
//
// Demonstrates the use of an initializer list for an array.
// **********************************************************************************

public class Primes {
  // ---------------------------------------------------------------------------
  // Stores some prime numbers in an array and prints them.
  // ---------------------------------------------------------------------------
  public static void main(String[] args) {
    int[] primeNums = {2, 3, 5, 7, 11, 13, 17, 19};

    System.out.println("Array length: " + primeNums.length);

    System.out.println("The first few prime numbers are:");

    for (int prime : primeNums) {
      System.out.print(prime + "  ");
    }
  }
}
