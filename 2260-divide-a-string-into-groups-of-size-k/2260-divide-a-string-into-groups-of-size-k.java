class Solution {
    public String[] divideString(String s, int k, char fill) {

        int groups = (s.length()+k-1)/k;
        int index=0;
        
        String [] ans = new String[groups];

        for(int i=0;i<groups;i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<k;j++){
                if(index<s.length()){
                    sb.append(s.charAt(index));
                    index++;
                }
                else{
                    sb.append(fill);
                }
            }
            ans[i] = sb.toString();
        }
       
        return ans;
    }
}