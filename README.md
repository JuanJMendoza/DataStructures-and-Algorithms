# UltimateDataStructures-Algorithms
#### Data Structures Exercises

<em> To help me better understand data structures, I've build a few from scratch from given exercise prompts from [@mosh-hamedani](https://github.com/mosh-hamedani)'s
Ultimate Data Structures and Algorithms course where he goes over data structures' behaviors and then tells us to build the
data structure from scratch, along with method doc strings for us to create methods from.</em> 

## int Array Class & Methods
***September 11th, 2019***

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
