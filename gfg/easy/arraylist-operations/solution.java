class Solution {
    public void add(ArrayList<Integer> a, int x) {
        // code here
        a.add(x);
        
    }

    public int remove(ArrayList<Integer> a) {
        // code here
        if(a.isEmpty()) return -1;
        return a.remove(a.size()-1);
    }

        
    public int get(ArrayList<Integer> a, int index) {
        // code here
        if(a.isEmpty()) return -1;
        return a.get(index);
    }
        

    public void reverse(ArrayList<Integer> a) {
        // code here
        Collections.reverse(a);
        
    }

    public void sort(ArrayList<Integer> a) {
        
        // code here
        Collections.sort(a);
    }

    public int size(ArrayList<Integer> a) {
        // code here
       return a.size();
    }
}