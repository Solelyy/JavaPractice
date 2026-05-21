## Memory Allocation and Deallocation

### Allocation
- process of reserving memory space in RAM for 
variables and objects while the program runs 
### Deallocation
- process of freeing up that memory once it is no longer needed. 

## Stack and Heap
- Memory regions that are used by the Java Virtual Machine (JVM)

### Stack
- it holds/stores local variables, method calls, and reference to the objects
- primitive values is directly stored
- the management is automatic LIFO
- it tracks method execution, added on top, remove on top

### Heap
- a large memory area where Java stores objects dynamically during runtime
- it stores the actual objects
- String Constant Pool (String pool) lives in here
- managed by garbage collector 
- heap object is being removed when it is no longer needed, 
when there's nothing addresses to it

### String Pool
- a special area inside the heap for storing string literals
- if we create a string using new String() it creates another object
``` java
String a = "Hello";
String b = "Hello";

System.out.println(a == b); // true
```
while, 
``` java
// if we create new String()
String a = new String("Hello");
String b = new String("Hello");
System.out.println(a == b); // false
```

--------------------------------
### Metaspace 
- modern implementation of the Method Area 
- it is a memory area that stores class-level data
- this includes: class definitions, methods (bytecode),
static variables, runtime constant pool
- compare to the old implementation which is the PermGen, 
Metaspace has dynamic memory and lives in native memory (outside the heap)
- auto-growing memory
- stored in native memory (OS-managed)
- fewer memory limit issues
- 
### ByteCode
- it is the instruction that the JVM understands, it is created when the .java file became .class
- it is like a universal language that is why Java is: "write once, run everywhere"
- it is a language of JVM, it is JVM instructions
- .java → human code,
  .class → JVM instructions (bytecode),
  JVM → interpreter/JIT engine,
  CPU → actual execution

### Java Virtual Machine (JVM)
- it is the engine that runs java code. it converts java code to machine language, so it can 
understand even with different OS