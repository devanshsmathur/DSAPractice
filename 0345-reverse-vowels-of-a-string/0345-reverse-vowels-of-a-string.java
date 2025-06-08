class Solution {
    public String reverseVowels(String s) {
        char str[] = s.toCharArray();

        int i=0,j=str.length-1;

        while(i<j){
            if(isVowel(str[i])&&isVowel(str[j])){
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
            else if(!isVowel(str[i])){
                i++;
            }
            else{
                j--;
            }
        }
        return new String(str);
    }


        public boolean isVowel(char c){
            if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u'|| c=='A' || c=='E' || c=='I'|| c=='O' || c=='U'){
                return true;
            }
            return false;
        }

    }
