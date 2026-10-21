# Minimum Operations to Sort a String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` consisting of lowercase English letters.

In one operation, you can select any  **substring**  of `s` that is  **not**  the entire string and  **sort**  it in  **non-descending alphabetical**  order.

Return the  **minimum**  number of operations required to make `s` sorted in  **non-descending**  order. If it is not possible, return -1.

 

 **Example 1:** 

 **Input:**  s = "dog"

 **Output:**  1

 **Explanation:** ​​​​​​​

- Sort substring "og" to "go".
- Now, s = "dgo", which is sorted in ascending order. Thus, the answer is 1.

 **Example 2:** 

 **Input:**  s = "card"

 **Output:**  2

 **Explanation:** 

- Sort substring "car" to "acr", so s = "acrd".
- Sort substring "rd" to "dr", making s = "acdr", which is sorted in ascending order. Thus, the answer is 2.

 **Example 3:** 

 **Input:**  s = "gf"

 **Output:**  -1

 **Explanation:** 

- It is impossible to sort s under the given constraints. Thus, the answer is -1.

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 11 ms (beats 89.71%)  
**Memory:** 47.3 MB (beats 92.65%)  
**Submitted:** 2026-10-21T13:13:29.166Z  

```java
class Solution {
    public int minOperations(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();

        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            return 0;
        }

        if (n == 2) {
            return -1;
        }

        char minChar = arr[0];
        char maxChar = arr[0];
        for (int i = 1; i < n; i++) {
            minChar = (char) Math.min(minChar, arr[i]);
            maxChar = (char) Math.max(maxChar, arr[i]);
        }

        if (arr[0] == minChar || arr[n - 1] == maxChar) {
            return 1;
        }

        char minMid = arr[1];
        char maxMid = arr[1];
        for (int i = 2; i < n - 1; i++) {
            minMid = (char) Math.min(minMid, arr[i]);
            maxMid = (char) Math.max(maxMid, arr[i]);
        }

        if (arr[0] > maxMid && arr[n - 1] < minMid) {
            return 3;
        }

        return 2;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-operations-to-sort-a-string/)