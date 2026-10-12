public class CommandLineArguments {
  public static void main(String[] args) {
    if(args.length == 0) {
      System.out.println("This program was not invoked with any command line arguments");
    } else {
      if(args.length == 1) {
        System.out.println("There was " + args.length + " item typed into the command line, and it was…\n" + args[0]);
      } else{
        System.out.println("There were " + args.length + " items typed into the command line, and they were…");

        for(int i = 0; i < args.length; i++) {
          System.out.println(args[i]);
        }
      }
    }
  }
}
