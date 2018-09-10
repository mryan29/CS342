My personal notes regarding the Java programming language.


# Data Types
## Arrays
- dynamically created
- indexed [0,n-1]
- can be any type, dimension, size
- declaring an array does not set aside memory for the array

### Syntax: 
  `Type name[];` or `Type[] name;`
   
   `name = new Type[size];` or can combine doing:  `Type name[] = new Type[size];`
        
  to initialize: `Type name[] = {e1,e2};` or `Type name[size] = {e1,e2}`

## [Vectors](https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html)
- growable array of objects
- can be accessed via index
- maintains capacity and capacityIncrement
  - capacity at least as large as vector in size
  - storage increases in chunks te size of capacityIncrement
- uses iterator and listIterator
  - if vector is structurally modified after iterator is created (except thru iterator's remove/add methods), iterator throws ConcurrentModificationException
 
### Syntax:
  `Vector vec = new Vector();` creates empty vector w default initial capacity of 10, resizes to double the capacity when attempting to add n+1th element
  
  `Vector vec = new Vector(capacity);` or `Vector vec = new Vector(capacity, capacityIncrement);`
  
### Methods
void addElement(Object element): It inserts the element at the end of the Vector.

int capacity(): This method returns the current capacity of the vector.

int size(): It returns the current size of the vector.

void setSize(int size): It changes the existing size with the specified size.

boolean contains(Object element): This method checks whether the specified element is present in the Vector. If the element is been found it returns true else false.

boolean containsAll(Collection c): It returns true if all the elements of collection c are present in the Vector.

Object elementAt(int index): It returns the element present at the specified location in Vector.

Object firstElement(): It is used for getting the first element of the vector.

Object lastElement(): Returns the last element of the array.

Object get(int index): Returns the element at the specified index.

boolean isEmpty(): This method returns true if Vector doesn’t have any element.

boolean removeElement(Object element): Removes the specifed element from vector.

boolean removeAll(Collection c): It Removes all those elements from vector which are present in the Collection c.

void setElementAt(Object element, int index): It updates the element of specifed index with the given element.
