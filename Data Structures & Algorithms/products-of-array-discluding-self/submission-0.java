class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int [] prefixArray = new int[size];
        int [] suffixArray = new int[size];
        int[] resultArray = new int[size];
        prefixArray[0] = 1;
        suffixArray[size - 1] = 1;
        for (int i = 1; i < size; i++) {
            prefixArray[i] = nums[i-1] * prefixArray[i-1];
        }
        for (int k = size - 2; k >= 0; k--) {
            suffixArray[k] = nums[k+1] * suffixArray[k+1];
        }
        for (int j = 0; j < size; j++) {
            resultArray[j] = prefixArray[j] * suffixArray[j];
        }
        return resultArray;   
    }
}  
