class Solution {
    public int numSubarrayBoundedMax(int[] arr, int l, int r) {
        int ans = 0;
        int prevCount = 0;
        int i = 0;
        int j = 0;
        while(j < arr.length){
            if(arr[j] > r){
                prevCount = 0;
                j++;
                i = j;
            }else if(arr[j] < l){
                ans += prevCount;
                j++;
            }else{
                int count = j - i + 1;
                ans += count;
                prevCount = count;
                j++;
            }
        }
        return ans;

    }
}
