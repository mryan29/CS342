# Sep 4 - Intro to OO Concepts

Which of the following UML arrow types indicates inheritance?
- A. →
- **B. ⇾**
- C. ⇨
- D. ...

What is an object?
**Encapsulation**: bundling together of related data fields and associated methods
- basic types: ints, floats, dbls &rarr;
- arrays: collections of items of same type &rarr;
- structs: collections of items of diff data types &rarr; (review unions)
- objects: collections of data and related methods, encapsulated into a single new type &rarr;
- well-defined object should represent a *single semantic entity* such as book, airplane, etc.

Two views of objects
**data-centric**: object is *collection of related data items* representing the *state* of an entity, along w methods necessary to maintain that state info

**service-centric**: object is collection of related services provided by an entity, along w data necessary to provide those services

well designed objects should always conform to *both* definitions

## How do classess relate to objects
Programmers write **classes**, defining new data types

- classes define data items and methods 

Programmers *instantiate* new variables of the defined class data types. These variables (*instances* of a class) are objects

i.e. Classes = cookie cutters, objects = cookies

## Interface v. Implementation
**Interface** of a class is the public view that the outside world sees
- method names, return types, number and types of params
- should be carefully thought out and stable before publishing

**Implementation**: 
- all private data, methods, and internal code details including parameter names and should be completely hidden
- may be changed at any time, unbeknownst to rest of world

## Information Hiding
- internal details (implementation) strictly need-to-know basis
- only interface known to outside world
- allows internal workings to be changed w/o disrupting any code that uses the class
- all data fields should be private and only some methods made public
- getters and setters (accessors and ...)

## Responsibility
- each class is responsible for maintaining and using data contained w/i its class

## Clicker q
- Rule out first two bc witch class shouldn't be directly accessing pot class.
- Setter and getter approach: no real difference from first two
- D. asking pot to increase its own temperature but seams to give away method variable used by pot class
- E. doesn't know any variables or anything used by pot class, E is best

## UML (unified modeling language) class diagrams document the contents of classes

-------------------------------

|       Book                   | &larr; Class Name

-------------------------------

|     nPages:int               | &larr; class attriubtes (data fields)

|     title:string             |

-------------------------------

| turnToPage (page:int) : void | &larr; class methods (services)

| getCurrentPage (void) : int  |

-------------------------------


							&uarr; return types

## Class diagrams document access
`-` : private
`+` : public
`#`: protected

"set" methods should verify input validity before completing requested change

## Relationships between classes

| Class A | ---- | Class B | unspecified relationship

| Class A | &rarr; | Class B | Accessibility

| Class A | 1 --- * | Class B | Multiplicity: one A related to multiple B's

| Class A | ---- [m..n] | Class B | from m to n instances
* by itself implies [0..*]

| Child | ⇾ | Parent | always points to parent, inheritance

| Course| hollowdmd * --- * | Student | aggregation: collection of indpndnt objects
|       | filleddmd 1 --- * |Lecture | composition: stronger bonded collection, whole doesn't exist w/o parts and vice versa


## More UML
- Talking about object instead of class: use underline
- Italics indicate Interface in Java, or abstract class in C++
...

Packages: group related items

Notes: have one folded corner, can be attached to anything

## Question:
C. Class B is a parent of class C

## Delegation
- class may fulfill responsibilities by **delegating** tsks to other classes

## Inheritance (aka specialization)
- Used when once class **IS A** version of another class
- **child** inherits from **parent** which can replace and augment

## Liskov substitution principal
- for a class C to be a correct specialization of class p, it must be possible to substitute an instance of class c in any code that is expecting an instance of class p
- in any case where a parent is expected to do a job, the child should be able to step in and take its place and the code still works
- converse is also true: any situation where a child cannot fill the role of a desired parent class, then we dont have true inheritcance/substitution and we shouldnt be using inheritance

## Overloading vs overriding
- buy(float) overloads buy(int) 
- two methods in same scope w same name, but diff number or types of arguments so compiler can tell them apart
- the method name and param types form the method's **signature**
- drive() in Car overrides drive() in Vehicle
- it replaces the inherited method w/i the scope of the Car class

## Access control under inheritance
Vehicle: -speed, +drive, #goFaster()
- speed is private, not available outside vehicle even to car
- drive is public, available to anyone including car
- gofaster is protected: private to most, but public to vehicles descendents such as car
...

## Inheritance vs. Aggregation/Composition
IS A vs. HAS A

See diagram

## Abstract classes
- have one or more methods declared (they exist) but not defined
- cant be instantiated but can be parents to descendent classess
- descendents are also abstract until they provide missing/undefined methods 
- recall descendent can always fill role of parent
- pure abstract classes dont define any methods. java terms these interfaces


a child cannot inherit from more than one parent in java, but can in C++. however, child in java can implement as many ... as it wants ? so still has is a relatinoship














