## Java Core Object Methods (Deep Notes)

### toString(), equals(), hashCode()

These three methods are fundamental in Java OOP because they define how objects are:
- displayed
- compared
- stored in collections

All three come from:

java.lang.Object

---

### 1. toString()

#### What it is

toString() converts an object into a String representation.

It defines how an object looks when printed.

---

#### Default behavior

If not overridden:

ClassName@hashcode

Example:

Person@3e3abc88

Meaning:
- ClassName = class name
- @ = separator
- hashcode = hexadecimal value

This is NOT a memory address.

---

##### When toString() is automatically called

##### 1. Printing an object
System.out.println(person);

Internally:
person.toString()

---

##### 2. String concatenation
"Person: " + person

Internally:
"Person: " + person.toString()

---

##### 3. String conversion
String.valueOf(person)

---

### Why override toString()

Without override:
Person@3e3abc88

With override:
Name: Jessa Gozun
Course: BSIT
Year: 3

---

#### Example override

@Override
public String toString() {
return "Name: " + firstName + " " + lastName;
}

---

### 2. equals()

#### What it is

equals() checks if two objects are logically equal.

---

#### Default behavior

this == other

Meaning:
- compares memory reference
- NOT values

---

#### Example (default behavior)

Person p1 = new Person("Jessa", "Gozun");
Person p2 = new Person("Jessa", "Gozun");

System.out.println(p1.equals(p2)); // false

---

#### Why override equals()

To compare object data instead of memory location.

---

#### Proper equals() implementation
```java
@Override
public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;

    Person person = (Person) o;

    return firstName.equals(person.firstName)
        && lastName.equals(person.lastName);
}
```
---

#### Explanation

- this == o → same object check
- o == null → avoid null error
- getClass() → ensure same type
- field comparison → actual values

---

#### Result after override

p1.equals(p2); // true

---

### 3. hashCode()

#### What it is

hashCode() returns an integer used for:
- HashMap
- HashSet
- fast lookup

---

#### Default behavior

Based on object identity (not meaningful for business logic)

---

### 4. HashCode Contract (VERY IMPORTANT)

If two objects are equal using equals(), they MUST have the same hashCode.

---

#### Why this matters

Java uses hashCode first before equals.

---

#### Internal flow (HashMap / HashSet)

1. Compute hashCode()
2. Find bucket
3. If collision happens → use equals()

---

### 5. Proper hashCode() implementation
``` java
import java.util.Objects;

@Override
public int hashCode() {
return Objects.hash(firstName, lastName);
}
```
---

#### Why Objects.hash()?

- consistent with equals()
- reduces collisions
- handles multiple fields properly

---

### 6. Relationship between the 3

| Method     | Purpose |
|------------|--------|
| toString() | Display object |
| equals()   | Compare objects |
| hashCode() | Locate objects efficiently |

---

### 7. Real-world example (HashSet)
``` java
Set<Person> set = new HashSet<>();

set.add(new Person("Jessa", "Gozun"));
set.add(new Person("Jessa", "Gozun"));

System.out.println(set.size());
```
---

#### Without override

2

---

#### With override

1

---

### 8. Mental Model

toString() → how object looks  
equals() → is it the same data?  
hashCode() → where it is stored

---

### 9. When Java uses them

System.out.println(obj) → toString()  
obj1.equals(obj2) → equals()  
HashMap / HashSet → hashCode + equals()

---

### 10. Summary

toString() → display  
equals() → logical comparison  
hashCode() → fast lookup system