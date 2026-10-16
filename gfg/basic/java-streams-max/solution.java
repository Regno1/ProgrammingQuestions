class Solution {
    public static int maxUsingStreams(int[] arr) {
        // code here
        int max=Arrays.stream(arr).max().getAsInt();
        return max;
    }
}