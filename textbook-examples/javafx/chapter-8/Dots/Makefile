filename = Dots
# PATH_TO_FX = "C:\Program Files\Java\javafx-sdk-19\lib"
PATH_TO_FX = /Library/Java/JavaVirtualMachines/javafx-sdk-19/lib
module = javafx.controls

all: compile run

compile:
	javac --module-path $(PATH_TO_FX) --add-modules $(module) $(filename).java

run:
	java --module-path $(PATH_TO_FX) --add-modules $(module) $(filename)
