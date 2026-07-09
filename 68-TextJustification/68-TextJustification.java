// Last updated: 09/07/2026, 10:08:56
import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            int j = i, len = 0;

            while (j < words.length && len + words[j].length() + (j - i) <= maxWidth) {
                len += words[j].length();
                j++;
            }

            int spaces = maxWidth - len;
            int gaps = j - i - 1;

            StringBuilder sb = new StringBuilder();

            if (j == words.length || gaps == 0) {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]).append(" ");
                }
                sb.setLength(sb.length() - 1);
                while (sb.length() < maxWidth) sb.append(" ");
            } else {
                int spaceEach = spaces / gaps;
                int extra = spaces % gaps;

                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        for (int s = 0; s < spaceEach; s++) sb.append(" ");
                        if (extra-- > 0) sb.append(" ");
                    }
                }
            }

            res.add(sb.toString());
            i = j;
        }

        return res;
    }
}