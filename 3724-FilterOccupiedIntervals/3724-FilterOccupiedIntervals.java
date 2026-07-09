// Last updated: 09/07/2026, 10:06:12
class Solution {
    public List<List<Integer>> filterOccupiedIntervals(int[][] occupiedIntervals, int freeStart, int freeEnd) {
        if(occupiedIntervals.length == 0) return new ArrayList<>();
        Arrays.sort(occupiedIntervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        int[] curr = occupiedIntervals[0];
        for (int i = 1; i<occupiedIntervals.length; i++){
            if (occupiedIntervals[i][0] <= curr[1]+1){
                curr[1]  = Math.max(curr[1], occupiedIntervals[i][1]);
            }else {
                merged.add(curr);
                curr = occupiedIntervals[i];
            }
        }
        merged.add(curr);
        List<List<Integer>> res = new ArrayList<>();
        for(int[] interval : merged){
            int s = interval[0];
            int e = interval[1];
            if(e<freeStart || s > freeEnd){
                res.add(Arrays.asList(s,e));
            }else{
                if(s<freeStart){
                    res.add(Arrays.asList(s,freeStart-1));
                }
                if(e>freeEnd){
                    res.add(Arrays.asList(freeEnd+1,e));
                }
            }
        }
        return res;
    }
}