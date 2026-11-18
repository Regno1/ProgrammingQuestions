class maxPriorityQueue {
    // Initialize your priority queue
     PriorityQueue<Integer> i= new PriorityQueue<Integer>(Collections.reverseOrder());
     
    public void push(int x) {
        // Insert x into the priority queue
        i.add(x);
    }

    public int pop() {
        // Remove and return the smallest element
        if(i.isEmpty()){
            return -1;
        }
    return i.poll();
        
    }

    public int peek() {
        // Return the smallest element, or -1 if empty
        if(i.isEmpty()){
            return -1;
        }
        return i.peek();
        
    }

    public boolean isEmpty() {
        // Check whether the priority queue is empty
        if(i.isEmpty()){
            return true;
        }
        return false;
    }

    public int size() {
        // Return the size of the priority queue
    return i.size();
        
    }
}
