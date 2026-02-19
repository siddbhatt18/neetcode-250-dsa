class Solution {
    // time complexity = O(n)
    // space complexity = O(n)
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> hs = new HashSet<>();
        for(int i = 0; i < n; i++) {
            if(hs.contains(nums[i])) {
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }
}
