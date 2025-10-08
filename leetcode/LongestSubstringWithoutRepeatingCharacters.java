class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] letters = s.toCharArray();
        if (letters.length == 0) return 0;

        HashSet<Character> set = new HashSet<>();
        int maxLength = 1;
        int l = 0;
        for (int r = 0; r < letters.length; r++){
            char c = letters[r];
            while (!set.add(c)){
                int currentLength = set.size();
                if (maxLength < currentLength) maxLength = currentLength;
                set.remove(letters[l]);
                l++;
            }
        }
        if (maxLength < set.size()) maxLength = set.size();

        return maxLength;
    }
}
