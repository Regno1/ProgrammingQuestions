# Remove Invalid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a string `s` that contains parentheses and letters, remove the minimum number of invalid parentheses to make the input string valid.

Return  *a list of  **unique strings**  that are valid with the minimum number of removals*. You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: s = "()())()"
Output: ["(())()","()()()"]

```

 **Example 2:** 

```
Input: s = "(a)())()"
Output: ["(a())()","(a)()()"]

```

 **Example 3:** 

```
Input: s = ")("
Output: [""]

```

 

 **Constraints:** 

- 1 <= s.length <= 25
- s consists of lowercase English letters and parentheses '(' and ')'.
- There will be at most 20 parentheses in s.

## Solution

**Language:** Java  
**Runtime:** 51 ms (beats 68.32%)  
**Memory:** 47.8 MB (beats 31.17%)  
**Submitted:** 2026-10-07T15:41:30.724Z  

```java
class Solution {

    public List<String> removeInvalidParentheses(String s) {

        List<String> answer = new ArrayList<>();

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.offer(s);
        visited.add(s);

        boolean found = false;

        while (!queue.isEmpty()) {

            int size = queue.size();

            // Process only the current BFS level
            for (int i = 0; i < size; i++) {

                String current = queue.poll();

                // Check whether current string is valid
                if (isValid(current)) {
                    answer.add(current);
                    found = true;
                }

                // If valid strings are found,
                // don't generate the next level
                if (found) {
                    continue;
                }

                // Remove one parenthesis
                for (int j = 0; j < current.length(); j++) {

                    char ch = current.charAt(j);

                    // We can remove only parentheses
                    if (ch != '(' && ch != ')') {
                        continue;
                    }

                    String next =
                            current.substring(0, j)
                            + current.substring(j + 1);

                    // Avoid duplicate strings
                    if (!visited.contains(next)) {
                        visited.add(next);
                        queue.offer(next);
                    }
                }
            }

            // First valid level = minimum removals
            if (found) {
                break;
            }
        }

        return answer;
    }

    private boolean isValid(String s) {

        int count = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                count++;
            }
            else if (ch == ')') {
                count--;

                // More closing brackets than opening brackets
                if (count < 0) {
                    return false;
                }
            }
        }

        // All opening brackets must also be matched
        return count == 0;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-invalid-parentheses/)