## Java String Building Methods

This note explains the different ways to build strings in Java and their trade-offs:

- String concatenation (+)
- String.format()
- .formatted()
- System.out.printf()
- Text Blocks + formatted()
- StringBuilder

---

### 1. String Concatenation (+)

#### What it is

The simplest way to combine strings using `+`.

#### Example
``` java
String name = "Jessa";
String result = "Name: " + name;
```
#### Pros
- Very easy to use
- Fast for small operations
- No learning curve

#### Cons
- Becomes messy with multiple values
- Hard to read in large strings
- Inefficient in loops (creates many temporary objects)

#### When to use
- Small strings
- Quick debugging
- One-liners

---

### 2. String.format()

#### What it is

Formats strings using placeholders like %s and %d.

#### Example
``` java
String result = String.format("Name: %s Age: %d", name, age);
```
#### Pros
- Clean and readable
- Good for structured output
- Flexible formatting

#### Cons
- Slightly slower than concatenation
- Runtime error if arguments mismatch placeholders

#### When to use
- Logging
- Messages
- Structured output

---

### 3. .formatted()

#### What it is

A newer version of String.format() (Java 15+).

#### Example
``` java
String result = "Name: %s Age: %d".formatted(name, age);
```
#### Pros
- Cleaner than String.format()
- Easier to read inline
- Same functionality

#### Cons
- Same performance as String.format()
- Requires Java 15+

#### When to use
- Same cases as String.format()
- Preferred for modern Java code

---

### 4. System.out.printf()

#### What it is

Direct formatted output to console.

#### Example
``` java
System.out.printf("Name: %s Age: %d%n", name, age);
```
#### Important notes
- Does NOT return a string
- Prints directly to console
- %n is platform-safe newline

#### Pros
- Great for console output
- Clean formatted printing
- No need to store string

#### Cons
- Not reusable (no string returned)
- Only for output

#### When to use
- Console apps
- Debugging
- Reports printed to terminal

---

### 5. Text Blocks + formatted()

#### What it is

Multi-line string templates (Java 15+).

#### Example
``` java
String result =
"""
Name        : %s
Age         : %d
Department  : %s
""".formatted(name, age, dept);
```
#### Pros
- Very readable
- Great for multi-line output
- No need for \n
- Ideal for toString(), reports

#### Cons
- Java 15+
- Still uses %s and %d formatting rules

#### When to use
- toString()
- Reports
- SQL queries
- JSON templates

---

### 6. StringBuilder (IMPORTANT FOR PERFORMANCE)

#### What it is

A mutable string class used for efficient string building.

Unlike String (+), it does NOT create new objects every time.

#### Example
``` java
StringBuilder sb = new StringBuilder();

sb.append("Name: ");
sb.append(name);
sb.append("\nAge: ");
sb.append(age);

String result = sb.toString();
```
---

#### Why it exists

Strings in Java are IMMUTABLE:
``` java
String a = "Hello";
a = a + " World";
```
This creates a new object every time.

---

#### StringBuilder solves this

It modifies the same object in memory.

#### Pros
- Very fast for loops
- Memory efficient
- Best for heavy string operations

#### Cons
- More verbose
- Less readable than + or format
- Not thread-safe

#### When to use
- Loops
- Large string building
- Performance-critical code

---

#### Example in loop
``` java
StringBuilder sb = new StringBuilder();

for (int i = 0; i < 1000; i++) {
sb.append(i).append(" ");
}
```
---

### 7. Comparison Table

| Method | Readability | Speed | Use Case |
|--------|------------|-------|----------|
| + concatenation | Medium | Fast (small) | simple strings |
| String.format() | High | Medium | logs, messages |
| .formatted() | High | Medium | modern format |
| printf() | High | Medium | console output |
| Text Block + formatted | Very High | Medium | reports, toString |
| StringBuilder | Medium | Very Fast | loops, heavy processing |

---

### 8. Key Insights

1. Strings are immutable  
   Every modification creates a new object.

2. StringBuilder avoids object creation  
   It modifies the same internal buffer.

3. Formatting is NOT for performance  
   It is for readability and structure.

4. Best practice:
- StringBuilder → performance-heavy logic
- .formatted() / text blocks → readable output
- + → simple cases only

---

### 9. Mental Model

- + → manual building
- format() → fill-in template
- text block → structured document
- printf() → direct output
- StringBuilder → performance engine

---

### 10. Final Summary

Java provides multiple ways to build strings because:
- simplicity
- readability
- performance