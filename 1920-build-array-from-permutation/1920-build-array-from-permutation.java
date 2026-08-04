class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length]; // create new array
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];       // core logic
        }
        return ans;
    }
}
