# UltimateDataStructures-Algorithms
#### Data Structures Exercises

<em> To help me better understand data structures, I've build a few from scratch from given exercise prompts from [@mosh-hamedani](https://github.com/mosh-hamedani)'s
Ultimate Data Structures and Algorithms course where he goes over data structures' behaviors and then tells us to build the
data structure from scratch, along with method doc strings for us to create methods from.</em> 

## int Array Class & Methods
***September 11th - 12th, 2019***

## Journey Update

***September 12th 2019*** 


***1:42 a.m:** <em>Implementing an Array from scratch refreshed a lot of concepts from my Data Structures class. For example, I remembered why insert() is amortized O(1), its because the worst case happens so infrequently that on average insert() computes at O(1) time due from the resizing of the internal array when capacity is met. The inser() method knows to create an internal Array of double the size and move everything from the previous Array into the new one which would take O(n) time. I had fun relearning that, and implementing the rest of the methods, on to linked list!</em>*

## Method Descriptions

Finished building an Array class from scratch with the following methods: 

```java 
public void insert(int item);
```
 > Takes in an int argument and inserts that given element at the end of the Array, if the capacity of the Array is met it will double the space.
 <br>
 <br>
 
```java
public void removeAt(int index);
```
> Takes in an int argument which represents an index, and removes the int element at that particular index, if it doesn't exist then it throws an IllegalArgumentException().
<br>
<br>
 
```java
public int indexOf(int element);
```
> Returns the index of the given value if it exists, OW returns -1.
<br>
<br>

```java
public void print();
```
> Prints the Array onto the console/terminal.
<br>
<br>

```java
public int max();
```
> Returns the largest numer.
<br>
<br> 

```java
public Array intersect(Array arr);
```
> Returns the common items in the Array calling the method, and the inputed Array argument.
<br>
<br> 

```java
public void reverse();
```
> Reverses array order.

>For example, if the array includes [1, 2, 3, 4], after reversing and printing it, we should see [4, 3, 2, 1].
<br>
<br> 

```java
public void insertAt(int item, int index);
```
> Insert an item at a given index.


## Singly-Linked List Class & Methods
***September 13th - 19th, 2019***

## Journey Update

***September 19th 2019*** 


***3:53 a.m:** <em>I had a lot of fun with this one, I've always liked linked lists becuase they're so easy to visualize and draw out. This exercise helped me relearn how to traverse through a linked list using an extra node to traverse through it, and sometimes another one to keep track of the Node behind the traversing Node. I implemented addFirst, addLast, deleteFirst, deleteLast, contains, indexOf methods and without realizing had started implementing the remove method which wasn't part of the given methods to implement. That's how I knew I was having fun, I completely disregarded the bounds set upon on this exercise and went above what was asked. Next, I will implement a print, and a reverse method for this linked list.</em>*

## Method Descriptions

Finished building a Linked list class from scratch with the following methods: 

```java 
public void addFirst(int val);
```
 > Adds a new Node containing val as its value at the front of the linked list.
 <br>
 <br>
 
```java
public void addLast(int val);
```
> Adds a new Node containing val as its value at the back of the linked list.
<br>
<br>
 
```java
public boolean isEmpty();
```
> Returns true if the linked list is empty, otherwise returns false.
<br>
<br>

```java
public void deleteFirst();
```
> Deletes the first node in the linked list if the linked list isn't empty, otherwise throws an IllegalArgumentException().
<br>
<br>

```java
public void deleteLast();
```
> Deletes the last node in the linked list if the linked list isn't empty, otherwise throws an IllegalArgumentException().
<br>
<br> 

```java
public void remove(int val);
```
> Removes the first instance of a Node that contains val as its value.
<br>
<br> 

```java
public int indexOf(int val);
```
> Returns the index at which the Node containing val as its value is at in the linked list.
<br>
<br> 

```java
public int size();
```
> Returns the number of Nodes in our linked list.
<br>
<br> 

```java
public boolean contains(int val);
```
> Returns true if the linked list contains a Node which contains val as its value.
