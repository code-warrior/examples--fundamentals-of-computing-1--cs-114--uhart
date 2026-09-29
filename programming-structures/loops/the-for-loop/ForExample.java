public class ForExample {
  public static void main(String[] args) {
    //
    // for( initialize; test; update )
    //   statement
    //
    // 1 The initialize expression is executed first by a for loop, and ONLY ONCE!
    // 2 The test expression is next, and, if the statement evaluates to true, we
    //   continue
    // 3 The statement goes third
    // 4 The update expression goes next
    // 5  We move to step 2, continuing the looping process again until the test
    //    expression evaluates to false
    for(int counter = 0; counter < 2; counter++)
      System.out.println("The counter variable’s value is " + counter);

    System.out.println();

    // For multiple statements, we use curly braces around the for loop’s body
    for(int counter = 0; counter < 2; counter++) {
      System.out.print("The counter variable’s value is ");
      System.out.println(counter);
    }

    System.out.println();

    // Note: We were able to use the variable identifier counter again, because it
    // is scoped to the body of the for loop

    // We can use comma-separated variables in the initialize and update sections
    // of the for loop, but not the test section:
    for(int first = 0, last = 10; first < last; first++, last--) {
      System.out.println("first is " + first + " and last is " + last);
    }

    // An infinite loop can be written as follows, because the initialize and update
    // section are optional, and the test expression evaluates to true when empty:
    // for(;;)
    //   ;
    //
    // Note: Exit an infinite loop (and a process, in general) by typing Ctrl + C
    //
    // Same as the previous, but true is now explicit
    // for(;true;)
    //   ;
  }
}
