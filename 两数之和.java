class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Key 存数值，Value 存对应的索引
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // 绝招：不需要第二层循环，直接问 Map 另一半在不在
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // 如果不在，把自己存进去，给后面的人用
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}