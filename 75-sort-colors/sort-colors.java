class Solution {

    public void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public int part(int nums[],int low,int high){
        int pivot = nums[high];
        int i = low - 1;
        for(int j=low;j<high;j++){
            if(nums[j] < pivot){
                i++;
                swap(nums,i,j);
            }
        }
        swap(nums,i+1,high);
        return (i+1);
    }

    public void quick(int nums[],int low,int high){
        if(low < high){
            int pivot = part(nums,low,high);

            quick(nums,low,pivot-1);
            quick(nums,pivot+1,high);
        }
    }

    public void sortColors(int[] nums) {
        // Arrays.sort(nums);
        quick(nums,0,nums.length-1);
    }
}