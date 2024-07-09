class Solution {
    public int numberOfAlternatingGroups(int[] c) {
        int res = 0;
        int n = c.length;
        for(int i=0;i<n;i++){
            if(c[i] != c[(i+1)%n] && c[i] != c[(i-1+n)%n]){
                res++;
            }
        }
        return res;
    }
}