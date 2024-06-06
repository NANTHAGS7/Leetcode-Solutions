class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int pairs = 0;
        int j = 0;
        while(j<nums2.length){
            int num = nums2[j]*k;
            for(int n:nums1){
                if(n % num == 0){
                    pairs++;
                }
            }
            j++;
        }
        return pairs;
    }
}