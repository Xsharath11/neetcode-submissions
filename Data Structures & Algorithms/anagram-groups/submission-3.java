class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> groups = new HashMap<>();

        for(String word: strs) {
            int[] map = new int[26];
            for(char c: word.toCharArray()) {
                map[c - 'a']++;
            }
            String mapStr = Arrays.toString(map);
            groups.putIfAbsent(mapStr, new ArrayList<>());
            groups.get(mapStr).add(word);
        }
        return new ArrayList<>(groups.values());


    }
}
