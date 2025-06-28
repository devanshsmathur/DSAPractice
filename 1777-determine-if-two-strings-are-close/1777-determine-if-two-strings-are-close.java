class Solution {
    public boolean closeStrings(String word1, String word2) {
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        
        
        if(c1.length != c2.length) return false;
     
        HashMap<Character,Integer> hm1 = new HashMap<>();
        for(char c:c1){
            if(hm1.containsKey(c)){
                hm1.put(c,hm1.get(c)+1);
            }
            else{
                hm1.put(c,1);
            }
        }

        HashMap<Character,Integer> hm2 = new HashMap<>();
        for(char c:c2){
            if(hm2.containsKey(c)){
                hm2.put(c,hm2.get(c)+1);
            }
            else{
                hm2.put(c,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : hm1.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        for (Map.Entry<Character, Integer> entry : hm2.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        if(!hm1.keySet().equals(hm2.keySet())) return false;
        
        List<Integer> values1 = new ArrayList<>(hm1.values());
        List<Integer> values2 = new ArrayList<>(hm2.values());

        Collections.sort(values1);
        Collections.sort(values2);

        if (!values1.equals(values2)) return false;



        return true;
    }
}