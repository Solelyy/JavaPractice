## Object-Oriented Programming (OOP) in Java
Object-Oriented Programming (OOP) is a programming paradigm that organizes code using:

- Classes
- Objects

Instead of writing everything in one place, OOP models real-world entities into objects.

Example:
- Student
- Car
- Dog
- User

Each object contains:
- Data (fields)
- Behaviors (methods)

---

### Class

A class is a blueprint/template for creating objects.

```java
class Person {
    String name;
    int age;
}
```

The class defines:
- what data objects have
- what behaviors objects can perform

---

### Object

An object is an instance of a class.

```java
Person person = new Person();
```

Here:
- `Person` → class
- `person` → object/reference variable
- `new Person()` → actual object creation

---

### Fields (Instance Variables)

Fields store the object's data/state.

```java
class Person {
    String name;
    int age;
}
```

Usage:
```java
person.name = "Jessa";
person.age = 20;
```

---

### Methods

Methods define the behavior of objects.

```java
class Dog {
    void bark() {
        System.out.println("Woof");
    }
}
```

Usage:
```java
dog.bark();
```

---

### Constructor

A constructor initializes objects.

```java
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}
```

Usage:
```java
Person p = new Person("Jessa");
```

---

### this Keyword

`this` refers to the current object.

```java
this.name = name;
```

Meaning:
- left side → object's field
- right side → parameter

Without `this`:
```java
name = name;
```

The parameter shadows the field.

---

### Encapsulation

Encapsulation means:
- hiding internal data
- controlling access

Usually done using:
- `private`
- getters/setters

```java
class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

Benefits:
- protection
- validation
- controlled modification

---

### Getter

Returns a value.

```java
public String getName() {
    return name;
}
```

---

### Setter

Modifies a value safely.

```java
public void setName(String name) {
    this.name = name;
}
```

---

### Access Modifiers

| Modifier | Accessible |
|---|---|
| public | everywhere |
| private | inside the class only |
| protected | package + subclasses |
| default | same package |

---

### Inheritance

Inheritance allows a child class to acquire properties and methods from a parent class.

```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
}
```

`Dog` inherits:
```java
eat()
```

Benefits:
- code reuse
- cleaner hierarchy

---

### Method Overriding

Child class provides its own implementation.

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

---

### Polymorphism

One reference can represent multiple object types.
“Same method call behaves differently depending on actual object type at runtime”

```java
Animal animal = new Dog();
```

Reference type:
```java
Animal
```

Actual object:
```java
Dog
```

Benefits:
- flexibility
- dynamic behavior

---

### Upcasting

Child → Parent

```java
Dog dog = new Dog();

Animal animal = dog;
```

Automatic and safe.

---

### Downcasting

Parent reference → Child reference

```java
Animal animal = new Dog();

Dog dog = (Dog) animal;
```

Requires explicit cast.

---

### Invalid Downcasting

```java
Dog dog = (Dog) new Animal();
```

Runtime error:
```text
ClassCastException
```

Reason:
- actual object is not a `Dog`

---
**Note**
- Reference type controls ACCESS.
- Object type controls BEHAVIOR.

### Abstraction

Abstraction hides implementation details and shows only essential behavior.

Done using:
- abstract classes
- interfaces

---

### Abstract Class

A partial implementation class.

Properties:
- cannot instantiate directly
- may contain abstract methods
- may contain concrete methods

```java
abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Sleeping");
    }
}
```

---

### Abstract Method

Method without implementation.

```java
abstract void sound();
```

Child classes must implement it.

---
### When We Should Declare a Class as `abstract`?

#### 1. When the class is too general to create objects from

If the class only represents a general concept and not a complete real object.

##### Example
``` java
abstract class Vehicle {
}
```

You do not usually create:
``` java
new Vehicle();
```

Instead, you create:
- Car
- Motorcycle
- Truck

---

#### 2. When the class is meant only to be inherited

If the class exists mainly as a base/template for child classes.

##### Example
``` java
abstract class Person {
}
```

Then:
``` java
class Student extends Person {
}

