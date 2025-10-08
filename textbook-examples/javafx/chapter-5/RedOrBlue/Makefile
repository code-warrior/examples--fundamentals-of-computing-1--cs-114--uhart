filename = RedOrBlue
# PATH_TO_FX = "C:\Program Files\Java\javafx-sdk-25\lib"
PATH_TO_FX = /Library/Java/JavaVirtualMachines/javafx-sdk-25/lib
module = javafx.controls

all: compile run

compile:
	javac --module-path $(PATH_TO_FX) --add-modules $(module) $(filename).java

run:
	java --enable-native-access=javafx.graphics --module-path $(PATH_TO_FX) --add-modules $(module) $(filename)
