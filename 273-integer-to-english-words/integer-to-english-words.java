class Solution {

    private static final String[] One = {
        "Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"
    };

    private static final String[] Two = {
        "","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"
    };

    private static final String[] Three = {
        "","Thousand","Million","Billion"
    };

    public String helper(int num){
        if(num == 0) return "";
        else if(num < 20) return One[num] + " ";
        else if(num < 100) return Two[num/10] + " " + helper(num % 10);
        else return One[num/100] + " Hundred " + helper(num % 100);
    }

    public String numberToWords(int num) {
        if(num == 0) return "Zero";

        StringBuilder sb = new StringBuilder();
        int tCount = 0;

        while(num > 0){
            if(num % 1000 != 0){
                sb.insert(0,helper(num % 1000) + Three[tCount] + " ");
            }
            num /= 1000;
            tCount++;
        }
        return sb.toString().trim();
    }
}