// Last updated: 09/07/2026, 10:06:14
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long totalsum = 0;
        int n = nums.length;

        for (int i = 0; i<k; i++){
            long currVal = nums[n-1-i];
            totalsum += Math.max(currVal, currVal*mul);
            mul--;
        }
        return totalsum;
    }
}