class Solution {
    public int numRabbits(int[] answers) {
        int[] freq = new int[1001];
        int count = 0;
        for (int a : answers)
            freq[a]++;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                count += (int) Math.ceil((float) freq[i] / (i + 1)) * (i + 1);
            }
        }
        return count;
    }
}