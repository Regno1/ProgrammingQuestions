# Java Date and Day

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Java Calendar class is an abstract class that provides methods for converting date between a specific instant in time and a set of calendar fields such as MONTH, YEAR, HOUR, etc.

Given the day, month and year. Find what weekday it was. 

 **Examples:** 

```
Input: day = 17, month = 3, year = 2017
Output: FRIDAY
Explanation:

On 17th of March 2017 day is Friday

```

```
Input: day = 29, month = 11, year = 2021
Output: MONDAY
Explanation: Monday was the day on 29th November 2021
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T18:05:04.901Z  

```java

class Solution {
    static String findDay(int day, int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/java-date-and-day5024/1)