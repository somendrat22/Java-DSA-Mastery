class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> (a[0] < b[0] ? -1 : 1));
        int [] prev = points[0];
        int arrowCount = 1;

        for(int i = 1; i < points.length; i++){
            if(prev[1] >= points[i][0]){
                prev[0] = Math.max(prev[0], points[i][0]);
                prev[1] = Math.min(prev[1], points[i][1]);
            }else{
                arrowCount++;
                prev = points[i];
            }
        }

        return arrowCount;
    }
}
