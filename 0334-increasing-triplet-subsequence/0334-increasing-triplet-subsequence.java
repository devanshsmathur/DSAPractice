class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums==null || nums.length<3) return false;
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;

        for(int n:nums){
            if(a>=n){
                a = n;
            }
            else if (b>=n){
                b = n;
            }
            else{
                return true;
            }
        }
        return false;
    
        
    }
}