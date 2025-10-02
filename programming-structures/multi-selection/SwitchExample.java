public class SwitchExample {
  public static void main(String[] args) {
    String name = "ED";
    String state = "ny";

    switch(name) {
      case "ed":
        System.out.printf("%s%n", "Your name is Ed, spelled ed");

        break;

      case "ED":
        System.out.printf("%s%n", "Your name is Ed, spelled ED");

        break;

      case "Ed":
        System.out.printf("%s%n", "Your name is Ed, spelled Ed");

        break;

      case "eD":
        System.out.printf("%s%n", "Your name is Ed, spelled eD");

        break;

      default:
        System.out.printf("%s%n", "Your name is not Ed");

        break;
    }

    switch(state) {
      case "NY":
      case "ny":
      case "Ny":
      case "nY":
        System.out.printf("%s%n", "Your state is New York");

        break;

      default:
        System.out.printf("%s%n", "Your state is not New York");

        break;
    }
  }
}
