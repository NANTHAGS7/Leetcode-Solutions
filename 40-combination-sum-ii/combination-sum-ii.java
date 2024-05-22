class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        Arrays.sort(c);
        backtrack(0,c,t,new ArrayList<>());
        return res;
    }
    public void backtrack(int start,int c[],int t,List<Integer> temp){
        if(t<0) return;
        if(t == 0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<c.length;i++){

            if(i>start && c[i] == c[i-1]) continue;

            temp.add(c[i]);
            backtrack(i+1,c,t-c[i],temp);
            temp.remove(temp.size() - 1);
        }
    }
}