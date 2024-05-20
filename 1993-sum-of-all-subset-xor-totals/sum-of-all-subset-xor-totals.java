class Solution {
    public int subsetXORSum(int[] nums) {
        int xor = 0;
        for(int n:nums){
            xor |= n;
        }
        return xor<<(nums.length-1);
    }
}