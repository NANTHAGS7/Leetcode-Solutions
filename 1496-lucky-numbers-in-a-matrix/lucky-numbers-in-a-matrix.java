class Solution {

    public int maxCol(int arr[][],int j){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i][j],max);
        }
        return max;
    }
    public int minIndex(int arr[]){
        int min = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < arr[min]){
                min = i;
            }
        }
        return min;
    }

    public List<Integer> luckyNumbers (int[][] mat) {
        for(int row[]:mat){
            int min = minIndex(row);
            if(row[min] == maxCol(mat,min)){
                return List.of(row[min]);
            }
        }
        return new ArrayList<>();
    }
}