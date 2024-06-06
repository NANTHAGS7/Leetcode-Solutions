class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int pairs = 0;
        int j = 0;
        while(j<nums2.length){
            for(int n:nums1){
                if(n % (nums2[j]*k) == 0){
                    pairs++;
                }
            }
            j++;
        }
        return pairs;
    }
}