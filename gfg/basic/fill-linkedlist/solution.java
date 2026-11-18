class Solution {
    public void addFirst(LinkedList<Integer> l, int x) {
        // code here
        l.addFirst(x);
    }

    public void addLast(LinkedList<Integer> l, int x) {
        // code here
        l.addLast(x);
    }

        
    public int removeFirst(LinkedList<Integer> l) {
        // code here
        if(l.isEmpty()){
           return -1; 
        }
     return   l.removeFirst();
    }
        

    public int removeLast(LinkedList<Integer> l) {
        // code here
        if(l.isEmpty()){
            return -1;
        }
      
       return l.removeLast();
       
        
    }

    public int get(LinkedList<Integer> l, int index) {
        // code here
        if(l.isEmpty() || index<0 || index>=l.size()){
            return -1;
        }
        
        return l.get(index);
    }

    public int size(LinkedList<Integer> l) {
        // code here
        return l.size();
    }
}