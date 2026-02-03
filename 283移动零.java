class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0; // 慢指针

        // 1. 第一次遍历：把所有非 0 数按顺序往前挪
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
        }

        // 2. 第二次遍历：慢指针后面的位置全部补 0
        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}