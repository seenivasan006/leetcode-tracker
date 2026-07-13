// Last updated: 13/07/2026, 21:05:18
1import java.util.*;
2
3class Solution {
4
5    List<String> result = new ArrayList<>();
6
7    String[] map = {
8        "", "", "abc", "def", "ghi",
9        "jkl", "mno", "pqrs", "tuv", "wxyz"
10    };
11
12    public List<String> letterCombinations(String digits) {
13
14        if (digits == null || digits.length() == 0)
15            return result;
16
17        backtrack(digits, 0, new StringBuilder());
18
19        return result;
20    }
21
22    private void backtrack(String digits, int index, StringBuilder current) {
23
24        if (index == digits.length()) {
25            result.add(current.toString());
26            return;
27        }
28
29        String letters = map[digits.charAt(index) - '0'];
30
31        for (char ch : letters.toCharArray()) {
32            current.append(ch);
33            backtrack(digits, index + 1, current);
34            current.deleteCharAt(current.length() - 1);
35        }
36    }
37}