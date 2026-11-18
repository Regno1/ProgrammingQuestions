class Solution {
    public static LinkedList<Integer> insertion(int arr[]) {
        // Your code here
        LinkedList<Integer> i= new LinkedList<Integer>() ;
        Arrays.stream(arr).forEach(n-> i.add(n));
        return i;
    }
}