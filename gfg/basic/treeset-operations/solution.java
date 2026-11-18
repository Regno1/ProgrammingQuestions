class MySet {

    // Insert an element into the ordered set.
    public void insert(TreeSet<Integer> s, int x) {
        // code here
        s.add(x);
    }

    // Remove an element from the ordered set if it exists.
    public void erase(TreeSet<Integer> s, int x) {

        s.remove(x);
        // code here
    }

    // Return the number of distinct elements in the set.

        
    public int size(TreeSet<Integer> s) {
        // code here
        return s.size();
    }

        
    // Return 1 if the element exists; otherwise, return -1.
    public int find(TreeSet<Integer> s, int x) {
        // code here
        if(s.contains(x)){
            return 1;
        }
        return -1;
    }
}