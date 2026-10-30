# Shortest Path With At Most K Consecutive Identical Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer `n` representing the number of nodes in a  **directed weighted**  graph, numbered from 0 to `n - 1`. This is represented by a 2D integer array `edges`, where `edges[i] = [ui, vi, wi]` represents a directed edge from node `ui` to node `vi` with weight `wi`.

You are also given a string `labels` of length `n`, where `labels[i]` is the character assigned to node `i`, and an integer `k`.

Return the  **minimum**   **total**  edge weight of a path from node 0 to node `n - 1` such that the concatenation of the labels of the nodes along the path contains  **at most**  `k`  **consecutive**   **identical**  characters. If no valid path exists, return -1.

 

 **Example 1:** 

 **Input:**  n = 3, edges = [[0,1,1],[1,2,1],[0,2,3]], labels = "aab", k = 1

 **Output:**  3

 **Explanation:** 

The optimal valid path from node 0 to node 2 is as follows:

- Use edges[2] = [0, 2, 3] to reach node 2 with a weight wi = 3.
The corresponding concatenation of labels is `"ab"`, which satisfies at most `k = 1` consecutive identical characters. Thus, the answer is 3.

 **Example 2:** 

 **Input:**  n = 3, edges = [[0,1,1],[1,2,1],[0,2,3]], labels = "aab", k = 2

 **Output:**  2

 **Explanation:** 

The optimal valid path from node 0 to node 2 is as follows:

- Use edges[0] = [0, 1, 1] to reach node 1 with weight wi = 1.
- Use edges[1] = [1, 2, 1] to reach node 2 with weight wi = 1.
The corresponding concatenation of labels is `"aab"`, which satisfies at most `k = 2` consecutive identical characters. Thus, the answer is 2.

 **Example 3:** 

 **Input:**  n = 3, edges = [[0,1,1],[1,2,1]], labels = "aaa", k = 2

 **Output:**  -1

 **Explanation:** 

There is no valid path from node 0 to node 2 that satisfies at most `k = 2` consecutive identical characters. Thus, the answer is -1.

 

 **Constraints:** 

- 1 <= n == labels.length <= 5 * 104
- 0 <= edges.length <= 5 * 104
- edges[i] == [ui, vi, wi]
- 0 <= ui, vi <= n - 1
- ui != vi
- 1 <= wi <= 104
- labels consists of lowercase English letters
- 1 <= k <= 50

## Solution

**Language:** Java  
**Runtime:** 109 ms (beats 12.50%)  
**Memory:** 262.2 MB (beats 34.38%)  
**Submitted:** 2026-10-30T12:11:52.025Z  

```java
class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {

        Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int[] edge : edges) {
            int u  = edge[0];
            int v  = edge[1];
            int wt = edge[2];

            adj.computeIfAbsent(u, x -> new ArrayList<>()).add(new int[]{v, wt});
        }

        // result[node][count] = min cost to reach node with 'count' consecutive identical chars
        int[][] result = new int[n][k + 1];
        for (int[] row : result) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        // heap holds {dist, node, count}, ordered by dist
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        result[0][1] = 0;
        pq.offer(new int[]{0, 0, 1});

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int d     = top[0];
            int node  = top[1];
            int count = top[2];

            if (d > result[node][count])
                continue;

            if (node == n - 1)
                return d;

            if (!adj.containsKey(node))
                continue;

            for (int[] vec : adj.get(node)) {
                int adjNode = vec[0];
                int wt      = vec[1];

                int newCount = (labels.charAt(adjNode) == labels.charAt(node)) ? count + 1 : 1;

                if (newCount > k)
                    continue;

                int newDist = d + wt;
                if (newDist < result[adjNode][newCount]) {
                    result[adjNode][newCount] = newDist;
                    pq.offer(new int[]{newDist, adjNode, newCount});
                }
            }
        }

        return -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/shortest-path-with-at-most-k-consecutive-identical-characters/)