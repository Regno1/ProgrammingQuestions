class Solution {
    public static int filterUsingStreams(int[] arr) {
        // code here
        int result = Arrays.stream(arr)
        .sorted()
        .filter(n->n%2==1)
        .max()
        .orElse(-1);
                    
        return result;
    }
}