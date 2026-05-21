## Java Collections Framework (Study Notes)

---

### 1. What are Data Structures in Java?

Data structures are part of the Java Collections Framework (JCF).

They are used to:
- Store multiple objects
- Organize data efficiently
- Perform operations like add, remove, search, sort

---

### 2. Main Interfaces in Collections Framework

| Interface | Description |
|----------|------------|
| List | Ordered collection, allows duplicates |
| Set | Collection of unique elements |
| Queue | FIFO (First-In, First-Out) |
| Deque | Double-ended queue |
| Map | Key–Value pairs (NOT a Collection) |

---

### 3. LIST (Ordered Collection)

####  Concept
- Maintains insertion order
- Allows duplicates
- Access by index

---

#### ArrayList

##### Description
- Resizable array
- Fast random access (get)
- Slow insert/remove in middle

##### Use when:
- Mostly reading data
- Need indexing

##### Methods

add(E e)  
add(int index, E e)  
get(int index)  
set(int index, E e)  
remove(int index)  
remove(Object o)  
contains(Object o)  
size()  
isEmpty()  
clear()  
indexOf(Object o)  
lastIndexOf(Object o)  
toArray()

---

#### LinkedList

##### Description
- Doubly linked list
- Fast insert/remove
- Slower random access

##### Use when:
- Frequent insert/delete
- Queue or deque behavior

##### Methods

addFirst(E e)  
addLast(E e)  
removeFirst()  
removeLast()  
getFirst()  
getLast()  
offer()  
poll()  
peek()

---

#### Vector (Legacy)

##### Description
- Synchronized ArrayList
- Slower performance

##### Use when:
- Rare legacy thread-safe use

---

#### Stack (Legacy)

##### Description
- LIFO structure (Last In, First Out)

##### Methods

push()  
pop()  
peek()  
empty()  
search()

- Prefer ArrayDeque instead

---

### 4. QUEUE (FIFO Structure)

#### Concept
- First In, First Out

---

#### ArrayDeque (Recommended)

##### Description
- Modern replacement for Stack and Queue
- Fast and efficient

##### Methods

addFirst(E e)  
addLast(E e)  
offer(E e)  
poll()  
peek()  
push(E e)  
pop()

---

#### PriorityQueue

##### Description
- Elements ordered by priority
- Head = smallest element by default

##### Use when:
- Scheduling tasks
- Priority-based processing

##### Methods

add(E e)  
offer(E e)  
poll()  
peek()

---

### 5. SET (Unique Elements Only)

#### Concept
- No duplicate values

---

#### HashSet

##### Description
- No order guaranteed
- Fast operations

---

#### LinkedHashSet

##### Description
- Maintains insertion order

---

#### TreeSet

##### Description
- Sorted elements (natural order or comparator)

##### Methods

add(E e)  
remove(Object o)  
contains(Object o)  
first()  
last()  
higher(E e)  
lower(E e)  
ceiling(E e)  
floor(E e)

---

### 6. MAP (Key–Value Structure)

#### Concept
- Stores key → value pairs
- Keys must be unique

---

#### HashMap

##### Description
- Fast lookup
- No ordering

##### Use when:
- Product catalogs
- ID → object mapping
- POS systems

##### Methods

put(K key, V value)  
get(Object key)  
remove(Object key)  
containsKey(Object key)  
containsValue(Object value)  
keySet()  
values()  
entrySet()  
size()  
isEmpty()  
clear()

---

#### LinkedHashMap

##### Description
- Maintains insertion order

---

#### TreeMap

##### Description
- Sorted by keys

##### Methods

firstKey()  
lastKey()  
headMap(K toKey)  
tailMap(K fromKey)  
subMap(K fromKey, K toKey)

---

### 7. Quick Comparison

| Type | Order | Duplicates | Use Case |
|------|------|-----------|----------|
| List | Yes | Yes | Ordered data |
| Set | No / Sorted | No | Unique data |
| Queue | FIFO | Yes | Processing tasks |
| Map | Key-based | Keys: No | Lookup systems |

---

### 8. Important Concept

#### Map is NOT a Collection

Because:
- List / Set / Queue → single elements
- Map → key-value pairs

But it is part of the Java Collections Framework.

---

### 9. When to Use What

#### ArrayList
- Student lists
- Product lists
- Display data

#### HashMap
- POS systems (ID → Product)
- User accounts
- Fast lookup systems

#### HashSet
- Unique IDs
- Prevent duplicates

#### Queue
- Task processing
- Order systems

---

### 10. Final Mental Model

List  → ordered data  
Set   → unique data  
Queue → processing order  
Map   → lookup system
