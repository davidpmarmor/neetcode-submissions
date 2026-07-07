impl Solution {
    pub fn has_duplicate(nums: Vec<i32>) -> bool {

        let mut seen = HashSet::new();

        for num in &nums {
            seen.insert(num);
        }

        return seen.len() < nums.len()
    }
}
