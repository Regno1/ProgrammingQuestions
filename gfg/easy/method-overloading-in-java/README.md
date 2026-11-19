# Method Overloading

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given five numbers a, b, c (integers) and x, y (floating-point numbers), complete Calculator class with three methods named sum:

- sum(int a, int b): Takes two integer parameters and returns their sum as an int.
- sum(int a, int b, int c): Takes three integer parameters and returns their sum as an int.
- sum(double x, double y): Takes two double-precision floating-point parameters and returns their sum as a double.

 **Note:**  The driver code handles input reading, invokes all three overloaded methods on an instance of Calculator, and prints the results in order.

 **Example:** 

```
Input: a = 5, b = 10, c = 3, x = 15.5, y = 3.5
Output: 
15
18
19.0
Explanation: 
sum(5, 10) returns 5 + 10 = 15
sum(5, 10, 3) returns 5 + 10 + 3 = 18
sum(15.5, 3.5) returns 15.5 + 3.5 = 19.0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-19T18:35:19.409Z  

```java
class Calculator {
    // Code Here
    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
    public double sum(double x , double y){
        return  x+y;
    }

}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/method-overloading-in-java/1)