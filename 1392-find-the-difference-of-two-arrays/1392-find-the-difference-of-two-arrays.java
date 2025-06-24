class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();

        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }

        List<Integer> l1 = new ArrayList<Integer>();
        for(int num:set1){
            if(!set2.contains(num)){
                l1.add(num);
            }
        }

        List<Integer> l2 = new ArrayList<Integer>();
        for(int num:set2){
            if(!set1.contains(num)){
                l2.add(num);
            }
        }

        return Arrays.asList(l1,l2);



    }
}