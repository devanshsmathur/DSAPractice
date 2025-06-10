class Solution {
    public int maxArea(int[] height) {
        int containerSize=0;
        int start=0, end=height.length-1;

        if(start==end) return height[start];
        if(height.length==2){
            return Math.min(height[start],height[end]);
        }

        while(start!=end){
            int cheight = Math.min(height[start],height[end]);
            int newContainer=(end-start)*cheight;
            
            containerSize = Math.max(containerSize,newContainer);
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
    return containerSize;
    }
}