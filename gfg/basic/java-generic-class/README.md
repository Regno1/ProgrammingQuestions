# Java Generic Class

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Generic Class in java  is a feature. We write code once and use it for any data type including user defined data types. Given an integer or a string as an input.Print the type of input and the given value as output.

 **Input:** 
The first line will contain an integer  **T** (number of test cases). First line of each test case will contain one integer  **c.** Next line will contain a string if c is equal to 1 or will contain a integer if c is equal to 2.

 **Output:** 
Print the type of the given data and the given value in new line.

 **Constraints:** 
1 < =  **T**  < = 100
1 < =  **c**  < = 2
1<= Length of strings, integers<=103

**Example:
Input:**
2
1
gfg
2
5

 **Output:** 
String
gfg
Integer
5

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T18:53:18.217Z  

```java
class GenericClass<T> {
   
    private T data;
    
    // Add your code here. Make a private data variable, constructor which intialize
   public GenericClass(T data){
       this.data= data;
   }
    //  the data variable and a method showType().
    public void showType(){
        System.out.println(data.getClass().getSimpleName());
        System.out.println(data);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-generic-class/1)