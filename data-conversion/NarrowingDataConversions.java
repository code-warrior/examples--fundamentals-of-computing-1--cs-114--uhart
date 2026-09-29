public class NarrowingDataConversions {
  public static void main(String[] args) {
    byte capitalJAsACodePoint = 74;
    byte lowercaseAAsACodePoint = 97;
    byte lowercaseVAsACodePoint = 118;

    System.out.println("Value of byte type capitalJAsACodePoint: " + capitalJAsACodePoint);
    System.out.println("Value of byte type lowercaseAAsACodePoint: " + lowercaseAAsACodePoint);
    System.out.println("Value of byte type lowercaseVAsACodePoint: " + lowercaseVAsACodePoint);

    // 1. Cast each byte to a char
    // 2. Concatenate the empty string in order to combine all chars into a string
    System.out.println("" + (char) capitalJAsACodePoint + (char) lowercaseAAsACodePoint + (char) lowercaseVAsACodePoint + (char) lowercaseAAsACodePoint);

    /*
     * “An exception to the space-shrinking situation in narrowing conversions is
     * when we convert a byte (8 bits) or a short (16 bits) to a char (16 bits).
     * These are still considered narrowing conversions because the sign bit is
     * incorporated into the new character value. Since a character value is
     * unsigned, a negative integer will be converted into a character that has no
     * particular relationship to the numeric value of the original integer.”
     *
     * — Page 82, Java Software Solutions, 9th Edition
     */
  }
}
