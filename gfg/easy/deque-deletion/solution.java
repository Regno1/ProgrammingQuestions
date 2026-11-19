class Solution {
    public void eraseAt(ArrayDeque<Integer> deq, int x) {
        // code here
        if (x < 0 || x >= deq.size()) return;

                Iterator<Integer> it = deq.iterator();
                int index = 0;
                while (it.hasNext()) {
                    it.next();
                    if (index == x) {
                        it.remove();
                        break;
                    }
                    index++;
                }
    }

    public void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        // code here
       if (start < 0 || end > deq.size() || start >= end) return;

               for (int i = 0; i < end - start; i++) {
                   eraseAt(deq, start);
               }
        
    }

        
    public void eraseAll(ArrayDeque<Integer> deq) {
        // code here
        deq.clear();
    }
}