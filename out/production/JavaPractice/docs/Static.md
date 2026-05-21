## Static
- Static fields are belong to the class itself
- It is not instantiated, we can call it by mentioning the class name

``` java
public class Student {
    public static final school = "QCU";
}
```

we can access it by: 
``` java
public class Main {
    public static void main (String[] args) {
        // we can just call it directly        
        System.out.println(Student.school);
    }
}
```
### Commonly use cases:
* when we want a member to be belongs to the class itself
* shared constants: when value should never change
* utility methods
* shared counters ex: totalStudent
* application entry point

**Additional Info:**
1. Static methods cannot directly access non-static members
- Because non-static members belong to objects, and static methods may run without any object existing.
2. Static methods cannot use this
- this refers to the current object, but static methods are not tied to objects.
3. Static methods cannot use super
- super needs an object context.
4. Static blocks run once when the class loads