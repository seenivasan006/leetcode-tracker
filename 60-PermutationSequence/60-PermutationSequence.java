// Last updated: 09/07/2026, 10:09:07
import java.util.*;

class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            nums.add(i);
            fact *= i;
        }

        k--;

        StringBuilder sb = new StringBuilder();

        for (int i = n; i > 0; i--) {
            fact /= i;
            int index = k / fact;
            sb.append(nums.get(index));
            nums.remove(index);
            k %= fact;
        }

        return sb.toString();
    }
}