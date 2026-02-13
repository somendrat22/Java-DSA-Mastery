class Solution {
    public int maxChunksToSorted(int[] arr) {
        int [] preMax = new int[arr.length];
        int [] suffixMin = new int[arr.length];

        int i = 1;
        int j = arr.length - 2;
        preMax[0]= arr[0];
        suffixMin[arr.length -1] = arr[arr.length - 1];

        while(i < arr.length){
            preMax[i] = Math.max(preMax[i - 1], arr[i]);
            suffixMin[j] = Math.min(suffixMin[j + 1], arr[j]);
            i++;
            j--;
        }

        int chunks = 0;

        for(i = 0; i < arr.length; i++){

            int nextMinVal = i == arr.length - 1 ? Integer.MAX_VALUE : suffixMin[i + 1];

            if(preMax[i] <= nextMinVal){
                chunks++;
            }
        }

        return chunks;
    }
}
