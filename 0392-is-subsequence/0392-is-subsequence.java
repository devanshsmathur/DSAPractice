class Solution {
    public boolean isSubsequence(String s, String t) {
       
       char a[] = s.toCharArray();
       char b[] = t.toCharArray();


       int j=0;

       for(int i=0;i<b.length;i++){
        if(a.length==j){
            return true;
        }
        if(a[j]==b[i]){
            j++; // increases only when found
        }
       }
        return j>=s.length();
    }
}