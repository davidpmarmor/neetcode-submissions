class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            List<Character> slist = new ArrayList<>(s.length());
            List<Character> tlist = new ArrayList<>(t.length());
            for (char c : s.toCharArray()) {
                slist.add(c);
            }
            for (char c : t.toCharArray()) {
                tlist.add(c);
            }
            
            slist.sort(null);
            tlist.sort(null);
            return slist.equals(tlist);
        }
        return false;

    }
}
