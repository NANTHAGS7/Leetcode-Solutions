class Solution {

    public static int gene(String s,int left,int right){
        if(s == null || left>right) return 0;

        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }

    public String longestPalindrome(String s) {
        if(s == null || s.length()<1) return "";

        int start = 0;
        int end = 0;

        for(int i=0;i<s.length()-1;i++){
            int len1 = gene(s,i,i);
            int len2 = gene(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len > end - start){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start,end+1);
    }
}