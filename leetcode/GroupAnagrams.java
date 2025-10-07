class Solution {
    String makeHash(String word){
        int[] freq = new int[26];

        for (char a: word.toCharArray()){
            int index = (int)a - (int)'a';
            freq[index]++;
        }

        String hash = "";
        char separator = '$';
        for(int i: freq){
            hash += i + separator;
        }
        return hash;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word: strs){
            String hash = makeHash(word);
            if (map.containsKey(hash)){
                List<String> list = map.get(hash);
                list.add(word);
                map.put(hash, list);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(word);
                map.put(hash, newList);
            }
        }

        List<List<String>> result = new ArrayList<>(map.values());

        return result;

    }
}
