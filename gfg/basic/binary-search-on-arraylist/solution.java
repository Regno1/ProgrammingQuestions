class Solution {
    public static int binarySearchAL(ArrayList<Integer> list, int k) {
        // Your code here
        int a=-1;
        if(Collections.binarySearch(list,k)>=0){
            a=list.indexOf(k);
        };

        // If k in arr return 1, else return -1
        return a;
    }
}