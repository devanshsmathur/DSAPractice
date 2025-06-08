class Solution {
    public String reverseWords(String s) {
        char arr[]= s.trim().toCharArray();  
        StringBuilder out = new StringBuilder();
        int i=arr.length-1;

        while(i>=0){
            while(i>=0 && arr[i]==' '){
                i--;
            }
            if(i<0){
                break;
            }

            int end=i;      // Words end is the current value of i

            while(i>=0 && arr[i]!=' '){
                i--;
            }
            int start=i+1;

            out.append(arr,start,end-start+1);  // end-start+1 gives the length of word
            out.append(' ');     



        }
        

    return out.toString().trim();
    }
}