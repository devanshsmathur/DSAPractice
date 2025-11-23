class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder combined= new StringBuilder();
        int i=0;
        while(i<(word1.length()+word2.length()))
        { 
            if(i<word1.length())
            {
                combined.append(word1.charAt(i));
            }
            if(i<word2.length())
            {
                combined.append(word2.charAt(i));
            }
            i++;
        }
        return combined.toString();
    }
}