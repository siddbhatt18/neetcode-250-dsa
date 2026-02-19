class Solution {
    // time complexity = O(n)
    // space complexity = O(n)
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int ans[] = new int[2];
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int diff = target - nums[i];
            if(hm.containsKey(diff)) {
                ans[0] = hm.get(diff);
                ans[1] = i;
                return ans;
            }
            hm.put(nums[i], i);
        }
        return ans;
    }
}
