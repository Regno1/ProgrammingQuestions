# Java Streams Filter

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer array  **arr[],**  return the **maximum odd element.** 

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4]
Output: 3
Explanation: Odd elements are 1, 3. The max is 3.
```

```
Input: arr[] = [3, 2, 1]
Output: 3
Explanation: Odd elements are 3, 1. The max is 3.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T14:17:23.401Z  

```java
class Solution {
    public static int filterUsingStreams(int[] arr) {
        // code here
        int result = Arrays.stream(arr)
        .sorted()
        .filter(n->n%2==1)
        .max()
        .orElse(-1);
                    
        return result;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-streams-filter/1)