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

List in Java provides the facility to maintain the ordered collection. It contains the index-based methods to insert, update, delete and search the elements. It can have the duplicate elements also. We can also store the null elements in the list.


* void add(int index, E element)	It is used to insert the specified element at the specified position in a list.
* boolean add(E e)	It is used to append the specified element at the end of a list.
* boolean addAll(Collection<? extends E> c)	It is used to append all of the elements in the specified collection to the end of a list.
* boolean addAll(int index, Collection<? extends E> c)	It is used to append all the elements in the specified collection, starting at the specified position of the list.
* void clear()	It is used to remove all of the elements from this list.
* boolean equals(Object o)	It is used to compare the specified object with the elements of a list.
* int hashcode()	It is used to return the hash code value for a list.
* E get(int index)	It is used to fetch the element from the particular position of the list.
* boolean isEmpty()	It returns true if the list is empty, otherwise false.
* int lastIndexOf(Object o)	It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.
* Object[] toArray()	It is used to return an array containing all of the elements in this list in the correct order.
* <T> T[] toArray(T[] a)	It is used to return an array containing all of the elements in this list in the correct order.
* boolean contains(Object o)	It returns true if the list contains the specified element
* boolean containsAll(Collection<?> c)	It returns true if the list contains all the specified element
* int indexOf(Object o)	It is used to return the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.
* E remove(int index)	It is used to remove the element present at the specified position in the list.	
* boolean remove(Object o)	It is used to remove the first occurrence of the specified element.	
* boolean removeAll(Collection<?> c)	It is used to remove all the elements from the list.	
* void replaceAll(UnaryOperator<E> operator)	It is used to replace all the elements from the list with the specified element.	
* void retainAll(Collection<?> c)	It is used to retain all the elements in the list that are present in the specified collection.	
* E set(int index, E element)	It is used to replace the specified element in the list, present at the specified position.	
* void sort(Comparator<? super E> c)	It is used to sort the elements of the list on the basis of specified comparator.	
* Spliterator<E> spliterator()	It is used to create spliterator over the elements in a list.	
* List<E> subList(int fromIndex, int toIndex)	It is used to fetch all the elements lies within the given range.	
* int size()	It is used to return the number of elements present in the list.


How to convert List to Array

```java
   List<String> fruitList = new ArrayList<>();    
     fruitList.add("Mango");    
     fruitList.add("Banana");    
     fruitList.add("Apple");    
     fruitList.add("Strawberry");    
     //Converting ArrayList to Array  
     String[] array = fruitList.toArray(new String[fruitList.size()]);    
     System.out.println("Printing Array: "+Arrays.toString(array));  
     System.out.println("Printing List: "+fruitList);  

```


#### ListIterator Interface

* void add(E e)	This method inserts the specified element into the list.
* boolean hasNext()	This method returns true if the list iterator has more elements while traversing the list in the forward direction.
* E next()	This method returns the next element in the list and advances the cursor position.
* int nextIndex()	This method returns the index of the element that would be returned by a subsequent call to next()
* boolean hasPrevious()	This method returns true if this list iterator has more elements while traversing the list in the reverse direction.
* E previous()	This method returns the previous element in the list and moves the cursor position backward.
* E previousIndex()	This method returns the index of the element that would be returned by a subsequent call to previous().
* void remove()	This method removes the last element from the list that was returned by next() or previous() methods
* void set(E e)	This method replaces the last element returned by next() or previous() methods with the specified element.


```java
List<String> al=new ArrayList<String>(); 
        al.add("Amit");    
        al.add("Vijay");    
        al.add("Kumar");    
        al.add(1,"Sachin");    
        ListIterator<String> itr=al.listIterator();    
        System.out.println("Traversing elements in forward direction");    
        while(itr.hasNext()){    
              
        System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());    
        }    
        System.out.println("Traversing elements in backward direction");    
        while(itr.hasPrevious()){    
          
        System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());    
        }  
```



#### ArrayList

The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types. The ArrayList class maintains the insertion order and is non-synchronized. The elements stored in the ArrayList class can be randomly accessed. Consider the following example.

