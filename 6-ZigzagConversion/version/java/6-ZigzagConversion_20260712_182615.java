// Last updated: 12/07/2026, 18:26:15
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        if (strs == null || strs.length == 0) {
4            return "";
5        }
6
7        String prefix = strs[0];
8
9        for (int i = 1; i < strs.length; i++) {
10            while (!strs[i].startsWith(prefix)) {
11                prefix = prefix.substring(0, prefix.length() - 1);
12                if (prefix.isEmpty()) {
13                    return "";
14                }
15            }
16        }
17
18        return prefix;
19    }
20}