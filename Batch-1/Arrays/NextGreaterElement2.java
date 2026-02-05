class Solution {

    public void swap(char [] nums, int j, int k){
        char temp = nums[j];
        nums[j] = nums[k];
        nums[k] = temp;
    }
    public int nextGreaterElement(int n) {
        char [] nums = (n + "").toCharArray();
        int l = nums.length;
        int j = l - 2;
        
        while(j >= 0 && nums[j] >= nums[j + 1]){
            j--;
        }

        if(j == -1){
            return -1;
        }

        int pivot = j;

        int k = l - 1;

        while(nums[pivot] >= nums[k]){
            k--;
        }

        swap(nums, j, k);
       


        int i = pivot + 1;
        j = l - 1;

        while(i < j){
            swap(nums, i , j);
            i++;
            j--;
        }

        long sum = 0;
        int p = l - 1;

        for(i = 0; i < l; i++){
            int val = (nums[i] - '0');
            sum += (long)val*(long)Math.pow(10, p);
            p--;
        }


       // -2^64 to 2^64
       // -2^32 to 2^32

        return sum > Integer.MAX_VALUE ? -1 : (int) sum;
    }
}
