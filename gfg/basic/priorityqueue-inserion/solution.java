class Solution {
    public static PriorityQueue<Integer> insertion(ArrayList<Integer> arr) {
        // code here
        PriorityQueue<Integer> i= new PriorityQueue<Integer>();
        
        for(int k:arr){
            i.add(k);
        }
        return i;
    }
}