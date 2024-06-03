class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0;
        int j = 0;
        while(i<s.length()){
            while(i<s.length() && j<t.length() && s.charAt(i) != t.charAt(j)){
                i++;
            }
            if(i == s.length() || j == t.length()){
                return t.length()-j;
            }
            i++;
            j++;
        }
        return t.length() - j;
    }
}