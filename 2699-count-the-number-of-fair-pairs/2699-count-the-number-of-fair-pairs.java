class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int n = nums.length;
        long count = 0;

        for (int i = 0; i < n; i++) {
            int l = lower - nums[i];
            int u = upper - nums[i];
            int left = n, right = -1, start = i + 1, end = n - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (nums[mid] >= l) {
                    left = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            start = i + 1;
            end = n - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (nums[mid] <= u) {
                    right = mid;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            if (left <= right)
                count += right - left + 1;
        }

        return count;
    }
}