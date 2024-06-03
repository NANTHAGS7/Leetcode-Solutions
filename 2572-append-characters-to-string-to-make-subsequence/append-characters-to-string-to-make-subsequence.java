class Solution {
    public int appendCharacters(String s, String t) {
        // int i = 0;
        // int j = 0;
        // while(i<s.length()){
        //     while(i<s.length() && j<t.length() && s.charAt(i) != t.charAt(j)){
        //         i++;
        //     }
        //     if(i == s.length() || j == t.length()){
        //         return t.length()-j;
        //     }
        //     i++;
        //     j++;
        // }
        // return t.length() - j;

        if(s.equals(t)) return 0;
        char ss[] = s.toCharArray();
        char tt[] = t.toCharArray();
        int j=0;
        int m = ss.length;
        int n = tt.length;
        for(int i=0;i<m;i++){
            if(ss[i] == tt[j]) j++;

            if(j == n) return 0;
        }
        return n - j;
    }
}