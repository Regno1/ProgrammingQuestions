# Minimum XOR Path in a Grid

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a 2D integer array `grid` of size `m * n`.

You start at the  **top-left**  cell `(0, 0)` and want to reach the  **bottom-right**  cell `(m - 1, n - 1)`.

At each step, you  **may**  move either  **right or down**.

The  **cost**  of a path is defined as the  **bitwise XOR**  of all the values in the cells along that path,  **including**  the start and end cells.

Return the  **minimum**  possible XOR value among all valid paths from `(0, 0)` to `(m - 1, n - 1)`.

 

 **Example 1:** 

 **Input:**  grid = [[1,2],[3,4]]

 **Output:**  6

 **Explanation:** 

There are two valid paths:

- (0, 0) → (0, 1) → (1, 1) with XOR: 1 XOR 2 XOR 4 = 7
- (0, 0) → (1, 0) → (1, 1) with XOR: 1 XOR 3 XOR 4 = 6

The minimum XOR value among all valid paths is 6.

 **Example 2:** 

 **Input:**  grid = [[6,7],[5,8]]

 **Output:**  9

 **Explanation:** 

There are two valid paths:

- (0, 0) → (0, 1) → (1, 1) with XOR: 6 XOR 7 XOR 8 = 9
- (0, 0) → (1, 0) → (1, 1) with XOR: 6 XOR 5 XOR 8 = 11

The minimum XOR value among all valid paths is 9.

 **Example 3:** 

 **Input:**  grid = [[2,7,5]]

 **Output:**  0

 **Explanation:** 

There is only one valid path:

- (0, 0) → (0, 1) → (0, 2) with XOR: 2 XOR 7 XOR 5 = 0

The XOR value of this path is 0, which is the minimum possible.

 

 **Constraints:** 

- 1 <= m == grid.length <= 1000
- 1 <= n == grid[i].length <= 1000
- m * n <= 1000
- 0 <= grid[i][j] <= 1023​

## Solution

**Language:** Java  
**Runtime:** 418 ms (beats 8.62%)  
**Memory:** 46.3 MB (beats 100.00%)  
**Submitted:** 2026-10-28T14:04:00.149Z  

```java
class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // dp[i][j] = BitSet of size 1024, index = XOR value, bit = reachable
        BitSet[][] dp = new BitSet[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = new BitSet(1024);
            }
        }

        dp[0][0].set(grid[0][0]);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0)
                    continue;

                BitSet up = new BitSet(1024);    // [i-1][j]
                BitSet left = new BitSet(1024);  // [i][j-1]

                if (i > 0) {
                    up = (BitSet) dp[i - 1][j].clone();
                }
                if (j > 0) {
                    left = (BitSet) dp[i][j - 1].clone();
                }

                BitSet combined = (BitSet) up.clone();
                combined.or(left);               // OR operation

                for (int xorVal = 0; xorVal < 1024; xorVal++) {
                    if (combined.get(xorVal)) {
                        int resultXorVal = xorVal ^ grid[i][j];
                        dp[i][j].set(resultXorVal);
                    }
                }
            }
        }

        // dp[m-1][n-1]
        for (int xorVal = 0; xorVal < 1024; xorVal++) {
            if (dp[m - 1][n - 1].get(xorVal)) {
                return xorVal;
            }
        }

        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-xor-path-in-a-grid/)