class Solution {
    public boolean isLongPressedName(String os, String mts) {
        // sp -> O(1), tc -> o(n)
        if(mts.length() < os.length()){
            return false;
        }

        int i = 0;
        int j = 0;

        if(os.charAt(0) != mts.charAt(0)){
            return false;
        }

        while(i < os.length() && j < mts.length()){
            char ch1 = os.charAt(i);
            char ch2 = mts.charAt(j);

            if(ch1 == ch2){
                i++;
                j++;
            }else if(os.charAt(i-1) == ch2){
                j++;
            }else{
                return false;
            }
        }

        if(i < os.length()){
            return false;
        }

        while(j < mts.length()){
            if(os.charAt(i-1) == mts.charAt(j)){
                j++;
            }else{
                return false;
            }
        }

        return true;
    }
}