class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged= new StringBuilder();
        int i=0;
        int l1=word1.length(), l2 = word2.length();
        while(i<l1 || i<l2){
            if(i<l1){
                merged.append(word1.charAt(i));
            }
            if(i<l2){
                merged.append(word2.charAt(i));
            }
            i++;
        }
    return merged.toString();
    }
}