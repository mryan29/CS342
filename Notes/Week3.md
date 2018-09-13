# Going over project
Makefile

ALL: Game.java Direction.java ...
  javac *.java
  
get rid of some line in the code that says "package ___"

# Review
At what point are constructors called?

**When space for class objects is allocated.**

# Constructors
- called auto by system when space is allocated for class object
- may occur before main()
- initializes contents of newly allocated class object, initializing default vals of class vars, allocate resources, etc.
- have same name as their class, no return type (not even void)
- can have multiple overloaded constructors w dif method signatures
- system automatically calls constructors of parent classes if programmer doesn't

...

# Static Review
- Static methods don't have a "this" reference
- Static class methods can be called thru any instance of the class
- Static class methods can be called thru the name of the class w/o using a class object
- static class methods can only access static data of the class (unless an object is passed in)
