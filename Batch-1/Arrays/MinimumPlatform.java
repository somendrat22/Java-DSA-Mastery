class Solution {
    public int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count = 1;
        int max = 0;
        int i = 1;
        int j = 0;
        
        while(i < arr.length && j < arr.length){
            if(arr[i] <= dep[j]){
                count++;
                max = Math.max(count, max);
                i++;
            }else{
                count--;
                j++;
            }
        }
        
        return Math.max(count, max);
        
    }
}
