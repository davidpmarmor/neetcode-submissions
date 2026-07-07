class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> grouped = new HashMap<>();

        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String keyString = new String(arr);
            System.out.println(keyString);
            grouped.computeIfAbsent(keyString, k -> new ArrayList<>()).add(str);
            }
        System.out.println(grouped);
        return new ArrayList<>(grouped.values());
    }
}