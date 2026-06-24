class Solution {

    public String encode(List<String> strs) {
        String encoded_string = "";
        for(String i: strs) {
            int l = i.length();
            encoded_string += String.valueOf(l) + "#" + i;
        }
        return encoded_string;

    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#') {
                j += 1;
            }
            int length = Integer.parseInt(str.substring(i,j));
            decoded_strs.add(str.substring(j+1,j+1+length));
            i = j + 1 + length;
        }
        return decoded_strs;
    }
}
