Everything in Java is an instanceof Object and has the following methods:

- protected Object clone(); // dont have to know what were cloning in advance, maybe call super clone first, creates a shallow copy
- boolean equals(Object); // tests two things for equality, dont have to be same data type, check what data is being used for comparison
  - reflexive
  - symmetric: x.equals(y) = y.equals(x)
  - transitive
  - consistent
- String toString(); // useful for output, generates char string
- protected void finalize(); // called by garbage collector
- int hashcode(); // generates unique hashcode for this particular object, not consistent across executions
  - if two objects are equal according to equals(Object), hashcode() produces the same integer
  - dont have to be of same class
  - it is not required that if 2 objects are not equal according to equals() that the hashcode method produces different values
  - clone doesnt necessarily create two objects equal according to equals(Object)
- Class getClass(); // returns what class an object belongs to
- various wait() and notify() methods used in threads

programmers should consider overriding these


The Class class:
Aquired from:
- getClass() inherited from Object
- .class field assoc w/ class types
- static forNAme(String) of Class class

Used to
- instantiate new instances
- get fields, methods, etc

...

