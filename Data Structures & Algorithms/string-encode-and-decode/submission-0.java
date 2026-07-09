class Solution {

    public String encode(List<String> strs) {
        StringBuilder sbResult = new StringBuilder(); 
        for (String str : strs) {
            int lenStr = str.length();
            char convertedLen = (char) lenStr;
            sbResult.append(convertedLen);
            sbResult.append(str);
            // for (char c : str.toCharArray()) {
                // stringArray.add(c);
            // }
        }
        return sbResult.toString();
    }

    public List<String> decode(String str) {
        int strLength = str.length();
        char strArray[] = str.toCharArray();
        ArrayList<String> resultList = new ArrayList<>();
        int i = 0;
        while (i < strLength) {
            int wordLen = (int) strArray[i];
            i += 1;
            char wordArray[] = new char[wordLen];
            for (int k = 0; k < wordLen; k++) {
                wordArray[k] = strArray[i];
                i += 1;
            }
            resultList.add(new String(wordArray));
        }
        return resultList;
    }
}
