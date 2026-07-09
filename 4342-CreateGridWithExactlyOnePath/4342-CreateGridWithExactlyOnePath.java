// Last updated: 09/07/2026, 10:08:18
import java.util.*;

class Solution {

    public String[] createGrid(int m, int n) {

        char[][] grid = new char[m][n];

        // fill all with obstacles
        for (int i = 0; i < m; i++) {
            Arrays.fill(grid[i], '#');
        }

        int r = 0;
        int c = 0;

        grid[0][0] = '.';

        // move right till last column
        while (c + 1 < n) {
            c++;
            grid[r][c] = '.';
        }

        // move down till last row
        while (r + 1 < m) {
            r++;
            grid[r][c] = '.';
        }

        String[] ans = new String[m];

        for (int i = 0; i < m; i++) {
            ans[i] = new String(grid[i]);
        }

        return ans;
    }
}