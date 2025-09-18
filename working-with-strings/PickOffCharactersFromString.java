public class PickOffCharactersFromString {
  public static void main(String[] args) {
    String band = "Bad Brains";
    char firstLetter = band.charAt(0);
    char lastLetter = band.charAt(band.length() - 1);

    System.out.println(band.charAt(0));
    System.out.println(band.charAt(1));
    System.out.println(band.charAt(2));
    System.out.println(band.charAt(3));
    System.out.println(band.charAt(4));
    System.out.println(band.charAt(5));
    System.out.println(band.charAt(6));
    System.out.println(band.charAt(7));
    System.out.println(band.charAt(8));
    System.out.println(band.charAt(9));

    System.out.println("The first letter in " + band + " is " + firstLetter);
    System.out.println("The last letter in " + band + " is " + lastLetter);
  }
}