ArrayListExample.java

Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit. We can add or remove elements anytime. 

* Java ArrayList class can contain duplicate elements.
* Java ArrayList class maintains insertion order.
* Java ArrayList class is non synchronized.
* Java ArrayList allows random access because the array works on an index basis.
* In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
* We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases. For example:

```java
ArrayList<int> al = ArrayList<int>(); // does not work  
ArrayList<Integer> al = new ArrayList<Integer>(); // works fine  
```

* Java ArrayList gets initialized by the size. The size is dynamic in the array list, which varies according to the elements getting added or removed from the list.


* ArrayList()	It is used to build an empty array list.
* ArrayList(Collection<? extends E> c)	It is used to build an array list that is initialized with the elements of the collection c.
* ArrayList(int capacity)	It is used to build an array list that has the specified initial capacity.

* void add(int index, E element)	It is used to insert the specified element at the specified position in a list.
* boolean add(E e)	It is used to append the specified element at the end of a list.
* boolean addAll(Collection<? extends E> c)	It is used to append all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
* boolean addAll(int index, Collection<? extends E> c)	It is used to append all the elements in the specified collection, starting at the specified position of the list.
* void clear()	It is used to remove all of the elements from this list.
* void ensureCapacity(int requiredCapacity)	It is used to enhance the capacity of an ArrayList instance.
* E get(int index)	It is used to fetch the element from the particular position of the list.
* boolean isEmpty()	It returns true if the list is empty, otherwise false.
* int lastIndexOf(Object o)	It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.
* Object[] toArray()	It is used to return an array containing all of the elements in this list in the correct order.
* <T> T[] toArray(T[] a)	It is used to return an array containing all of the elements in this list in the correct order.
* Object clone()	It is used to return a shallow copy of an ArrayList.
* boolean contains(Object o)	It returns true if the list contains the specified element.
* int indexOf(Object o)	It is used to return the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.
* E remove(int index)	It is used to remove the element present at the specified position in the list.
* boolean remove(Object o)	It is used to remove the first occurrence of the specified element.
* boolean removeAll(Collection<?> c)	It is used to remove all the elements from the list.
* boolean removeIf(Predicate<? super E> filter)	It is used to remove all the elements from the list that satisfies the given predicate.
* protected void removeRange(int fromIndex, int toIndex)	It is used to remove all the elements lies within the given range.
* void replaceAll(UnaryOperator<E> operator)	It is used to replace all the elements from the list with the specified element.
* void retainAll(Collection<?> c)	It is used to retain all the elements in the list that are present in the specified collection.
* E set(int index, E element)	It is used to replace the specified element in the list, present at the specified position.
* void sort(Comparator<? super E> c)	It is used to sort the elements of the list on the basis of the specified comparator.
* Spliterator<E> spliterator()	It is used to create a spliterator over the elements in a list.
* List<E> subList(int fromIndex, int toIndex)	It is used to fetch all the elements that lies within the given range.
* int size()	It is used to return the number of elements present in the list.
* void trimToSize()	It is used to trim the capacity of this ArrayList instance to be the list's current size.


use set and get with array index position

use Collections.sort to sort the list

There are various ways to traverse the collection elements:

* By Iterator interface.
* By for-each loop.
* By ListIterator interface.
* By for loop.
* By forEach() method.
* By forEachRemaining() method.

```java
ArrayList<String> list = new ArrayList<String>();
list.add("Mango");//Adding object in arraylist    
list.add("Apple");    
list.add("Banana");    
list.add("Grapes");    

System.out.println("get first element " + list.get(0));

list.set(1,"Yellow Apple");

Collections.sort(list);

System.out.println(list);

Iterator itr = list.iterator();
while(itr.hasNext()) {
    System.out.print(" "+itr.next());
}

System.out.println();

for(String fruit: list) {
    System.out.print(" "+fruit);
}

System.out.println();

//Here, element iterates in reverse order  
ListIterator<String> list1=list.listIterator(list.size());  
while(list1.hasPrevious())  
{  
    System.out.print(" "+list1.previous());
}  

System.out.println();

System.out.println("Traversing list through for loop:");  
for(int i=0;i<list.size();i++)  
{  
    System.out.println(list.get(i));     
}  

System.out.println();

System.out.println("Traversing list through forEach() method:");  
//The forEach() method is a new feature, introduced in Java 8.  
list.forEach(a->{ //Here, we are using lambda expression  
    System.out.println(a);  
});  

System.out.println();

System.out.println("Traversing list through forEachRemaining() method:");  
    Iterator<String> itr2=list.iterator();  
    itr2.forEachRemaining(a-> //Here, we are using lambda expression  
    {  
        System.out.println(a);  
    });      
```

