class Solution {
    public int longestSubarray(int[] nums) {
        int maxWindow=0;
        int window=0;
        int countZero=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                window++;
            }
            else{
                if(countZero<1){
                    window++;
                    countZero++;
                }
                else{
                    while(nums[i-window]!=0){
                        window--;
                    }
                    
                }
            }
            maxWindow=Math.max(maxWindow,window);
        }
        return maxWindow-1;
    }

}