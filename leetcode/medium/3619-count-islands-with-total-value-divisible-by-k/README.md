# Count Islands With Total Value Divisible by K

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an `m x n` matrix `grid` and a positive integer `k`. An  **island**  is a group of  **positive**  integers (representing land) that are  **4-directionally**  connected (horizontally or vertically).

The  **total value**  of an island is the sum of the values of all cells in the island.

Return the number of islands with a total value  **divisible by**  `k`.

 

 **Example 1:** 

 **Input:**  grid = [[0,2,1,0,0],[0,5,0,0,5],[0,0,1,0,0],[0,1,4,7,0],[0,2,0,0,8]], k = 5

 **Output:**  2

 **Explanation:** 

The grid contains four islands. The islands highlighted in blue have a total value that is divisible by 5, while the islands highlighted in red do not.

 **Example 2:** 

 **Input:**  grid = [[3,0,3,0], [0,3,0,3], [3,0,3,0]], k = 3

 **Output:**  6

 **Explanation:** 

The grid contains six islands, each with a total value that is divisible by 3.

 

 **Constraints:** 

- m == grid.length
- n == grid[i].length
- 1 <= m, n <= 1000
- 1 <= m * n <= 105
- 0 <= grid[i][j] <= 106
- 1 <= k <= 106

## Solution

**Language:** Java  
**Runtime:** 24 ms (beats 41.96%)  
**Memory:** 109.6 MB (beats 76.47%)  
**Submitted:** 2026-10-26T12:07:48.976Z  

```java
class Solution {
    int m, n;
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    long dfs(int i, int j, int[][] grid) {
        long sum = grid[i][j];
        grid[i][j] = 0;

        for (int[] dir : directions) {
            int i_ = i + dir[0];
            int j_ = j + dir[1];

            if (i_ >= 0 && i_ < m && j_ >= 0 && j_ < n && grid[i_][j_] > 0) {
                sum += dfs(i_, j_, grid);
            }
        }

        return sum;
    }

    // Placeholder from your C++ code, filled in. Not called below.
    long bfs(int si, int sj, int[][] grid) {
        long sum = grid[si][sj];
        grid[si][sj] = 0;

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{si, sj});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int[] dir : directions) {
                int i_ = cur[0] + dir[0];
                int j_ = cur[1] + dir[1];

                if (i_ >= 0 && i_ < m && j_ >= 0 && j_ < n && grid[i_][j_] > 0) {
                    sum += grid[i_][j_];
                    grid[i_][j_] = 0;
                    queue.offer(new int[]{i_, j_});
                }
            }
        }

        return sum;
    }

    public int countIslands(int[][] grid, int k) {
        m = grid.length;
        n = grid[0].length;

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    long sum = dfs(i, j, grid);
                    if (sum % k == 0)
                        count++;
                }
            }
        }

        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-islands-with-total-value-divisible-by-k/)