class Professor extends Person {
}
```

`Person` becomes the shared parent structure.

---

#### 3. When some methods should be REQUIRED for subclasses

If every child class must provide its own version of a method.

##### Example
``` java
abstract class Animal {
    abstract void makeSound();
}
```

Every subclass must implement:
``` java
@Override
void makeSound()
```

---

#### 4. When the class has incomplete behavior

If some parts of the class are not yet fully defined.

##### Example
``` java
abstract class Payment {
    abstract void processPayment();
}
```

Different payment types process differently:
- CreditCardPayment
- GCashPayment
- PayPalPayment

The base class cannot define one exact implementation.

---

#### 5. When you want shared logic + forced customization

Abstract classes can contain:
- normal implemented methods
- abstract methods

##### Example
``` java
abstract class Employee {

    void login() {
        System.out.println("Employee logged in");
    }

    abstract void work();
}
```

Shared behavior:
``` java
login()
```

Custom behavior:
``` java
work()
```

---

### Quick Decision Guide

#### "Does it make sense to create an object of this class directly?"

If:
- YES → normal class
- NO → abstract class

---

### Real-World Examples

| Abstract Class | Child Classes |
|---|---|
| Vehicle | Car, Bus, Motorcycle |
| Animal | Dog, Cat, Bird |
| Employee | Manager, Cashier, Developer |
| Payment | GCash, PayPal, CreditCard |

---

### Important Notes

#### An abstract class:
- CAN have constructors
- CAN have normal methods
- CAN have fields
- CAN have abstract methods\
Lastly,
- Normal class CAN provide abstraction.
- Abstract class provides stronger/generalized abstraction for inheritance hierarchies.
---

#### An abstract class CANNOT:
- Be instantiated directly
- Exist without purpose for inheritance

---

## Simple Mental Model

### Abstract class = incomplete blueprint

It provides:
- shared structure
- shared behavior
- required rules for subclasses

But it is NOT complete enough to become an actual object.

## Interface

An interface is a contract. It has CAN-DO relationship.
Ex: Bird can Fly

``` java
interface Flyable {
    void fly();
}
```

Implementation:
``` java
class Bird implements Flyable {
    public void fly() {
        System.out.println("Flying");
    }
}
```
---
### Note:
- Interface is abstract by default
- Its methods are implicitly public abstract by default, unless explicitly declared otherwise
- Modern interface can also contain default behavior, static utilities, private helpers
- Lastly, the main purpose of interface is CONTRACT (what must be implemented)
---

### Abstract Class vs Interface

| Abstract Class | Interface |
|---|---|
| partial implementation | contract |
| uses extends | uses implements |
| can have instance fields | usually constants only |
| single inheritance | multiple interfaces |

---

### Static Keyword

Belongs to the class itself, not objects.

```java
class MathUtil {
    static int add(int a, int b) {
        return a + b;
    }
}
```

Usage:
``` java
MathUtil.add(1, 2);
```

---

### Final Keyword

#### Final Variable

Cannot be reassigned.

```java
final int age = 20;
```

---

#### Final Method

Cannot be overridden.

```java
final void display() {
}
```

---

#### Final Class

Cannot be inherited.

```java
final class Animal {
}
```

---

### super Keyword

Refers to the parent class.

#### Access Parent Constructor

```java
super(name);
```

#### Access Parent Method

```java
super.sound();
```

---

### Method Overloading

Same method name with different parameters.

```java
class MathUtil {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

---

### Composition

"Has-a" relationship.

```java
class Engine {
}

class Car {
    Engine engine = new Engine();
}
```

Car HAS an Engine.

---

### Association

Relationship between independent objects.

Example:
- Teacher teaches Student
- Customer uses Bank

---

### Aggregation

Weak ownership relationship.

Example:
- Department has Teachers
- Teachers can still exist without Department

---

## Core OOP Pillars

### 1. Encapsulation
Hide data and control access.

### 2. Inheritance
Reuse code from parent classes.

### 3. Polymorphism
One reference, many forms.

### 4. Abstraction
Hide implementation details.

---

## OOP Example

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.sound();
    }
}
```

Output:
```text
Bark
```

Concepts used:
- inheritance
- overriding
- polymorphism

---

## Quick Summary

```text
Class        → blueprint
Object       → instance of class
Field        → object data
Method       → object behavior
Constructor  → initializes object
this         → current object
super        → parent object
Encapsulation→ hide data
Inheritance  → reuse code
Polymorphism → many forms
Abstraction  → hide implementation
Interface    → contract
Abstract     → partial implementation
Static       → belongs to class
Final        → cannot change/override/inherit
```