#### Java Non-generic Vs. Generic Collection

Java collection framework was non-generic before JDK 1.5. Since 1.5, it is generic.

Java new generic collection allows you to have only one type of object in a collection. Now it is type-safe, so typecasting is not required at runtime.

Let's see the old non-generic example of creating a Java collection.

```java
ArrayList list=new ArrayList();//creating old non-generic arraylist  
```

Let's see the new generic example of creating java collection.

```java
ArrayList<String> list=new ArrayList<String>();//creating new generic arraylist  
```

In a generic collection, we specify the type in angular braces. Now ArrayList is forced to have the only specified type of object in it. If you try to add another type of object, it gives a compile-time error.

User-defined class objects in Java ArrayList

```java
class Student {
    int rollno;
    String name;
    int age;
    
    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}
```

```java
Student s1 = new Student(323,"min ku nam", 22);
Student s2 =new Student(102,"Ravi",21);  
Student s3 =new Student(103,"Hanumat",25);  

ArrayList<Student> students = new ArrayList<Student>();
students.add(s1);
students.add(s2);
students.add(s3);

for(Student student: students) {
    System.out.println("rollno : " + student.rollno + " name : " + student.name + " age : " + student.age);
}
```

```java
ArrayList<String> al=new ArrayList<String>();  
       
//Adding elements to the end of the list  
al.add("Ravi");  
al.add("Vijay");  
al.add("Ajay");  
al.remove("Vijay");  
    al.remove(0);  
    
System.out.println("Initial list of elements: "+al);  

ArrayList<String> al2=new ArrayList<String>();  
al2.add("Sonoo");  
al2.add("Hanumat");  
al.addAll(al2);  
System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);     

al.addAll(1, al2);  
System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);  

al.removeAll(al2);
System.out.println("remove all : "+al);  

al.removeIf(str -> str.contains("Ajay"));
System.out.println("remove if : "+al); 

al.add("Ravi");  
al.add("Vijay"); 

System.out.println("after add: "+al);

al.clear();

System.out.println("clear: "+al);
```

```java
// capacity 10
ArrayList<Integer> al = new ArrayList<Integer>(10);  

System.out.println("Is ArrayList Empty: "+al.isEmpty());  

al.add("Ravi");  
al.add("Vijay");  
al.add("Ajay"); 

System.out.println("The size of the array is: " + al.size());  

ArrayList<String> al2=new ArrayList<String>();  
al2.add("Ravi");  
al2.add("Hanumat");  

al.retainAll(al2);
System.out.println(al);
```

Capacity represents the total number of elements the array list can contain. Therefore, the capacity of an array list is always greater than or equal to the size of the array list. When we add an element to the array list, it checks whether the size of the array list has become equal to the capacity or not. If yes, then the capacity of the array list increases. So, in the above example, the capacity will be 10 till 10 elements are added to the list. When we add the 11th element, the capacity increases. Note that in both examples, the capacity of the array list is 10. In the first case, the capacity is 10 because the default capacity of the array list is 10. In the second case, we have explicitly mentioned that the capacity of the array list is 10.

#### LinkedList

LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements. It can store the duplicate elements. It maintains the insertion order and is not synchronized. In LinkedList, the manipulation is fast because no shifting is required.

LinkedListExample.java

Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.

* Java LinkedList class can contain duplicate elements.
* Java LinkedList class maintains insertion order.
* Java LinkedList class is non synchronized.
* In Java LinkedList class, manipulation is fast because no shifting needs to occur.
* Java LinkedList class can be used as a list, stack or queue.


