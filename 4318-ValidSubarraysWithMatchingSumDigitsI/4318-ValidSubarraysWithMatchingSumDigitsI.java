// Last updated: 09/07/2026, 10:08:21
class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count = 0;
        int n=nums.length;
        char tarchar=(char)('0'+x);
        for (int i = 0;i<n;i++){
            long cs=0;
            for (int j=i;j<n;j++){
                cs+=nums[j];
                if(cs%10==x){
                    String s = Long.toString(cs);
                    if(s.charAt(0) == tarchar){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}