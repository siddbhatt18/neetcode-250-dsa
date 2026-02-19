class Solution {
    // time complexity = O(n * m)
    // space complexity = O(1)
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String prefix = strs[0];
        for(int i = 0; i < n; i++) {
            int j = 0;
            int minLen = Math.min(strs[i].length(), prefix.length());
            while(j < minLen) {
                if(strs[i].charAt(j) != prefix.charAt(j)) {
                    break;
                }
                j++;
            }
            prefix = prefix.substring(0, j);
        }
        return prefix;
    }
}
