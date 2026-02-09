import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        // 用数组记录字母出现的次数（代替排序）
        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // 初始化：先统计 p 和 s 第一个窗口的频率
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        // 如果第一个窗口匹配
        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }

        // 开始滑动窗口
        for (int i = 0; i < s.length() - p.length(); i++) {
            // 1. 窗口右移：减去左边滑出的字母，加上右边滑入的字母
            sCount[s.charAt(i) - 'a']--;          // 左边出
            sCount[s.charAt(i + p.length()) - 'a']++; // 右边进

            // 2. 比较两个数组内容是否一致
            if (Arrays.equals(pCount, sCount)) {
                result.add(i + 1);
            }
        }

        return result;
    }
}