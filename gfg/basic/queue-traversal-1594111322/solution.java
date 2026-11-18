class Solution {
    public ArrayList<Integer> queueTraversal(Queue<Integer> q) {
        // code here
        ArrayList<Integer> i=new ArrayList<>();
        q.stream()
        .forEach(n-> i.add(n));
        
        return i;
    }
}