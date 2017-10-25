.DEFAULT=build

build:
	javac TW*.java && jar -cfe TWLinux.jar TWInterface *.class && rm *.class
