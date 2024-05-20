class Solution {

    public static void back(List<List<Integer>> res,List<Integer> temp,int arr[],int start){
        res.add(new ArrayList<>(temp));

        for(int i=start;i<arr.length;i++){
            if(i>start && arr[i] == arr[i-1]) continue;

            temp.add(arr[i]);
            back(res,temp,arr,i+1);
            temp.remove(temp.size()-1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        back(res,new ArrayList<>(),nums,0);
        return res;
    }
}