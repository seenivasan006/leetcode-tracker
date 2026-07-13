// Last updated: 13/07/2026, 21:04:32
1import java.util.*;
2
3class Solution {
4
5    public List<List<Integer>> threeSum(int[] nums) {
6
7        List<List<Integer>> ans = new ArrayList<>();
8
9        Arrays.sort(nums);
10
11        for (int i = 0; i < nums.length - 2; i++) {
12
13            if (i > 0 && nums[i] == nums[i - 1])
14                continue;
15
16            int left = i + 1;
17            int right = nums.length - 1;
18
19            while (left < right) {
20
21                int sum = nums[i] + nums[left] + nums[right];
22
23                if (sum == 0) {
24                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
25
26                    while (left < right && nums[left] == nums[left + 1])
27                        left++;
28
29                    while (left < right && nums[right] == nums[right - 1])
30                        right--;
31
32                    left++;
33                    right--;
34                } else if (sum < 0) {
35                    left++;
36                } else {
37                    right--;
38                }
39            }
40        }
41
42        return ans;
43    }
44}