class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";      // if they're not equal that means they've different string pattern
        }
        int len = gcd(str1.length(),str2.length());
        return str1.substring(0,len);       // We'll take out the GCD String from Str1
    }
        private int gcd(int len1, int len2){
            return len2==0? len1:gcd(len2,len1%len2);
        }
    }
