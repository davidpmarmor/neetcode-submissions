impl Solution {
    pub fn product_except_self(nums: Vec<i32>) -> Vec<i32> {

        let size: usize = nums.len();
        let mut resultVec: Vec<i32> = vec![0; size];
        let mut prefixVec: Vec<i32> = vec![0; size];
        let mut suffixVec: Vec<i32> = vec![0; size];

        prefixVec[0] = 1;
        suffixVec[size -1] = 1;
        for i in 1..size {
            prefixVec[i] = nums[i-1] * prefixVec[i-1];
        }
        for i in (0..(size-1)).rev() {
            suffixVec[i] = nums[i+1] * suffixVec[i+1];
        }
        for i in 0..size {
            resultVec[i] = prefixVec[i]*suffixVec[i];
        }
        resultVec
    }
}
