class Solution {
    public static double avgUsingStreams(int[] arr) {
        // code here
        double a=0;
        a=Arrays.stream(arr).average().getAsDouble();
    
        return a;
    }
}