# Minimum Add to Make Parentheses Valid

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A parentheses string is valid if and only if:

- It is the empty string,
- It can be written as AB (A concatenated with B), where A and B are valid strings, or
- It can be written as (A), where A is a valid string.

You are given a parentheses string `s`. In one move, you can insert a parenthesis at any position of the string.

- For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".

Return  *the minimum number of moves required to make* `s` *valid*.

 

 **Example 1:** 

```
Input: s = "())"
Output: 1

```

 **Example 2:** 

```
Input: s = "((("
Output: 3

```

 

 **Constraints:** 

- 1 <= s.length <= 1000
- s[i] is either '(' or ')'.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 42.17%)  
**Memory:** 42.9 MB (beats 57.28%)  
**Submitted:** 2026-10-06T09:36:54.788Z  

```java
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count=0;

        for(char current: s.toCharArray()){
            if(current=='('){
                stack.push(current);
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    count++;
                }
            }
        }
        return count+ stack.size();
        }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/)