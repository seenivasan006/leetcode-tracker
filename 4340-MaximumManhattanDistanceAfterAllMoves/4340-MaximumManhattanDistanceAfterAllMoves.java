// Last updated: 09/07/2026, 10:08:16
class Solution {
    public int maxDistance(String moves) {
        int r = 0, l = 0,u=0,d=0,wild=0;
        for (char ch : moves.toCharArray()){
            if(ch=='R')r++;
            else if(ch=='L')l++;
            else if(ch=='U')u++;
            else if(ch=='D')d++;
            else wild++;
        }
        return Math.abs(r-l)+Math.abs(u-d)+wild;
    }
}