# Method Overriding

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Implement classes  **Employee**  and  **SalesEmployee**  to demonstrate method overriding.

Employee has following attributes:

- id (int),
- salary (int),
- A constructor with parameters id and salary and,
- A method getInfo() returning the string “EmployeeID:{id} Salary:{salary}”.

SalesEmployee inherits from Employee with an additional attributes:

- sales (int, defaults to 0 if not provided),
- A constructor with parameters id, salary and sales, and calls constructor of Employee with id and salary,
- Overrides getInfo() to return the string “EmployeeID:{id} Salary:{salary} Sales:{sales}”.

 **Note:**  The driver code handles class instantiation and output printing.

 **Examples:** 

```
Input: id = 103, salary = 70000, sales = 300
Output: EmployeeID:103 Salary:70000
        EmployeeID:103 Salary:70000 Sales:300
Explanation: Employee returns its own info string. SalesEmployee overrides getInfo() to add the sales value, so its output includes Sales:300.

```

```
Input: id = 7, salary = 25000, sales = 0

Output: EmployeeID:7 Salary:25000
        EmployeeID:7 Salary:25000 Sales:0

Explanation: Employee returns its own info string. SalesEmployee has sales 0, and its overridden getInfo() still prints Sales:0.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T19:18:18.733Z  

```java
class Employee {
   // Code Here
   int id;
   int salary;
   
   public Employee(int id,int salary){
       this.id=id;
       this.salary=salary;
   }
   
   public String getInfo(){
    return "EmployeeID:" + id + " Salary:" + salary;   
   }
   
}

class SalesEmployee extends Employee {
   // Code Here
   int sales=0;
    
   public SalesEmployee(int id,int salary){
      super(id,salary);
   }
   
    public SalesEmployee(int id, int salary, int sales){
      super(id,salary);
       this.sales=sales;
   }
   
   
   public String getInfo(){
       return super.getInfo()+ " Sales:" + sales;
   }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/method-overriding-in-python/1)