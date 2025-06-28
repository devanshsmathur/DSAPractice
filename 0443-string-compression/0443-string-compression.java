class Solution {
    public int compress(char[] chars) {
        int ans=0;
        int i=0;
        while(i<chars.length){
            char letter = chars[i];
            int count=0;

            while(i<chars.length && chars[i]==letter){
                ++count;
                ++i;
            }
            chars[ans++] = letter;

            if(count>1){
                // to convert "12" to "1","2"
                for(char c: String.valueOf(count).toCharArray()){
                    chars[ans++]=c;
                }
            }
        }

    return ans; // we return only the length of "compressed" instead of length of array
    }
}