// Last updated: 10/07/2026, 09:01:45
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3
4        // Always binary search on the smaller array
5        if (nums1.length > nums2.length) {
6            return findMedianSortedArrays(nums2, nums1);
7        }
8
9        int m = nums1.length;
10        int n = nums2.length;
11
12        int low = 0;
13        int high = m;
14
15        while (low <= high) {
16
17            int partitionX = (low + high) / 2;
18            int partitionY = (m + n + 1) / 2 - partitionX;
19
20            int maxLeftX = (partitionX == 0)
21                    ? Integer.MIN_VALUE
22                    : nums1[partitionX - 1];
23
24            int minRightX = (partitionX == m)
25                    ? Integer.MAX_VALUE
26                    : nums1[partitionX];
27
28            int maxLeftY = (partitionY == 0)
29                    ? Integer.MIN_VALUE
30                    : nums2[partitionY - 1];
31
32            int minRightY = (partitionY == n)
33                    ? Integer.MAX_VALUE
34                    : nums2[partitionY];
35
36            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
37
38                if ((m + n) % 2 == 0) {
39                    return (Math.max(maxLeftX, maxLeftY)
40                            + Math.min(minRightX, minRightY)) / 2.0;
41                } else {
42                    return Math.max(maxLeftX, maxLeftY);
43                }
44
45            } else if (maxLeftX > minRightY) {
46                high = partitionX - 1;
47            } else {
48                low = partitionX + 1;
49            }
50        }
51
52        return 0.0;
53    }
54}