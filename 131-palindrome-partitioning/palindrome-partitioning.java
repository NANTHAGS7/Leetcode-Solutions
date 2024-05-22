class Solution {

    List<List<String>> res = new ArrayList<>();

    public List<List<String>> partition(String s) {
        dfs(0,s,new ArrayList<>());
        return res;
    }

    public void dfs(int start,String s,List<String> temp){
        if(start == s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=start;i<s.length();i++){
            if(isPal(s,start,i)){
                temp.add(s.substring(start,i+1));
                dfs(i+1,s,temp);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public boolean isPal(String s,int left,int right){
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}