# Java Interface

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Like a class, an interface can have methods and variables, but the methods declared in interface are by default abstract (only method signature, no body).  

Given an inteface in1 which includes a method display which takes an integer as input.

```
interface in1
{
    void display(int p);
}
```

Task is to write a class testClass which implements interface in1 and has a method named display which takes an integer as input and output total number of prime numbers between 2 and integer k (including it). Main function in written for you in the editor.

 **Input:** 
The first line will contain an integer  **T** (number of test cases). Each test case consists of an integer n.

 **Output:** 
Print total number of prime numbers between 2 and the given number (including them).

 **Constraints:** 
1 < =  **T**  < = 1000
2<= n <= 104

**Example:
Input:**
2
13
19

 **Output:** 
6
8

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T15:31:56.897Z  

```java
class testClass implements in1 {
    public void display(int k) {
        // Add your code here.
      int count=0;
      for(int i=2;i<=k;i++){
          if(isPrime(i)){
              count++;
          }
          
      }
      System.out.println(count);
}
private boolean isPrime(int n){
    if(n<=1) return false;
    for(int i=2;i*i<=n;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-interface/1)