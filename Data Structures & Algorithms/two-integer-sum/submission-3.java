class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> results = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (results.containsKey(target - nums[i])) {
                int [] result = {results.get(target - nums[i]), i};
                return result;
            } else {
                results.put(nums[i], i);
            }
        }
        return null;
    }
}
