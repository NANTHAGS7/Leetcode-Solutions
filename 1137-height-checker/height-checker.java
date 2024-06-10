class Solution {
    public int heightChecker(int[] h) {
        int ex[] = new int[h.length];
        int j = 0;
        for(int num:h){
            ex[j++] = num;
        }
        Arrays.sort(ex);
        int count = 0;
        for(int i=0;i<h.length;i++){
            if(ex[i] != h[i]){
                count++;
            }
        }
        return count;
    }
}