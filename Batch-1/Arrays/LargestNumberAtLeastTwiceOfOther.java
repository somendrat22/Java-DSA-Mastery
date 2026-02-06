class Solution {
    public int dominantIndex(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
       
        int idx = -1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max1){
                idx = i;
                max2 = max1;
                max1 = nums[i];
            }else if(nums[i] > max2){  
                max2 = nums[i];
            }
        }

        return max1 >= 2*max2 ? idx : -1;

    }
}
