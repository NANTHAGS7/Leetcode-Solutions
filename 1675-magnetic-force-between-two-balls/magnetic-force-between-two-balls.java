class Solution {

    public boolean isPossible(int arr[],int m,int mid){
        int force = 1;
        int prev = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-prev >= mid){
                force++;
                prev = arr[i];
                if(force == m) return true;
            }
        }
        // if(force < m) return false;
        return false;
    }

    public int maxDistance(int[] pos, int m) {
        int n = pos.length;
        Arrays.sort(pos);

        int l = 1;
        int r = pos[n-1] - pos[0];
        // System.out.print(r);
        int res = 0;

        while(l<=r){
            int mid = l + (r-l)/2;
            if(isPossible(pos,m,mid)){
                res = mid;
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return res;
    }
}