class Solution {
    public int numberOfAlternatingGroups(int[] c, int k) {
        int count = 0;
        int n = c.length;
        int res = 0;
        for(int i=0;i<n<<1;i++){
            if(i>0 && c[i%n] == c[(i-1)%n]){
                count = 1;
            }
            else{
                ++count;
            }
            res += i>=n && count>=k?1:0;
        }
        return res;
    }
}