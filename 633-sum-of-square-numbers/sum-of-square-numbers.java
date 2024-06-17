class Solution {
    public boolean judgeSquareSum(int c) {
        long l = 0;
        long r = (long) Math.sqrt(c);     //long datatype for 2147483600
        while (l <= r) {
            long ssn = l * l + r * r;
            if (ssn == c)
                return true;

            if (ssn < c)
                l++;
            else
                r--;
        }
        return false;
    }
}