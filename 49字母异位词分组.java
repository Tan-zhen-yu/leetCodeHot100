class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // 1. 优化：直接使用内置排序，效率更高
            char[] chars = s.toCharArray();
            java.util.Arrays.sort(chars);
            String key = new String(chars);

            // 2. 优化：使用 computeIfAbsent，一行替代原来的 if (!map.containsKey) ...
            // 它的意思是：如果 key 不存在，就执行 new ArrayList() 并存进去
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}