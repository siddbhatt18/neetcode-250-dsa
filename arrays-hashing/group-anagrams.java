class Solution {
    // time complexity = O(m * n)
    // space complexity = O(m * n)
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        Map<String, List<String>> hm = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int count[] = new int[26];
            for(int j = 0; j < strs[i].length(); j++) {
                char ch = strs[i].charAt(j);
                count[ch - 'a']++;
            }
            String key = Arrays.toString(count);
            if(!hm.containsKey(key)) {
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(strs[i]);
        }
        return new ArrayList<>(hm.values());
    }
}
