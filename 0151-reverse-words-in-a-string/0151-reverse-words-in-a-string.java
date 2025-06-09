class Solution {
    public String reverseWords(String s) {
        char arr[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = arr.length-1;

        while (i>=0){
            while (i>=0 && arr[i]==' '){
                i--;
            }
            int end=i;
            while(i>=0 && arr[i]!=' '){
                i--;
            }
            int start=i+1;
            sb.append(arr,start, end-start+1);
            sb.append(' ');
        } 
        return sb.toString().trim();
    }
}