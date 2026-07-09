// Last updated: 09/07/2026, 10:08:45
import java.util.*;

class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        int required = map.size();
        int formed = 0;

        Map<Character, Integer> window = new HashMap<>();

        int l = 0, r = 0;
        int[] ans = {-1, 0, 0};

        while (r < s.length()) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (map.containsKey(c) && window.get(c).intValue() == map.get(c).intValue()) {
                formed++;
            }

            while (l <= r && formed == required) {
                if (ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }

                char left = s.charAt(l);
                window.put(left, window.get(left) - 1);

                if (map.containsKey(left) && window.get(left) < map.get(left)) {
                    formed--;
                }

                l++;
            }

            r++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }
}