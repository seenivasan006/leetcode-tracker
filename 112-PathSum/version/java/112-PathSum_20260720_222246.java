// Last updated: 20/07/2026, 22:22:46
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        Set<Integer> set = new HashSet<>();
4
5        for (int num : nums)
6            set.add(num);
7
8        int longest = 0;
9
10        for (int num : set) {
11            if (!set.contains(num - 1)) {
12                int current = num;
13                int streak = 1;
14
15                while (set.contains(current + 1)) {
16                    current++;
17                    streak++;
18                }
19
20                longest = Math.max(longest, streak);
21            }
22        }
23
24        return longest;
25    }
26}
27