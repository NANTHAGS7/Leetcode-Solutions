class Solution {
  public boolean canBeEqual(int[] target, int[] arr) {
    int n = target.length;
    int m = arr.length;
    if (n != m) return false;
    int[] soln = new int[1001];
    for (int i = 0; i < n; i++) {
        soln[target[i]]++;
        soln[arr[i]]--;
    }
    for (int i = 0; i < n; i++) {
        if (soln[target[i]] != 0 || soln[arr[i]] != 0) {
            return false;
        }
    }
    return true;
  }
}