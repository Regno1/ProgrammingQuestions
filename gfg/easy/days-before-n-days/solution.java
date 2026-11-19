class Solution {
    public int nthDay(int d, int n) {
        // code here
        int x= n%7;
        int y=d-x;
        
        if(y
        <0){
            y=y+7;
        } 
        return y;
    }
}