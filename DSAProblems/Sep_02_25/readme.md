# Java LinkedList Methods with Examples

Java provides a built-in **LinkedList** class in the **`java.util`
package**.\
It implements both `List` and `Deque` interfaces, meaning it can be used
as a **list, queue, or stack**.

------------------------------------------------------------------------

##  Create a LinkedList

``` java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("Initial List: " + list);
    }
}
```

**Output:**

    Initial List: [A, B, C]

------------------------------------------------------------------------

##  Add Elements

``` java
LinkedList<String> list = new LinkedList<>();

list.add("One");             // Add at end
list.addFirst("Zero");       // Add at beginning
list.addLast("Two");         // Add at end (same as add)
list.add(1, "Middle");       // Add at index

System.out.println(list);
```

**Output:**

    [Zero, Middle, One, Two]

------------------------------------------------------------------------

##  Access Elements

``` java
System.out.println(list.get(0));      // Get element at index
System.out.println(list.getFirst());  // Get first element
System.out.println(list.getLast());   // Get last element
```

------------------------------------------------------------------------

##  Remove Elements

``` java
list.remove();           // Removes first element
list.remove(1);          // Removes element at index
list.remove("One");      // Removes specific element
list.removeFirst();      // Removes first element
list.removeLast();       // Removes last element

System.out.println(list);
```

------------------------------------------------------------------------

##  Search / Check

``` java
System.out.println(list.contains("Two")); // true/false
System.out.println(list.indexOf("Two"));  // index if found, -1 if not
System.out.println(list.size());          // number of elements
```

------------------------------------------------------------------------

## Queue/Stack Operations (Deque)

``` java
LinkedList<Integer> nums = new LinkedList<>();

nums.offer(10);     // add at end
nums.offerFirst(5); // add at beginning
nums.offerLast(15); // add at end

System.out.println(nums); // [5, 10, 15]

System.out.println(nums.poll());     // removes first -> 5
System.out.println(nums.pollLast()); // removes last -> 15
System.out.println(nums.peek());     // looks at first -> 10
```

------------------------------------------------------------------------

##  Iterate LinkedList

``` java
for (String item : list) {
    System.out.println(item);
}

// Using forEach
list.forEach(System.out::println);

// Using Iterator
Iterator<String> it = list.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

------------------------------------------------------------------------

## Summary of Important Methods

  -----------------------------------------------------------------------------
Method                                                   Description
  -------------------------------------------------------- --------------------
`add(), addFirst(), addLast()`                           Insert elements

`remove(), removeFirst(), removeLast(), remove(index)`   Remove elements

`get(), getFirst(), getLast()`                           Retrieve elements

`contains(), indexOf(), size()`                          Search/Check

`offer(), poll(), peek()`                                Queue-style
operations

`iterator(), forEach()`                                  Iteration
-----------------------------------------------------------------------------

------------------------------------------------------------------------

 **Prepared for Learning Java Collections (LinkedList)**
