class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((l1,l2)->{
            int val = l1.getValue().compareTo(l2.getValue());
            if(val != 0){
                return val;
            }
            else{
                return l2.getKey().compareTo(l1.getKey());
            }
        });

        Map<Integer,Integer> sort = new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> e : list){
            sort.put(e.getKey(),e.getValue());
        }

        int sorted[] = new int[n];
        int ind = 0;

        for(Map.Entry<Integer,Integer> e:sort.entrySet()){
            for(int i=0;i<e.getValue();i++){
                sorted[ind] = e.getKey();
                ind++;
            }
        }  

        return sorted; 
    }
}