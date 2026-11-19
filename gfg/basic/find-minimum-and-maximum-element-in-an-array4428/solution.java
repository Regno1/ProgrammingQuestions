class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> in = new ArrayList<>();
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                }

                in.add(min);
                in.add(max);
                return in;
        
    }
}
