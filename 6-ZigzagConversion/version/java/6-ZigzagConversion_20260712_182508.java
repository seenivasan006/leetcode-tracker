// Last updated: 12/07/2026, 18:25:08
1class Solution {
2    public String intToRoman(int num) {
3        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
4        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
5
6        StringBuilder sb = new StringBuilder();
7
8        for (int i = 0; i < values.length; i++) {
9            while (num >= values[i]) {
10                sb.append(romans[i]);
11                num -= values[i];
12            }
13        }
14
15        return sb.toString();
16    }
17}