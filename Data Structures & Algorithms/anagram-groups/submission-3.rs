impl Solution {
    pub fn group_anagrams(strs: Vec<String>) -> Vec<Vec<String>> {

        let mut dict: HashMap<[u8; 26], Vec<String>> = HashMap::new();

        for s in strs {
            let mut count: [u8; 26] = [0; 26];
            for b in s.bytes() { 
                count[(b - b'a') as usize] += 1;
            }
            if dict.contains_key(&count) {
                if let Some(list) = dict.get_mut(&count) {
                    list.push(s);
                }
            } else {
                let list = vec![s];
                dict.insert(count, list);
            }
        }
        dict.into_values().collect()
    }
}
