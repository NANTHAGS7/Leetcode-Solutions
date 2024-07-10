class Solution {
    public int minOperations(String[] logs) {
        // Stack<String> st = new Stack<>();
        int n = logs.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(logs[i].equals("../")){
                if(count > 0){
                    count--;
                }
            }
            else if(!logs[i].equals("./")){
                    count++;
            }
        }
        return count;
    }
}