* LinkedList()	It is used to construct an empty list.
* LinkedList(Collection<? extends E> c)	It is used to construct a list containing the elements of the specified collection, in the order, they are returned by the collection's iterator.

* boolean add(E e)	It is used to append the specified element to the end of a list.
* void add(int index, E element)	It is used to insert the specified element at the specified position index in a list.
* boolean addAll(Collection<? extends E> c)	It is used to append all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
* boolean addAll(int index, Collection<? extends E> c)	It is used to append all the elements in the specified collection, starting at the specified position of the list.
* void addFirst(E e)	It is used to insert the given element at the beginning of a list.
* void addLast(E e)	It is used to append the given element to the end of a list.
* void clear()	It is used to remove all the elements from a list.
* Object clone()	It is used to return a shallow copy of an ArrayList.
* boolean contains(Object o)	It is used to return true if a list contains a specified element.
* Iterator<E> descendingIterator()	It is used to return an iterator over the elements in a deque in reverse sequential order.
* E element()	It is used to retrieve the first element of a list.
* E get(int index)	It is used to return the element at the specified position in a list.
* E getFirst()	It is used to return the first element in a list.
* E getLast()	It is used to return the last element in a list.
* int indexOf(Object o)	It is used to return the index in a list of the first occurrence of the specified element, or -1 if the list does not contain any element.
* int lastIndexOf(Object o)	It is used to return the index in a list of the last occurrence of the specified element, or -1 if the list does not contain any element.
* ListIterator<E> listIterator(int index)	It is used to return a list-iterator of the elements in proper sequence, starting at the specified position in the list.
* boolean offer(E e)	It adds the specified element as the last element of a list.
* boolean offerFirst(E e)	It inserts the specified element at the front of a list.
* boolean offerLast(E e)	It inserts the specified element at the end of a list.
* E peek()	It retrieves the first element of a list
* E peekFirst()	It retrieves the first element of a list or returns null if a list is empty.
* E peekLast()	It retrieves the last element of a list or returns null if a list is empty.
* E poll()	It retrieves and removes the first element of a list.
* E pollFirst()	It retrieves and removes the first element of a list, or returns null if a list is empty.
* E pollLast()	It retrieves and removes the last element of a list, or returns null if a list is empty.
* E pop()	It pops an element from the stack represented by a list.
* void push(E e)	It pushes an element onto the stack represented by a list.
* E remove()	It is used to retrieve and removes the first element of a list.
* E remove(int index)	It is used to remove the element at the specified position in a list.
* boolean remove(Object o)	It is used to remove the first occurrence of the specified element in a list.
* E removeFirst()	It removes and returns the first element from a list.
* boolean removeFirstOccurrence(Object o)	It is used to remove the first occurrence of the specified element in a list (when traversing the list from head to tail).
* E removeLast()	It removes and returns the last element from a list.
* boolean removeLastOccurrence(Object o)	It removes the last occurrence of the specified element in a list (when traversing the list from head to tail).
* E set(int index, E element)	It replaces the element at the specified position in a list with the specified element.
* Object[] toArray()	It is used to return an array containing all the elements in a list in proper sequence (from first to the last element).
* <T> T[] toArray(T[] a)	It returns an array containing all the elements in the proper sequence (from first to the last element); the runtime type of the returned array is that of the specified array.
* int size()	It is used to return the number of elements in a list.

```java
 LinkedList<String> al=new LinkedList<String>();  
        
al.add("Ravi");  
al.add("Vijay");  
al.add("Ravi");  
al.add("Ajay");  
al.add(1, "Gaurav");  

Collections.sort(al);

System.out.println("Is LinkedList Empty: "+al.isEmpty());  

LinkedList<String> al2=new LinkedList<String>();  
al2.add("Ravi");  
    
System.out.println("After invoking addFirst(E e) method: "+al);  

al.addFirst("Lokesh");  
System.out.println("After invoking addFirst(E e) method: "+al);  
//Adding an element at the last position  
al.addLast("Harsh");  
System.out.println("After invoking addLast(E e) method: "+al);  

al.removeAll(al2);
System.out.println("After removeAll method: "+al);  

al.removeFirst();  
System.out.println("After removeAll method: "+al);  

al.removeLast(); 
System.out.println("After removeAll method: "+al);  

al.add("Ravi");  
al.add("Vijay");  
al.add("Ravi");  
al.add("Ajay");  

System.out.println("After adding: "+al);  

al.removeFirstOccurrence("Vijay");  
System.out.println("After removeFirstOccurrence: "+al);  

al.removeLastOccurrence("Ravi");  
System.out.println("After removeLastOccurrence: "+al);  

```

