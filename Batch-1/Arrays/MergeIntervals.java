class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int []> ans = new ArrayList<>();
        ans.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++){
            int [] i1 = ans.get(ans.size() - 1);
            int [] i2 = intervals[i];
            if(i1[1] >= i2[0]){
                i1[1] = Math.max(i1[1], i2[1]);
            }else{
                ans.add(i2);
            }
        }

        int [][] res = new int[ans.size()][2];
        int idx = 0;
        for(int [] arr: ans){
            res[idx] = arr;
            idx++;
        }
        return res;

    }
}
