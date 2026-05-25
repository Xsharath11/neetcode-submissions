class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map_s = new HashMap<>();
        HashMap<Character, Integer> map_t = new HashMap<>();

        for (char a: s.toCharArray()) {
            map_s.put(a, map_s.getOrDefault(a, 0) + 1);
        }

        for (char a:t.toCharArray()) {    
            map_t.put(a, map_t.getOrDefault(a, 0) + 1);
        }

        return map_s.equals(map_t);


    }
}
