class Solution {
    // time complexity = O(n + m)
    // space complexity = O(1)
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int count[] = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            count[ch1 - 'a']++;
            char ch2 = t.charAt(i);
            count[ch2 - 'a']--;
        }
        for(int i = 0; i < 26; i++) {
            if(count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
