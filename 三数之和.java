class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int x=0;
        int count = 0;
        boolean flag=false;
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        int left = 0;
        int right = nums.length-1;
        for(int i = 0;i<nums.length-2;i++){
            left=i+1;
            right=nums.length-1;
            count = nums[i]+nums[left]+nums[right];
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while(left<right){
                count = nums[i]+nums[left]+nums[right];
                if(count>0){
                    right--;

                }else if(count<0){
                    left++;
                }else{
                    result.add(Arrays.asList(nums[left], nums[i], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }
            }
        }
        return result;
    }
}