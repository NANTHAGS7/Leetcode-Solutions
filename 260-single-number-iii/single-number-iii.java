class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() == 1){
                arr.add(entry.getKey());
            }
        }
        int res[] = new int[arr.size()];
        int i=0;
        for(int num:arr){
            res[i++] = num;
        }
        return res;
    }
}