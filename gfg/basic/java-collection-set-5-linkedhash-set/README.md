# Java LinkedHashSet Operations

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Implement the following operations on a LinkedHashSet s:

- void add(LinkedHashSet s, int x): Add the element x to the set. If x is already present, do nothing.
- void remove(LinkedHashSet s, int x): Remove the element x from the set if it is present.
- boolean contains(LinkedHashSet s, int x): Return true if x exists in the set; otherwise, return false.
- int size(LinkedHashSet s): Return the number of elements currently present in the set.
- boolean isEmpty(LinkedHashSet s): Return true if the set contains no elements; otherwise, return false.

You are given a sequence of q queries, represented in numeric form:

- 1 x - Call add(s, x)
- 2 x - Call remove(s, x)
- 3 x - Call contains(s, x)
- 4 - Call size(s)
- 5 - Call isEmpty(s)

The driver code will process the queries, call the corresponding functions, and print the outputs of contains(), size(), and isEmpty() operations. You only need to implement the above five functions.

 **Examples:** 

```
Input: queries[][] = [[1, 10], [1, 5], [1, 10], [3, 10], [2, 5], [4], [5]]
Output: [true, 1, false]
Explanation: Operations on the LinkedHashSet will process as follows:
add(10): Add 10 to the set. LinkedHashSet = [10].
add(5): Add 5 to the set. LinkedHashSet = [10, 5].
add(10): 10 is already in the set, so no duplicate is added. LinkedHashSet = [10, 5].
contains(10): 10 is present in the set, so return true.
remove(5): Remove 5 from the set. LinkedHashSet = [10].
size(): The set contains one element, so return 1.
isEmpty(): The set is not empty, so return false.
```

```
Input: queries[][] = [[1, 4], [5], [2, 4], [5], [3, 4], [4]]
Output: [false, true, false, 0]
Explanation: Operations on the LinkedHashSet will process as follows:
add(4): Add 4 to the set. LinkedHashSet = [4].
isEmpty(): The set is not empty, so return false.
remove(4): Remove 4 from the set. LinkedHashSet = [].
isEmpty(): The set is empty, so return true.
contains(4): 4 is not present in the set, so return false.
size(): The set contains zero elements, so return 0.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T18:25:26.145Z  

```java
class Solution {
    public void add(LinkedHashSet<Integer> s, int x) {
        // code here
        s.add(x);
    }

    public void remove(LinkedHashSet<Integer> s, int x) {
        // code here
        s.remove(x);
    }

        
    public boolean contains(LinkedHashSet<Integer> s, int x) {
        // code here
       return s.contains(x);
       
    }
        

    public int size(LinkedHashSet<Integer> s) {
        // code here
        return s.size();
        
    }

    public boolean isEmpty(LinkedHashSet<Integer> s) {
        // code here
        return s.isEmpty();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-collection-set-5-linkedhash-set/1)