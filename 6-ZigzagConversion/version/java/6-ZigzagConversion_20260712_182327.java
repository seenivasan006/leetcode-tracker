// Last updated: 12/07/2026, 18:23:27
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0, right = height.length - 1;
4        int max = 0;
5
6        while (left < right) {
7            int area = Math.min(height[left], height[right]) * (right - left);
8            max = Math.max(max, area);
9
10            if (height[left] < height[right]) {
11                left++;
12            } else {
13                right--;
14            }
15        }
16
17        return max;
18    }
19}