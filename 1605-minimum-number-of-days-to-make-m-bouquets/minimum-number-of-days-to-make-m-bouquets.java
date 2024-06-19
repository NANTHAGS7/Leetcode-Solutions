class Solution {

    public static boolean isPossible(int arr[],int m,int k,int mid){
        int n = arr.length;
        int adj = 0;
        int bc = 0;
        for(int i=0;i<n;i++){
            if(arr[i] <= mid){
                adj++;
                if(adj == k){
                    bc++;
                    adj = 0;
                    if(bc == m){
                        return true;
                    }
                }
            }
            else{
                adj = 0;
            }
        }
        return bc >= m;
    }

    public int minDays(int[] arr, int m, int k) {
        int n = arr.length;

        if(m*k > n) return -1;

        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]<l) l = arr[i];

            if(arr[i]>r) r = arr[i];
        }
        int res = -1;
        while(l<=r){
            int mid = l + (r-l)/2;

            if(isPossible(arr,m,k,mid)){
                res = mid;
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return res;
    }
}