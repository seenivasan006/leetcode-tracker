// Last updated: 12/07/2026, 18:19:59
1class Solution {
2    public String longestPalindrome(String s) {
3        if (s == null || s.length() < 2) {
4            return s;
5        }
6
7        int start = 0, end = 0;
8
9        for (int i = 0; i < s.length(); i++) {
10            int len1 = expand(s, i, i);
11            int len2 = expand(s, i, i + 1);
12            int len = Math.max(len1, len2);
13
14            if (len > end - start) {
15                start = i - (len - 1) / 2;
16                end = i + len / 2;
17            }
18        }
19
20        return s.substring(start, end + 1);
21    }
22
23    private int expand(String s, int left, int right) {
24        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
25            left--;
26            right++;
27        }
28        return right - left - 1;
29    }
30}