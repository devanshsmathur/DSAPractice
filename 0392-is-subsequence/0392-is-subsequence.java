class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;

        char a[] = s.toCharArray();
        char b[] = t.toCharArray();

        for(int i=0; i<b.length;i++){
            if(a.length==j){
                return true;
            }
            if(a[j]==b[i]){
                j++;
            }
            
        }
        return j>=a.length;

    }
}