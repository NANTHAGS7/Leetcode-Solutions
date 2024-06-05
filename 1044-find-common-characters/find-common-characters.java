class Solution {

    public int[] count(String str){
        int temp[] = new int[26];
        for(char c:str.toCharArray()){
            temp[c - 'a']++;
        }
        return temp;
    }

    public int[] common(int a[],int b[]){
        int temp[] = new int[26];
        for(int i=0;i<26;i++){
            temp[i] = Math.min(a[i],b[i]);
        }
        return temp; 
    }

    public List<String> commonChars(String[] words) {
        // Map<Character,Integer> map = new HashMap<>();
        // for(char c:words[0].toCharArray()){
        //     map.put(c,map.getOrDefault(c,0)+1);
        // }
        // for(int i=1;i<words.length;i++){
        //     Map<Character,Integer> temp = new HashMap<>();
        //     for(char c:words[i].toCharArray()){
        //         temp.put(c,temp.getOrDefault(c,0)+1);
        //     }
        //     for(char c:map.keySet()){
        //         map.put(c,Math.min(map.get(c),temp.getOrDefault(c,0)));
        //     }
        // }
        // List<String> ans = new ArrayList<>();
        // for(char c:map.keySet()){
        //     for(int i=0;i<map.get(c);i++){
        //         ans.add(String.valueOf(c));
        //     }
        // }
        // return ans;
        int first[] = count(words[0]);
        for(int i=1;i<words.length;i++){
            first = common(first,count(words[i]));
        }
        List<String> arr = new ArrayList<>();
        for(int i=0;i<26;i++){
            if(first[i] != 0){
                char a = 'a';
                a+=i;
                String str = String.valueOf(a);
                while(first[i] > 0){
                    arr.add(str);
                    first[i]--;
                }
            }
        }
        return arr;
    }
}