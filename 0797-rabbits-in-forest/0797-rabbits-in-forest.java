class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> fmap = new HashMap<>();
        int count = 0;
        for(int i : answers) fmap.put(i, fmap.getOrDefault(i, 0) + 1);
        for(Map.Entry<Integer,Integer> i : fmap.entrySet()) {
            count += (i.getValue() / (i.getKey() + 1)) * (i.getKey() + 1);
            if(i.getValue() % (i.getKey() + 1) != 0)  count += (i.getKey() + 1);
        }
        return count;
    }
}