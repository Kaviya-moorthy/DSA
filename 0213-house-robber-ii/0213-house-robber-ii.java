class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int case1 = robLine(nums, 0, n - 2); // first to second-last
        int case2 = robLine(nums, 1, n - 1); // second to last

        return Math.max(case1, case2);
    }

    int robLine(int[] nums, int start, int end) {
        int prev2 = 0; // i-2
        int prev1 = 0; // i-1

        for (int i = start; i <= end; i++) {
            int curr = Math.max(prev1, nums[i] + prev2);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
