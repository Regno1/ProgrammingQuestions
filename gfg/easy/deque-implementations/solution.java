class MyDeque {
    private Deque<Integer> dq;
    public MyDeque() {
        // Initialize your data structure here
        dq = new ArrayDeque<>();
    }
    

    public void addFront(int x) {
        // code here
      dq.addFirst(x);
        
    }

    public void addBack(int x) {
        // code here
        dq.addLast(x);
    }

        
    public int removeFront() {
        // code here
        if(dq.isEmpty()){
            return -1;
        }
        return dq.pollFirst();
    }
        

    public int removeBack() {
        // code here
        if(dq.isEmpty()){
            return -1;
        }
        return dq.pollLast();
        
    }

    public int elementAtFront() {
        // code here
        if(dq.isEmpty()) return -1;
        return dq.peekFirst();
        
    }

        
    public int elementAtBack() {
        // code here
        if(dq.isEmpty()) return -1;
        return dq.peekLast();
        
    }
        

    public boolean isEmpty() {
        // code here
        return dq.isEmpty();
    }

    public int size() {
        // code here
        return dq.size();
    }
}