class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<asteroids.length;i++){
            boolean alive = true;

            while(alive && !stk.isEmpty() && asteroids[i] < 0 && stk.peek() > 0){
                if(-(asteroids[i])>stk.peek()){
                    stk.pop();
                }
                else if(-(asteroids[i]) < stk.peek()){
                    alive = false;
                }
                else{
                    stk.pop();
                    alive = false;
                }
            }
            
            if(alive){
                stk.push(asteroids[i]);
            }

            
        }

        int[] output = new int[stk.size()];
        for (int i = stk.size() - 1; i >= 0; i--) {
            output[i] = stk.pop();
        }
        
        return output;
    }
}