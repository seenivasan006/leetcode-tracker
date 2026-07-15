// Last updated: 15/07/2026, 20:57:11
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> fourSum(int[] nums, int target) {
5        List<List<Integer>> ans = new ArrayList<>();
6        Arrays.sort(nums);
7        int n = nums.length;
8
9        for (int i = 0; i < n - 3; i++) {
10            if (i > 0 && nums[i] == nums[i - 1]) {
11                continue;
12            }
13
14            for (int j = i + 1; j < n - 2; j++) {
15                if (j > i + 1 && nums[j] == nums[j - 1]) {
16                    continue;
17                }
18
19                int left = j + 1;
20                int right = n - 1;
21
22                while (left < right) {
23                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
24
25                    if (sum == target) {
26                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
27
28                        left++;
29                        right--;
30
31                        while (left < right && nums[left] == nums[left - 1]) {
32                            left++;
33                        }
34
35                        while (left < right && nums[right] == nums[right + 1]) {
36                            right--;
37                        }
38                    } else if (sum < target) {
39                        left++;
40                    } else {
41                        right--;
42                    }
43                }
44            }
45        }
46
47        return ans;
48    }
49}