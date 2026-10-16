/*
The interface looks like

interface Add {
    public int addParameters(int a, int b);
}
*/

class Solution {
    public static Add helperFunction() {
        // Your code here
        Add m= (a,b)->{return a+b;};
        return m;

        // Implement the addParameters method that returns a+b.
    }
}