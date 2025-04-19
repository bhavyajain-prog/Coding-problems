class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return count(nums, upper) - count(nums, lower - 1);
    }

    // count values
    private long count(int[] nums, int val) {
        int left = 0;
        long res = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] > val)
                right--;
            else
                res += right - (left++);
        }
        return res;
    }
}