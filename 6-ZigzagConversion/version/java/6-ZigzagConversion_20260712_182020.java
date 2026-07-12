// Last updated: 12/07/2026, 18:20:20
1class Solution {
2    public String convert(String s, int numRows) {
3        if (numRows == 1 || s.length() <= numRows) {
4            return s;
5        }
6
7        StringBuilder[] rows = new StringBuilder[numRows];
8
9        for (int i = 0; i < numRows; i++) {
10            rows[i] = new StringBuilder();
11        }
12
13        int index = 0;
14        int direction = 1;
15
16        for (char c : s.toCharArray()) {
17            rows[index].append(c);
18
19            if (index == 0) {
20                direction = 1;
21            } else if (index == numRows - 1) {
22                direction = -1;
23            }
24
25            index += direction;
26        }
27
28        StringBuilder result = new StringBuilder();
29
30        for (StringBuilder row : rows) {
31            result.append(row);
32        }
33
34        return result.toString();
35    }
36}