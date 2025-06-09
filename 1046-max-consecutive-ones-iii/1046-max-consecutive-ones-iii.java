class Solution {
    public int longestOnes(int[] nums, int k) {
        int window=k;
        int maxWindow=k, countZero=0;

        
        for(int i=0;i<k;i++){
            if(nums[i]==0){
                countZero++;
            }
        }
        
        for(int i=k;i<nums.length;i++){

            if(nums[i]==1){
                window++;
            }
            else{
                if(countZero<k){
                    window++;
                    countZero++;
                }
                else{
                    while(nums[i-window]!=0){
                        window--;
                    }
                }
            }
        maxWindow = Math.max(maxWindow, window);
        }
        
        return maxWindow;
    }

}