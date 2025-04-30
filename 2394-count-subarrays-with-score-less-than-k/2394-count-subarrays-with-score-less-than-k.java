class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length, i = 0;
        long cnt = 0, sum = 0;
        for (int j = 0; j < n; j++) {
            sum += nums[j];
            while (i <= j && sum * (j - i + 1) >= k) {
                sum -= nums[i];
                i++;
            }
            cnt += (j - i + 1);
        }
        return cnt;
    }
}