class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longestStreak = 0;
        for(int num:nums){
            set.add(num);
        }
        for(int num :set){
            if(!set.contains(num-1))
            {
                int currentNum = num; // 从老大开始
                int currentLen = 1;

                while(set.contains(currentNum+1)){
                    currentNum =currentNum+1;
                    currentLen= currentLen+1;
                }
                longestStreak=Math.max(longestStreak,currentLen);
            }



        }
        return longestStreak;
    }
}