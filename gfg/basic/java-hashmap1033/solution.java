class Solution {
    static int map(int n, String keys[], int arr[], String s) {
        // code here
        int val=-1;
        HashMap<String,Integer> hm= new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(keys[i],arr[i]);
        }
        if(hm.containsKey(s)) val=hm.get(s);
    return val;
        
    }
}