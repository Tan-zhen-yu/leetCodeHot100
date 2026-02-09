class Solution {
    public int maxSubArray(int[] nums) {
        int count = 0;
        int max =nums[0];
        for(int i =0;i<nums.length;i++){
            count+=nums[i];
            if(max<count){
                max = count;
            }
            if(count<0){
                count = 0;
            }
            
        }
        return max;
    }
}