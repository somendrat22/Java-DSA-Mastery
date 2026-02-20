class Solution {
    public int maxDistToClosest(int[] seats) {
        int i = 0;
        int j = 0;
        int max = 0;
        while(j < seats.length){
            if(seats[j] == 0){
                j++;
            }else{
                if(i == 0 && seats[i] == 0){
                    int dist = j - i;
                    max = Math.max(max, dist);
                }else{
                    int dist = (j - i)/2;
                    max = Math.max(max, dist);
                }
                i = j;
                j++;
            }
        }

        if(seats[seats.length - 1] == 0){
            int dist = j - i - 1;
             max = Math.max(max, dist);
        }

        return max;
    }
}
