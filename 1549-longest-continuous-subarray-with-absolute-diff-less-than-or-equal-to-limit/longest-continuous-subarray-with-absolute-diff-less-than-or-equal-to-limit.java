class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int ans = 1;
        Deque<Integer> minQ = new LinkedList<>();
        Deque<Integer> maxQ = new LinkedList<>();

        for (int l = 0, r = 0; r < nums.length; ++r) {
            while (!minQ.isEmpty() && minQ.peekLast() > nums[r])
                minQ.pollLast();
            minQ.addLast(nums[r]);
            while (!maxQ.isEmpty() && maxQ.peekLast() < nums[r])
                maxQ.pollLast();
            maxQ.addLast(nums[r]);
            while (maxQ.peekFirst() - minQ.peekFirst() > limit) {
                if (minQ.peekFirst() == nums[l])
                    minQ.pollFirst();
                if (maxQ.peekFirst() == nums[l])
                    maxQ.pollFirst();
                ++l;
            }
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}