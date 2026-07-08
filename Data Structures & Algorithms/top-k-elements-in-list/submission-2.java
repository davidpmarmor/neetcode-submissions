class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            if (freq.containsKey(num)) {
                freq.computeIfPresent(num, (key, val) -> val + 1);
            } else {
                freq.put(num, 1);
            }
        }
        PriorityQueue<int[]> pqueue = new PriorityQueue<>(freq.size(), (a, b) -> Integer.compare(b[1], a[1]));
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            pqueue.offer(new int[]{entry.getKey(), entry.getValue()});
        }
        int [] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pqueue.poll()[0];
        }
        return result;
    }
}
