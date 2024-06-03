class Solution {
    public int singleNumber(int[] nums) {
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int n:nums){
        //     map.put(n,map.getOrDefault(n,0)+1);
        // }
        // int val = 0;
        // for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        //     if(entry.getValue() == 1){
        //         val = entry.getKey();
        //     }
        // }
        // return val;

        int ones = 0;
        int twice = 0;
        for(int num:nums){
            ones = (ones ^ num) & (~twice);
            twice = (twice ^ num) & (~ones);
        }
        return ones;
    }
}