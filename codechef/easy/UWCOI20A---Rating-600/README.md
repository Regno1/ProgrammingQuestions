# UWCOI20A - Rating 600

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-05T16:04:47.941Z  

```java
public static String solve(int N, int X, int[] A) {
        String a= "NO";
        for(int i=0;i<N;i++){
            if(X==A[i]){
            
                a="YES";
                return a;
            }
        }
        return a;
        
}
```

---

[View on CodeChef](https://www.codechef.com/problems/UWCOI20A)