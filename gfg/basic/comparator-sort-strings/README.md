# Sort Strings Ignoring Case

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string array  **arr[]**, sort the array lexicographically while ignoring the case.

 **Examples:** 

```
Input: arr[] = ["Abc", "Xyz", "fghfg", "adas", "tuTY", "dsa"]
Output: Abc adas dsa fghfg tuTY Xyz
Explanation: We ignore the case and sort it lexicographically, so we get Abc adas dsa fghfg tuTY Xyz.
```

```
Input: arr[] = ["week", "GEEKS"]
Output: GEEKS week
Explanation: We ignore the case and sort it lexicographically, so we get GEEKS week.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T16:07:19.567Z  

```java
class Solution {
    public static void sortByComparator(String[] arr) {
        // code here
        Arrays.sort(arr,String::compareToIgnoreCase);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/comparator-sort-strings/1)