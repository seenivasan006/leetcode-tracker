// Last updated: 20/07/2026, 09:11:49
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int left = 0, right = nums.length - 1;
4
5        while (left <= right) {
6            int mid = left + (right - left) / 2;
7
8            if (nums[mid] == target)
9                return true;
10
11            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
12                left++;
13                right--;
14            } else if (nums[left] <= nums[mid]) {
15                if (target >= nums[left] && target < nums[mid])
16                    right = mid - 1;
17                else
18                    left = mid + 1;
19            } else {
20                if (target > nums[mid] && target <= nums[right])
21                    left = mid + 1;
22                else
23                    right = mid - 1;
24            }
25        }
26
27        return false;
28    }
29}