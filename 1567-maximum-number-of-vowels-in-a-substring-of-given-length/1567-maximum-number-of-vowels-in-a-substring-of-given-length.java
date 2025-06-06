class Solution {
    public int maxVowels(String s, int k) {
        // StringBuilder vow = "aeiou";
        char [] str = s.toCharArray();
        int max=0,count=0;

        for(int i=0;i<s.length();i++){
            if("aeiou".indexOf(str[i]) !=-1){
                count++;
            }

            if(i>=k){
                if("aeiou".indexOf(str[i-k]) != -1){
                    count--;
                }
            }

            if(count>max){
                max=count;
            }

            if(max==k){
                return max;
            }
        }
        return max;
}
}