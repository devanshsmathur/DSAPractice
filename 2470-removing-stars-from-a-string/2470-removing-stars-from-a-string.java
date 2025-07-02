class Solution {
    public String removeStars(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> output = new Stack<>();

        for(int i=0; i<arr.length;i++){
            if(arr[i]=='*'){
                output.pop();
            }
            else{
                output.push(arr[i]);
            }

        }
        StringBuilder sb = new StringBuilder();
        while(!output.isEmpty()){
            sb.append(output.pop());
        }
        
        return sb.reverse().toString();
    }
}