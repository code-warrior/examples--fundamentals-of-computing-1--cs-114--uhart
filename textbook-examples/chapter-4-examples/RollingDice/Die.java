// **********************************************************************************
//  Die.java       Author: Lewis/Loftus
//
//  Represents one die (singular of dice) with faces showing values between 1 and 6.
// **********************************************************************************

public class Die {
  private final int MAX = 6; // Maximum face value
  private int faceValue;     // Current value showing on the die

  //---------------------------------------------------------------------------------
  // Constructor: Sets the initial face value.
  //---------------------------------------------------------------------------------
  public Die() {
    faceValue = 1;
  }

  // --------------------------------------------------------------------------------
  // Rolls the die and returns the result.
  // --------------------------------------------------------------------------------
  public int roll() {
    /*
     * 1. Generate a random double between 0.0 (inclusive)–1.0 (not inclusive)
     * 2. Multiply the result by MAX (6, in this case)
     * 3. Cast the result to an int, removing the floating-point value to the
     *    right of the period.
     * 4. Add 1, since random doesn’t generate 1.0 (see step 1) in its
     *    generation of pseudo-random numbers.
     */
    faceValue = (int)(Math.random() * MAX) + 1;

    return faceValue;
  }

  //---------------------------------------------------------------------------------
  // Face value mutator.
  //---------------------------------------------------------------------------------
  public void setFaceValue(int value) {
    faceValue = value;
  }

  // --------------------------------------------------------------------------------
  // Face value accessor.
  // --------------------------------------------------------------------------------
  public int getFaceValue() {
    return faceValue;
  }

  // --------------------------------------------------------------------------------
  // Returns a string representation of this die.
  //
  // Over-ride the default toString method attached to all classes.
  // --------------------------------------------------------------------------------
  public String toString() {
    String result = Integer.toString(faceValue);

    return result;
  }
}
