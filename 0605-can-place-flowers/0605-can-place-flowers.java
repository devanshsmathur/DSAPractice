class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i=0;
        if(n==0 || (flowerbed.length==1 && flowerbed[i]==0)) return true;
        if(n>flowerbed.length) return false;

        while(i<flowerbed.length){
            
            if(flowerbed[i]==0){
                if(i==0){
                    if(flowerbed[i+1]==0){
                        flowerbed[i]=1;
                        n--;
                    }
                }
                else if(i==flowerbed.length-1){
                    if(flowerbed[i-1]==0){
                        flowerbed[i]=1;
                        n--;
                    }
                }
                else{
                    if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                        flowerbed[i]=1;
                        n--;
                    }
                }

            }
            i++;
        }

    return n<=0;

    }
}