class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set= new HashSet<Integer>();
        List<Integer> marray = new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                marray.add(i);
            }
        }
        return marray;
    }
}