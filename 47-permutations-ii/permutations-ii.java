class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums,new ArrayList<>(),new boolean[nums.length]);
        return res;
    }
    public void backtrack(int nums[],List<Integer> temp,boolean used[]){
        if(nums.length == temp.size() && !res.contains(temp)){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            used[i] = true;
            temp.add(nums[i]);
            backtrack(nums,temp,used);
            used[i] = false;
            temp.remove(temp.size()-1);
        }
    }
}