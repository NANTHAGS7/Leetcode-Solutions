class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public void backtrack(int start,int nums[],List<Integer> temp){
        // if(start == nums.length){
            // res.add(new ArrayList<>(temp));
            // return;
        // }
        res.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(i+1,nums,temp);
            temp.remove(temp.size()-1);
        }
        // temp.add(nums[start]);
        // backtrack(start+1,nums,temp);
        // temp.remove(temp.size()-1);
        // backtrack(start+1,nums,temp);
    }
    public boolean isBeauty(List<Integer> subset,int k){
        for(int i=0;i<subset.size()-1;i++){
            for(int j=i+1;j<subset.size();j++){
                if(Math.abs(subset.get(i)-subset.get(j)) == k){
                    return false;
                }
            }
        }
        return true;
    }
    public int beautifulSubsets(int[] nums, int k) {
        backtrack(0,nums,new ArrayList<>());
        int count = 0;
        for(List<Integer> subset:res){
            if(subset.size()!=0 && isBeauty(subset,k)){
                count++;
            }
        }
        return count;
    }
}