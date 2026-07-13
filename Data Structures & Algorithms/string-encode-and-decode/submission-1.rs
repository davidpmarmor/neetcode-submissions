impl Solution {
    pub fn encode(strs: Vec<String>) -> String {
        let mut resultStr = String::new();
        for word in &strs {
            let length  = word.len() as u8;
            resultStr.push(length as char);
            resultStr.push_str(word);
        }
        resultStr
    }

    pub fn decode(s: String) -> Vec<String> {
        let mut resultVec: Vec<String> = Vec::new();
        let mut chars = s.chars();
        while let Some (length) = chars.next() {
            let mut word = String::new();
            for _ in 0..(length as usize) {
                word.push(chars.next().unwrap());
            }
            resultVec.push(word);
        }
        resultVec
    }
}
