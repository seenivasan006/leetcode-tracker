// Last updated: 09/07/2026, 10:08:55
class Solution {
    public int mySqrt(int x) {
        long low = 0, high = x;

        while (low <= high) {
            long mid = (low + high) / 2;

            if (mid * mid <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int) high;
    }
}