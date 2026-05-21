## String vs StringBuilder
**String** is IMMUTABLE, it creates another object everytime.
``` java
    String sample = "";
    for (int i = 0; i< 5; i++) {
        sample += i;
        System.out.println(sample);
    }
```
Problems:
- creates NEW String object
- copies old contents
- wastes memory
- slower performance

**StringBuilder** it modifies the SAME object
``` java
   StringBuilder sb = new StringBuilder();
   for (int i = 0; i < 5 ; i++) {
       sb.append(i);
       System.out.println(sb);
   }
```
Cons:
- StringBuilder modifies SAME internal object

**Why StringBuilder is FAST?**
- Because object creation is expensive.

Creating thousands of String objects:

- memory allocations
- garbage collection
- copying characters

StringBuilder avoids this.

**Note:**
- Java compiler sometimes optimizes simple concatenation into StringBuilder internally.
```java
    String text = a+ b+ c;
```
- But inside loops, we should manually use StringBuilder.
- Also, StringBuilder becomes String again, just
``` java
    String finalText = sb.toString();
```

## StringBuilder Use Cases (Real-World Guide)

### What is StringBuilder?

StringBuilder is a mutable class used for efficient string building.

Unlike String:
- it modifies the SAME object
- avoids creating many temporary String objects
- improves performance

---

### Core Rule

Use StringBuilder when:

> A string changes repeatedly or grows dynamically.

Especially:
- loops
- large text generation
- repeated appending

---

### 2. Generating Reports

Very common in:
- POS systems
- invoices
- summaries
- receipts

#### Example

``` java
StringBuilder report = new StringBuilder();

report.append("STUDENT REPORT\n");
report.append("-------------------\n");

for (Student student : students) {
    report.append(student.getFullName())
          .append(" - ")
          .append(student.getCourse())
          .append("\n");
}

System.out.println(report);
```

---

### 3. Building CSV / Export Files

Used when exporting:
- Excel-like data
- CSV files
- logs

#### Example

``` java
StringBuilder csv = new StringBuilder();

for (Student student : students) {
    csv.append(student.getFullName())
       .append(",")
       .append(student.getCourse())
       .append(",")
       .append(student.getYear())
       .append("\n");
}
```

---

### 4. Building SQL Queries

Very common in backend development.

#### Example

``` java
StringBuilder sql = new StringBuilder();

sql.append("SELECT * FROM students ");

if (hasCondition) {
    sql.append("WHERE year = 3 ");
}

sql.append("ORDER BY last_name");
```

---

### 5. Building JSON or HTML

Backend systems often generate:
- JSON
- HTML
- XML

#### Example

``` java
StringBuilder html = new StringBuilder();

html.append("<html>");
html.append("<body>");
html.append("<h1>Hello</h1>");
html.append("</body>");
html.append("</html>");
```

---

### 6. Reading Large Files

#### Example

``` java
StringBuilder content = new StringBuilder();

while (scanner.hasNextLine()) {
    content.append(scanner.nextLine())
           .append("\n");
}
```

#### Why StringBuilder?
- file content continuously grows
- repeated concatenation would be expensive

---

### 7. Logging Systems

#### Example

``` java
StringBuilder log = new StringBuilder();

log.append("User Login\n");
log.append("Username: ").append(username).append("\n");
log.append("Time: ").append(time).append("\n");

System.out.println(log);
```

---

### 8. Dynamic Text Construction

When text structure changes based on conditions.

#### Example

``` java
StringBuilder message = new StringBuilder();

message.append("Welcome ");

if (isAdmin) {
    message.append("Administrator ");
}

message.append(username);
```

---

### 9. When NOT to Use StringBuilder

#### Small/simple strings

```java
String name = "Jessa";
String message = "Hello " + name;
```

This is completely fine.

---

### 10. Biggest Rule of Thumb

#### Use StringBuilder when:
- inside loops
- building large strings
- repeated appending
- dynamic text generation

---

#### Do NOT overuse it

Not every string needs StringBuilder.

Readability still matters.

---

### 11. Performance Insight

#### String

``` java
text += value;
```

Creates NEW object every time.

---

#### StringBuilder

``` java
text.append(value);
```

Modifies SAME object.

---

### 12. Memory Model

#### String

``` text
""
"0"
"01"
"012"
```

Multiple objects created.

---

#### StringBuilder

```text
[StringBuilder Object]

""
"0"
"01"
"012"
```

Same object grows internally.

---

# 13. Common StringBuilder Methods

| Method | Purpose |
|---|---|
| append() | add content |
| insert() | insert content |
| delete() | remove characters |
| replace() | replace characters |
| reverse() | reverse string |
| toString() | convert to String |

---

### 15. Final Mental Model

#### String
Good for:
- fixed text
- simple output
- readability

---

#### StringBuilder
Good for:
- growing text
- repeated modifications
- performance-heavy operations

---

### 16. Final Summary

Use StringBuilder when:
- strings grow repeatedly
- loops are involved
- performance matters

Use normal String when:
- text is small/simple
- readability is more important