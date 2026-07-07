impl Solution {
    pub fn is_anagram(s: String, t: String) -> bool {
        if s.len() == t.len() {
            let mut freq = [0i32; 26];
            for (a, b) in s.bytes().zip(t.bytes()) {
                freq[(a - b'a') as usize] += 1;
                freq[(b - b'a') as usize] -= 1;
            }
            for i in freq {
                if i != 0 {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
