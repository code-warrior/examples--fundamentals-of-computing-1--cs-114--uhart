# Fundamentals of Computing I (CS 114) Code Examples

This repository contains coding examples related to Roy Vanegas’s section of [_Fundamentals of Computing I_](https://roy.vanegas.org/teaching/at-uhart/fundamentals-of-computing-1/), CS 114, at The University of Hartford. In-class coding examples (`in-class-examples`) reside alongside pre-written examples from the textbook (`textbook-examples`).

Every single example in this repo was formatted and modified according to the majority of rules defined by Google in the [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html), including curly brace usage, whitespace, and two-space indentation. Thus, these examples differ from the textbook examples. **Students must use the enclosed copies of the textbook examples, not those provided by the publisher.**

Each example was also tested using `make` on macOS Monterey (12.6.2) and Windows 10 using the Java 19.01 JDK and the JavaFX 19 SDK. Bash was used in macOS; PowerShell 7 and Cygwin were used in Windows.

## Files Scaffold

Graphics using Java via the JavaFX library are covered at the end of every chapter in the textbook. However, I don’t cover graphics until the end of the semester. Consequently, all JavaFX-related examples have been moved to the folder `textbook-examples/javafx`, while all non-JavaFX examples reside in the `textbook-examples/non-javafx` folder.

## Makefiles

Many programs in this repo have a Makefile. However, you’ll need to use `javac` and `java` to compile and run some programs. Here are the rules for how a Makefile is included in a program:

1. If two or more non-JavaFX files are required to run a program, then the files that make up the program have their own folder and Makefile.
2. If the program is a JavaFX program, then the program has its own folder and its own Makefile, regardless of whether it requires two or more files to work.

### JavaFX Makefiles

Each Makefile in every JavaFX-related example has two lines related to the `PATH_TO_FX` variable. One behind a comment (`#`) and one exposed:

```make
# PATH_TO_FX = "C:\Program Files\Java\javafx-sdk-19\lib"
PATH_TO_FX = /Library/Java/JavaVirtualMachines/javafx-sdk-19/lib
```

If you’re a macOS user, the Makefiles are ready to use; you needn’t do anything.

If you’re a Windows user, you’ll need to remove the exposed variable on line 2 above, then uncomment the first line by removing the hash (`#`) and the space character that follows it. (This assumes you’ve placed the JavaFX 19 library (`javafx-sdk-19`) in `C:\Program Files\Java`.)
