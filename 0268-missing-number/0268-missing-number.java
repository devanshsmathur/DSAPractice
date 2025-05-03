class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int missing = 0;

        int expsum = n*(n+1)/2;

        int actsum = 0;
        for (int i=0;i<n;i++){
            actsum+=nums[i];
        }
        missing = expsum-actsum;

    return missing;
}}