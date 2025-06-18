class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums==null || nums.length<3) return false;
        int a=(~0) >>> 1;
        int b=(~0) >>> 1;

        for(int i=0; i<nums.length;i++){
            if(a>=nums[i]){
                a = nums[i];
            }
            else if (b>=nums[i]){
                b = nums[i];
            }
            else{
                return true;
            }
        }
        return false;
    
        
    }
}