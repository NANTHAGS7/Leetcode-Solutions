class Solution {
    public int longestPalindrome(String s) {
        int count[] = new int[128];
        int result = 0;
        boolean flag = false;
        for(char c:s.toCharArray()){
            count[c]++;
        }
        for(int c:count){
            if(c % 2 == 0) result += c;
            else{
                flag = true;
                result += (c-1);
            }
        }
        if(flag) result++;
        return result;
    }
}