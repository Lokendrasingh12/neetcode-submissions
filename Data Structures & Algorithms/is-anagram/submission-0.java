class Solution {
    public boolean isAnagram(String s, String t) {
        char[] albts = new char[26];

        // populate numbering/counting of the alphabates
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            albts[idx]++;
        }

        // 
        for (int i = 0; i < t.length(); i++) {
            int idx = t.charAt(i) - 'a';
            albts[idx]--;
        }
        for (int i = 0; i < 26; i++) {
            if (albts[i] != 0) return false;
        }
        return true;
    }
}
