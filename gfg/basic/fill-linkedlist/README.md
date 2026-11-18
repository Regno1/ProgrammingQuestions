# Java LinkedList Operations

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Implement the following operations on a LinkedList l:

- void addFirst(LinkedList l, int x): Add the element x to the front of the LinkedList.
- void addLast(LinkedList l, int x): Add the element x to the end of the LinkedList.
- int removeFirst(LinkedList l): Remove and return the first element of the LinkedList. If the LinkedList is empty, return -1.
- int removeLast(LinkedList l): Remove and return the last element of the LinkedList. If the LinkedList is empty, return -1.
- int get(LinkedList l, int index): Return the element at the specified index. If the index is invalid or the LinkedList is empty, return -1.
- int size(LinkedList l): Return the number of elements currently present in the LinkedList.

You are given a sequence of q queries, represented in numeric form:

- 1 x - Call addFirst(l, x)
- 2 x - Call addLast(l, x)
- 3 - Call removeFirst(l)
- 4 - Call removeLast(l)
- 5 index - Call get(l, index)
- 6 - Call size(l)

The driver code will process the queries, call the corresponding functions, and print the outputs of removeFirst(), removeLast(), get(), and size() operations. You only need to implement the above six functions.

 **Examples:** 

```
Input: queries[][] = [[1, 10], [2, 20], [1, 5], [3], [5, 1], [6]]
Output: [5, 20, 2]
Explanation: Operations on the LinkedList will process as follows:
addFirst(10): Add 10 to the front. LinkedList = [10].
addLast(20): Add 20 to the back. LinkedList = [10, 20].
addFirst(5): Add 5 to the front. LinkedList = [5, 10, 20].
removeFirst(): Remove and return the first element (5). LinkedList = [10, 20].
get(1): Return the element at index 1, which is 20.
size(): The list contains two elements, so return 2.
```

```
Input: queries[][] = [[2, 4], [2, 8], [4], [6], [3], [6]]
Output: [8, 1, 4, 0]
Explanation: Operations on the LinkedList will process as follows:
addLast(4): Add 4 to the back. LinkedList = [4].
addLast(8): Add 8 to the back. LinkedList = [4, 8].
removeLast(): Remove and return the last element (8). LinkedList = [4].
size(): The list contains one element, so return 1.
removeFirst(): Remove and return the first element (4). LinkedList = [].
size(): The list contains zero elements, so return 0.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T16:33:33.313Z  

```java
class Solution {
    public void addFirst(LinkedList<Integer> l, int x) {
        // code here
        l.addFirst(x);
    }

    public void addLast(LinkedList<Integer> l, int x) {
        // code here
        l.addLast(x);
    }

        
    public int removeFirst(LinkedList<Integer> l) {
        // code here
        if(l.isEmpty()){
           return -1; 
        }
     return   l.removeFirst();
    }
        

    public int removeLast(LinkedList<Integer> l) {
        // code here
        if(l.isEmpty()){
            return -1;
        }
      
       return l.removeLast();
       
        
    }

    public int get(LinkedList<Integer> l, int index) {
        // code here
        if(l.isEmpty() || index<0 || index>=l.size()){
            return -1;
        }
        
        return l.get(index);
    }

    public int size(LinkedList<Integer> l) {
        // code here
        return l.size();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/fill-linkedlist/1)