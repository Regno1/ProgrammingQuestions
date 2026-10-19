class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> count= new ArrayList<>();
       
        for(int i=0;i<nums.length;i++){
               if(nums[i]==target){
                count.add(i);
            }
        }
        return count;
    }
}