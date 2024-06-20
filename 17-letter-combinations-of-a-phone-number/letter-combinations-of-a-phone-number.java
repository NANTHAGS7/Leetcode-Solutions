class Solution {

    String keypad[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> res = new ArrayList<>();

    public void perm(String s,String ans){
        if(s.length() == 0){
            res.add(ans);
            return;
        }

        String key = keypad[s.charAt(0) - 48];
        for(int i=0;i<key.length();i++){
            perm(s.substring(1),ans+key.charAt(i));
        }
    }

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0 || digits == null) return res;
        perm(digits,"");
        return res;
    }
}