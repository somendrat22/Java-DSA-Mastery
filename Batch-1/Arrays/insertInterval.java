class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int idx = -1;
        for(int i = 0; i < intervals.length; i++){
            if(newInterval[0] < intervals[i][0]){
                ans.add(newInterval);
                idx = i;
                break;
            }else if(newInterval[0] <= intervals[i][1]){
                intervals[i][1] = Math.max(newInterval[1], intervals[i][1]);
                idx = i + 1;
                ans.add(intervals[i]);
                break;
            }
            ans.add(intervals[i]);
        }

       if(idx == -1){
            ans.add(newInterval);
            int [][] res = new int[ans.size()][2];
            idx = 0;
            for(int [] arr: ans){
                res[idx] = arr;
                idx++;
            }
            return res;
       }

        for(int i = idx; i < intervals.length; i++){
            int [] i1 = ans.get(ans.size() - 1);
            int [] i2 = intervals[i];
            if(i1[1] >= i2[0]){
                i1[1] = Math.max(i1[1], i2[1]);
            }else{
                ans.add(i2);
            }
        }

        int [][] res = new int[ans.size()][2];
        idx = 0;
        for(int [] arr: ans){
            res[idx] = arr;
            idx++;
        }
        return res;
    }
}
