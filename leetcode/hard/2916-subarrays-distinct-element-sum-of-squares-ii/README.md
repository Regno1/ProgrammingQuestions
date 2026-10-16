# Subarrays Distinct Element Sum of Squares II

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given a  **0-indexed** integer array `nums`.

The  **distinct count**  of a subarray of `nums` is defined as:

- Let nums[i..j] be a subarray of nums consisting of all the indices from i to j such that 0 <= i <= j < nums.length. Then the number of distinct values in nums[i..j] is called the distinct count of nums[i..j].

Return  *the sum of the  **squares**  of  **distinct counts**  of all subarrays of* `nums`.

Since the answer may be very large, return it  **modulo**  `109 + 7`.

A subarray is a contiguous  **non-empty**  sequence of elements within an array.

 

 **Example 1:** 

```
Input: nums = [1,2,1]
Output: 15
Explanation: Six possible subarrays are:
[1]: 1 distinct value
[2]: 1 distinct value
[1]: 1 distinct value
[1,2]: 2 distinct values
[2,1]: 2 distinct values
[1,2,1]: 2 distinct values
The sum of the squares of the distinct counts in all subarrays is equal to 12 + 12 + 12 + 22 + 22 + 22 = 15.

```

 **Example 2:** 

```
Input: nums = [2,2]
Output: 3
Explanation: Three possible subarrays are:
[2]: 1 distinct value
[2]: 1 distinct value
[2,2]: 1 distinct value
The sum of the squares of the distinct counts in all subarrays is equal to 12 + 12 + 12 = 3.
```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 1 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 232 ms (beats 35.71%)  
**Memory:** 91 MB (beats 75.00%)  
**Submitted:** 2026-10-16T13:41:50.966Z  

```java
class Solution {
    static final long MOD = 1_000_000_007;

    long[] sum;
    long[] sq;
    long[] lazy;
    int n;

    public int sumCounts(int[] nums) {
        n = nums.length;

        sum = new long[4 * n];
        sq = new long[4 * n];
        lazy = new long[4 * n];

        int[] last = new int[100001];
        java.util.Arrays.fill(last, -1);

        long ans = 0;

        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int prev = last[x];

            update(1, 0, n - 1, prev + 1, i);

            ans = (ans + sq[1]) % MOD;

            last[x] = i;
        }

        return (int) ans;
    }

    void push(int node, int start, int end) {
        if (lazy[node] == 0) return;

        long val = lazy[node];
        long len = end - start + 1;

        sq[node] = (sq[node] + 2 * val * sum[node]
                    + val * val % MOD * len) % MOD;

        sum[node] = (sum[node] + val * len) % MOD;

        if (start != end) {
            lazy[node * 2] = (lazy[node * 2] + val) % MOD;
            lazy[node * 2 + 1] = (lazy[node * 2 + 1] + val) % MOD;
        }

        lazy[node] = 0;
    }

    void update(int node, int start, int end,
                int l, int r) {

        push(node, start, end);

        if (start > r || end < l) return;

        if (l <= start && end <= r) {
            long len = end - start + 1;

            sq[node] = (sq[node] + 2 * sum[node] + len) % MOD;
            sum[node] = (sum[node] + len) % MOD;

            if (start != end) {
                lazy[node * 2]++;
                lazy[node * 2] %= MOD;
                lazy[node * 2 + 1]++;
                lazy[node * 2 + 1] %= MOD;
            }

            return;
        }

        int mid = start + (end - start) / 2;

        update(node * 2, start, mid, l, r);
        update(node * 2 + 1, mid + 1, end, l, r);

        sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % MOD;
        sq[node] = (sq[node * 2] + sq[node * 2 + 1]) % MOD;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-ii/)