class Solution {
    public int compress(char[] chars) {
        int i=0;
        int index=0;
        
        while(i<chars.length){
            int letter = chars[i];
            int count=0;
            chars[index++]=chars[i];


            while(i<chars.length && chars[i]==letter){
                count++;
                i++;
            }

            if(count>1){
                for(Character c:String.valueOf(count).toCharArray()){
                    chars[index++]=c;
                }
            }
        }
        return index;
    }
}