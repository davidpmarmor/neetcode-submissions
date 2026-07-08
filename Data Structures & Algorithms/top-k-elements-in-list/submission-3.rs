impl Solution {
    pub fn top_k_frequent(nums: Vec<i32>, k: i32) -> Vec<i32> {
        let mut freq: HashMap<i32, i32> = HashMap::new();

        for num in &nums {
            if freq.contains_key(&num) {
                if let Some(val) = freq.get_mut(&num) {
                    *val += 1;
                }
            } else {
                freq.insert(*num, 1);
            }
        }
        let mut buckets = vec![vec![]; nums.len() + 1];
        for (&n, &f) in freq.iter() {
            buckets[f as usize].push(n);
        }
        let mut result: Vec<i32> = Vec::new();
        for i in (1..buckets.len()).rev() {
            for &num in &buckets[i] {
                result.push(num);
                if result.len() == k as usize {
                    return result;
                }
            }
        }
        result
    } 
}
