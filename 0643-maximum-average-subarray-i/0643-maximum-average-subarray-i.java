class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;

        for(int i=0;i<k;i++){
            sum+=nums[i];   // First window sum
        }

        double max=sum;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];  // Removes leftmost - add rightmost
            max = Math.max(max,sum);
            
            // if(max<sum){
            //     max=sum;
            // }
        }
        return max/k;
    }
}