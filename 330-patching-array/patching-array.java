class Solution {
    public int minPatches(int[] nums, int n) {
        long maxReach = 0;
        int patchCount = 0;
        int index = 0;

        while(maxReach < n){
            if(index < nums.length && nums[index] <= maxReach + 1){
                maxReach += nums[index];
                index++;
            }
            else{
                maxReach += (maxReach + 1);
                patchCount++;
            }
        }
        return patchCount;
    }
}