![](2022-04-27-02-09-44.png)

* When the rate of addition or removal rate is more than the read scenarios, then go for the LinkedList. On the other hand, when the frequency of the read scenarios is more than the addition or removal rate, then ArrayList takes precedence over LinkedList.
* Since the elements of an ArrayList are stored more compact as compared to a LinkedList; therefore, the ArrayList is more cache-friendly as compared to the LinkedList. Thus, chances for the cache miss are less in an ArrayList as compared to a LinkedList. Generally, it is considered that a LinkedList is poor in cache-locality.
* Memory overhead in the LinkedList is more as compared to the ArrayList. It is because, in a LinkedList, we have two extra links (next and previous) as it is required to store the address of the previous and the next nodes, and these links consume extra space. Such links are not present in an ArrayList.



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

PriorityQueueExample.java

### Deque Interface

Deque interface extends the Queue interface. In Deque, we can remove and add the elements from both the side. Deque stands for a double-ended queue which enables us to perform the operations at both the ends.

Deque can be instantiated as:

```java
Deque d = new ArrayDeque();  
```

#### ArrayDeque

ArrayDeque class implements the Deque interface. It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from both the ends.

ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.

```java
Deque<String> deque = new ArrayDeque<String>();  
deque.add("Gautam");  
deque.add("Karan");  
deque.add("Ajay");  
//Traversing elements  
for (String str : deque) {  
    System.out.println(str);  
}  
```

### Set Interface

Set Interface in Java is present in java.util package. It extends the Collection interface. It represents the unordered set of elements which doesn't allow us to store the duplicate items. We can store at most one null value in Set. Set is implemented by HashSet, LinkedHashSet, and TreeSet.

Set can be instantiated as:

```java
Set<data-type> s1 = new HashSet<data-type>();  
Set<data-type> s2 = new LinkedHashSet<data-type>();  
Set<data-type> s3 = new TreeSet<data-type>();  
```

#### HashSet

HashSet class implements Set Interface. It represents the collection that uses a hash table for storage. Hashing is used to store the elements in the HashSet. It contains unique items.

```java
HashSet<String> set=new HashSet<String>();  
set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay");  
//Traversing elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
    System.out.println(itr.next());  
}  
```

* HashSet stores the elements by using a mechanism called hashing.
* HashSet contains unique elements only.
* HashSet allows null value.
* HashSet class is non synchronized.
* HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
* HashSet is the best approach for search operations.
* The initial default capacity of HashSet is 16, and the load factor is 0.75.

Difference between List and Set

A list can contain duplicate elements whereas Set contains unique elements only.


* HashSet()	It is used to construct a default HashSet.
* 	HashSet(int capacity)	It is used to initialize the capacity of the hash set to the given integer value capacity. The capacity grows automatically as elements are added to the HashSet.
* 	HashSet(int capacity, float loadFactor)	It is used to initialize the capacity of the hash set to the given integer value capacity and the specified load factor.
* 	HashSet(Collection<? extends E> c)	It is used to initialize the hash set by using the elements of the collection c.

* boolean	add(E e)	It is used to add the specified element to this set if it is not already present.
* 	void	clear()	It is used to remove all of the elements from the set.
* 	object	clone()	It is used to return a shallow copy of this HashSet instance: the elements themselves are not cloned.
* 	boolean	contains(Object o)	It is used to return true if this set contains the specified element.
* 	boolean	isEmpty()	It is used to return true if this set contains no elements.
* 	Iterator<E>	iterator()	It is used to return an iterator over the elements in this set.
* 	boolean	remove(Object o)	It is used to remove the specified element from this set if it is present.
* 	int	size()	It is used to return the number of elements in the set.
* 	Spliterator<E>	spliterator()	It is used to create a late-binding and fail-fast Spliterator over the elements in the set.


