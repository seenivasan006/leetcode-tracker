// Last updated: 12/07/2026, 18:21:29
1class Solution {
2    public int myAtoi(String s) {
3        int i = 0;
4        int n = s.length();
5
6        while (i < n && s.charAt(i) == ' ') {
7            i++;
8        }
9
10        int sign = 1;
11        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
12            if (s.charAt(i) == '-') {
13                sign = -1;
14            }
15            i++;
16        }
17
18        int result = 0;
19
20        while (i < n && Character.isDigit(s.charAt(i))) {
21            int digit = s.charAt(i) - '0';
22
23            if (result > Integer.MAX_VALUE / 10 ||
24                (result == Integer.MAX_VALUE / 10 && digit > 7)) {
25                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
26            }
27
28            result = result * 10 + digit;
29            i++;
30        }
31
32        return result * sign;
33    }
34}