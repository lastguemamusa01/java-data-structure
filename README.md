# java-data-structure

## Collections in Java

The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

Java Collection means a single unit of objects. Java Collection framework provides many 
interfaces (Set, List, Queue, Deque) and 
classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

Let us see the hierarchy of Collection framework. The java.util package contains all the classes and interfaces for the Collection framework.

![](2022-04-26-23-27-21.png)

### Collection inteface

* public int size()	It returns the total number of elements in the collection.
* public void clear()	It removes the total number of elements from the collection.
* public boolean contains(Object element)	It is used to search an element.
* public Iterator iterator()	It returns an iterator.
* public Object[] toArray()	It converts collection into array.
* public boolean isEmpty()	It checks if collection is empty.
* public boolean equals(Object element)	It matches two collections.

### Iterator interface

Iterator interface provides the facility of iterating the elements in a forward direction only.

* public boolean hasNext()	It returns true if the iterator has more elements otherwise it returns false.
* public Object next()	It returns the element and moves the cursor pointer to the next element.
* public void remove()	It removes the last elements returned by the iterator. It is less used.

### Iterable Interface

The Iterable interface is the root interface for all the collection classes. The Collection interface extends the Iterable interface and therefore all the subclasses of Collection interface also implement the Iterable interface.

### Collection Interface

The Collection interface is the interface which is implemented by all the classes in the collection framework. It declares the methods that every collection will have. In other words, we can say that the Collection interface builds the foundation on which the collection framework depends.

### List Interface

List interface is the child interface of Collection interface. It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.

List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.

```java
List <data-type> list1= new ArrayList();  
List <data-type> list2 = new LinkedList();  
List <data-type> list3 = new Vector();  
List <data-type> list4 = new Stack();  
```

#### ArrayList

The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types. The ArrayList class maintains the insertion order and is non-synchronized. The elements stored in the ArrayList class can be randomly accessed. Consider the following example.

ArrayListExample.java

#### LinkedList

LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements. It can store the duplicate elements. It maintains the insertion order and is not synchronized. In LinkedList, the manipulation is fast because no shifting is required.

LinkedListExample.java

#### Vector

Vector uses a dynamic array to store the data elements. It is similar to ArrayList. However, It is synchronized and contains many methods that are not the part of Collection framework.

```java
import java.util.*;  
public class TestJavaCollection3{  
    public static void main(String args[]){  
        Vector<String> v=new Vector<String>();  

        v.add("Ayush");  
        v.add("Amit");  
        v.add("Ashish");  
        v.add("Garima");  
        
        Iterator<String> itr=v.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  
    }  
}  
```

#### Stack

The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., Stack. The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties.

```java
Stack<String> stack = new Stack<String>();  
stack.push("Ayush");  
stack.push("Garvit");  
stack.push("Amit");  
stack.push("Ashish");  
stack.push("Garima");  
stack.pop();  

Iterator<String> itr=stack.iterator();  
while(itr.hasNext()){  
    System.out.println(itr.next());  
}
```

### Queue Interface

Queue interface maintains the first-in-first-out order. It can be defined as an ordered list that is used to hold the elements which are about to be processed. There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.

```java
Queue<String> q1 = new PriorityQueue();  
Queue<String> q2 = new ArrayDeque();  
```

#### PriorityQueue

The PriorityQueue class implements the Queue interface. It holds the elements or objects which are to be processed by their priorities. PriorityQueue doesn't allow null values to be stored in the queue.
