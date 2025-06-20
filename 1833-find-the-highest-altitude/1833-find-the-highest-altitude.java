class Solution {
    public int largestAltitude(int[] gain) {
        int maxDifference = 0;
        int currentAlt=0;
        for(int g: gain){
            currentAlt+=g;
            maxDifference=Math.max(maxDifference,currentAlt);
        }
        return maxDifference;
    }
}