```java
HashSet<String> set = new HashSet<String>();
HashSet<String> set1=new HashSet<String>();  

set.add("One");    
set.add("Two");    
set.add("Three");   
set.add("Four");  
set.add("Two");    
set.add("Five");  

System.out.println(set);

set.remove("One");  
System.out.println("After invoking remove(object) method: "+set); 

set1.add("Ajay");  
  set1.add("Gaurav");  
  set.addAll(set1);  

System.out.println(set);

  set.removeAll(set1);  

  System.out.println(set);

   set.removeIf(str->str.contains("Five"));    

  System.out.println(set);

  set.clear();

  System.out.println(set);

    ArrayList<String> list=new ArrayList<String>();  
  list.add("Ravi");  
  list.add("Vijay");  
  list.add("Ajay");  

  HashSet<String> set2=new HashSet(list);  

   System.out.println(set2);
```

#### LinkedHashSet

LinkedHashSet class represents the LinkedList implementation of Set Interface. It extends the HashSet class and implements Set interface. Like HashSet, It also contains unique elements. It maintains the insertion order and permits null elements.

```java
LinkedHashSet<String> set=new LinkedHashSet<String>();  
set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay");  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
    System.out.println(itr.next());  
}  
```

Java LinkedHashSet class is a Hashtable and Linked list implementation of the Set interface.

* Java LinkedHashSet class contains unique elements only like HashSet.
* Java LinkedHashSet class provides all optional set operations and permits null elements.
* Java LinkedHashSet class is non-synchronized.
* Java LinkedHashSet class maintains insertion order.

The LinkedHashSet class extends the HashSet class, which implements the Set interface. The Set interface inherits Collection and Iterable interfaces in hierarchical order.


* LinkedHashSet()	It is used to construct a default LinkedHashSet.
* LinkedHashSet(Collection c)	It is used to initialize the hash set by using the elements of the collection c.
* LinkedHashSet(int capacity)	It is used to initialize the capacity of the linked hash set to the given integer value capacity.
* LinkedHashSet(int capacity, float fillRatio)	It is used to initialize both the capacity and the fill ratio (also called load capacity) of the hash set from its argument.

```java
LinkedHashSet<String> set = new LinkedHashSet<String>();
       
       set.add("One");    
       set.add("Two");    
       set.add("Three");   
       set.add("Four");  
       set.add("One");    
       set.add("Five");  
       
       System.out.println(set);
       
       // returns true  
        System.out.println(set.remove("One"));  
        
         System.out.println(set);

```





### SortedSet Interface

SortedSet is the alternate of Set interface that provides a total ordering on its elements. The elements of the SortedSet are arranged in the increasing (ascending) order. The SortedSet provides the additional methods that inhibit the natural ordering of the elements.

The SortedSet can be instantiated as:

```java
SortedSet<data-type> set = new TreeSet();  
```

#### TreeSet

Java TreeSet class implements the Set interface that uses a tree for storage. Like HashSet, TreeSet also contains unique elements. However, the access and retrieval time of TreeSet is quite fast. The elements in TreeSet stored in ascending order.

```java
//Creating and adding elements  
TreeSet<String> set=new TreeSet<String>();  
set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay");  
//traversing elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
    System.out.println(itr.next());  
}  
```

Java TreeSet class implements the Set interface that uses a tree for storage.


* Java TreeSet class contains unique elements only like HashSet.
* Java TreeSet class access and retrieval times are quiet fast.
* Java TreeSet class doesn't allow null element.
* Java TreeSet class is non synchronized.
* Java TreeSet class maintains ascending order.

As shown in the above diagram, Java TreeSet class implements the NavigableSet interface. The NavigableSet interface extends SortedSet, Set, Collection and Iterable interfaces in hierarchical order.

