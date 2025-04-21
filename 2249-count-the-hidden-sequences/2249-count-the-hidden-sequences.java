class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long min = 0, max = 0, sum = 0;
        for (int i : differences) {
            sum += i;
            min = Math.min(sum, min);
            max = Math.max(sum, max);
        }
        long count = upper - (max - min) - lower + 1;
        return (int)Math.max(0,count);
    }
}
