class Solution {
//   public int getLucky(String s, int k) {
//     int ans = convert(s);
//     for (int i = 1; i < k; ++i)
//       ans = getDigitSum(ans);
//     return ans;
//   }

//   private int convert(final String s) {
//     int sum = 0;
//     for (final char c : s.toCharArray()) {
//       final int val = c - 'a' + 1;
//       sum += val < 10 ? val : (val % 10 + val / 10);
//     }
//     return sum;
//   }

//   private int getDigitSum(int num) {
//     int digitSum = 0;
//     while (num > 0) {
//       digitSum += num % 10;
//       num /= 10;
//     }
//     return digitSum;
//   }

    public int getLucky(String s, int k) {
        int sum = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int temp = s.charAt(i) - 96;
            while (temp > 0) {
                int rem = temp % 10;
                sum += rem;
                temp /= 10;
            }
        }
        k--;
        int num = sum;
        while (k > 0) {
            sum = 0;
            int temp = num;
            while (temp > 0) {
                int rem = temp % 10;
                sum += rem;
                temp /= 10;
            }
            num = sum;
            k--;
        }
        return sum;
    }
}