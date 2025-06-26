class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer, Integer> oc = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            int count=0;
            if(!oc.containsKey(arr[i])){
                oc.put(arr[i],++count);
            }
            else{
                oc.put(arr[i], oc.get(arr[i]) + 1);
            }
        } 
        HashSet<Integer> val = new HashSet<>();
        for(int x:oc.values()){
            val.add(x);
        }


    return val.size() == oc.size();
    }
}