# Maximum Alternating Sum of Squares

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums`. You may  **rearrange the elements**  in any order.

The  **alternating score**  of an array `arr` is defined as:

- score = arr[0]2 - arr[1]2 + arr[2]2 - arr[3]2 +...

Return an integer denoting the  **maximum possible alternating score**  of `nums` after rearranging its elements.

 

 **Example 1:** 

 **Input:**  nums = [1,2,3]

 **Output:**  12

 **Explanation:** 

A possible rearrangement for `nums` is `[2,1,3]`, which gives the maximum alternating score among all possible rearrangements.

The alternating score is calculated as:

`score = 22 - 12 + 32 = 4 - 1 + 9 = 12`

 **Example 2:** 

 **Input:**  nums = [1,-1,2,-2,3,-3]

 **Output:**  16

 **Explanation:** 

A possible rearrangement for `nums` is `[-3,-1,-2,1,3,2]`, which gives the maximum alternating score among all possible rearrangements.

The alternating score is calculated as:

`score = (-3)2 - (-1)2 + (-2)2 - (1)2 + (3)2 - (2)2 = 9 - 1 + 4 - 1 + 9 - 4 = 16`

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -4  *104 <= nums[i] <= 4*  104

## Solution

**Language:** Java  
**Runtime:** 37 ms (beats 26.76%)  
**Memory:** 135.3 MB (beats 44.37%)  
**Submitted:** 2026-10-13T14:50:11.031Z  

```java
import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squares = new long[n];

        // Step 1: Calculate the square of each number
        for (int i = 0; i < n; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }

        // Step 2: Sort squares in ascending order
        Arrays.sort(squares);

        long score = 0;

        // Step 3: Subtract the smallest n/2 squares
        for (int i = 0; i < n / 2; i++) {
            score -= squares[i];
        }

        // Step 4: Add the remaining squares
        for (int i = n / 2; i < n; i++) {
            score += squares[i];
        }

        // Step 5: Return the maximum score
        return score;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-alternating-sum-of-squares/)