* TreeSet()	It is used to construct an empty tree set that will be sorted in ascending order according to the natural order of the tree set.
* TreeSet(Collection<? extends E> c)	It is used to build a new tree set that contains the elements of the collection c.
* TreeSet(Comparator<? super E> comparator)	It is used to construct an empty tree set that will be sorted according to given comparator.
* TreeSet(SortedSet<E> s)	It is used to build a TreeSet that contains the elements of the given SortedSet.
![image](https://user-images.githubusercontent.com/25869911/165628612-f1b6d2b0-bea1-41bd-bd70-c16e449b0194.png)


* boolean add(E e)	It is used to add the specified element to this set if it is not already present.
* boolean addAll(Collection<? extends E> c)	It is used to add all of the elements in the specified collection to this set.
* E ceiling(E e)	It returns the equal or closest greatest element of the specified element from the set, or null there is no such element.
* Comparator<? super E> comparator()	It returns comparator that arranged elements in order.
* Iterator descendingIterator()	It is used iterate the elements in descending order.
* NavigableSet descendingSet()	It returns the elements in reverse order.
* E floor(E e)	It returns the equal or closest least element of the specified element from the set, or null there is no such element.
* SortedSet headSet(E toElement)	It returns the group of elements that are less than the specified element.
* NavigableSet headSet(E toElement, boolean inclusive)	It returns the group of elements that are less than or equal to(if, inclusive is true) the specified element.
* E higher(E e)	It returns the closest greatest element of the specified element from the set, or null there is no such element.
* Iterator iterator()	It is used to iterate the elements in ascending order.
* E lower(E e)	It returns the closest least element of the specified element from the set, or null there is no such element.
* E pollFirst()	It is used to retrieve and remove the lowest(first) element.
* E pollLast()	It is used to retrieve and remove the highest(last) element.
* Spliterator spliterator()	It is used to create a late-binding and fail-fast spliterator over the elements.
NavigableSet subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)	It returns a set of elements that lie between the given range.
* SortedSet subSet(E fromElement, E toElement))	It returns a set of elements that lie between the given range which includes fromElement and excludes toElement.
* SortedSet tailSet(E fromElement)	It returns a set of elements that are greater than or equal to the specified element.
* NavigableSet tailSet(E fromElement, boolean inclusive)	It returns a set of elements that are greater than or equal to (if, inclusive is true) the specified element.
* boolean contains(Object o)	It returns true if this set contains the specified element.
* boolean isEmpty()	It returns true if this set contains no elements.
* boolean remove(Object o)	It is used to remove the specified element from this set if it is present.
* void clear()	It is used to remove all of the elements from this set.
* Object clone()	It returns a shallow copy of this TreeSet instance.
* E first()	It returns the first (lowest) element currently in this sorted set.
* E last()	It returns the last (highest) element currently in this sorted set.
* int size()	It returns the number of elements in this set.





```java
 TreeSet<String> al = new TreeSet<String>();
        al.add("Ravi");  
        al.add("Vijay");  
        al.add("Ravi");  
        al.add("Ajay");  
        System.out.println(al);
        
        System.out.println("Traversing element through Iterator in descending order");  
         Iterator i=al.descendingIterator();  
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }  
         
         TreeSet<Integer> set=new TreeSet<Integer>();  
         set.add(24);  
         set.add(66);  
         set.add(12);  
         set.add(15);  
         System.out.println("Highest Value: "+set.pollFirst());  
         System.out.println("Lowest Value: "+set.pollLast());  
         
         TreeSet<String> set2=new TreeSet<String>();  
         set2.add("A");  
         set2.add("B");  
         set2.add("C");  
         set2.add("D");  
         set2.add("E");  
         
        System.out.println("set Value: "+set2);  
         
         System.out.println("Reverse Set: "+set2.descendingSet());  
           
         System.out.println("Head Set: "+set2.headSet("C", true));  
          
         System.out.println("SubSet: "+set2.subSet("A", false, "E", true));  
           
         System.out.println("TailSet: "+set2.tailSet("C", false));  
         
         System.out.println("Head Set: "+set2.headSet("C"));  
          
         System.out.println("SubSet: "+set2.subSet("A", "E"));  
           
         System.out.println("TailSet: "+set2.tailSet("C"));  

```
