class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] c, int t) {
        Arrays.sort(c);
        dfs(0,c,t,new ArrayList<>());
        return res;
    }

    public void dfs(int start,int c[],int t,List<Integer> temp){
        if(t<0) return;
        if(t==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<c.length;i++){
            temp.add(c[i]);
            dfs(i,c,t-c[i],temp);
            temp.remove(temp.size() - 1);
        }
    }
}