# Array to LinkedList in Java

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array  **arr[]**. The task is to insert elements of given array to an LinkedList and return it.

 **Example 1:** 

```
Input: arr[] = [1, 2, 3, 4]
Output: 1 2 3 4
Explanation: Simply insert into LL and return it.
```

```
Input: arr[] = [3, 2, 1]
Output: 3 2 1 
Explanation: Simply insert into LL and return it.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T14:36:20.120Z  

```java
class Solution {
    public static LinkedList<Integer> insertion(int arr[]) {
        // Your code here
        LinkedList<Integer> i= new LinkedList<Integer>() ;
        Arrays.stream(arr).forEach(n-> i.add(n));
        return i;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/linkedlist-insertion/1)