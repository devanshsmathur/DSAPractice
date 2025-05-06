class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        if(original.length != m*n){
            return new int[0][0];
        }

        int newarray[][]=new int[m][];
        int k=0;

        
        for(int i=0; i<m; i++){
            newarray[i] = Arrays.copyOfRange(original, i*n, i*n+n); // i*n - start index; i*n+n - end index
        }

        // copyOfRange - copies the specified range of the specified array into a new array.

        // if(n>1){
        //     for(int i=0;i<m;i++){
        //         for(int j=0;j<n;j++){
        //             newarray[i][j]=original[k];
        //             k++;
        //         }
        //     }
        // }
        // else{
        //     return newarray;
        // }
        
        return newarray;
    }
}