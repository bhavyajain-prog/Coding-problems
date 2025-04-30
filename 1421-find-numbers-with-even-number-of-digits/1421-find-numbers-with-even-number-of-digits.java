class Solution {
    public int findNumbers(int[] nums) {
        int cnt = 0;
        for (int num : nums) {
            int dig = 0;
            for (; num > 0; num /= 10)
                dig++;
            if ((dig & 1) == 0)
                cnt++;
        }
        return cnt;
    }
}