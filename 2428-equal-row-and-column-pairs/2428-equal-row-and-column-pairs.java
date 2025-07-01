class Solution {
    public int equalPairs(int[][] grid) {
        Map<List,Integer> map1 = new HashMap<>(); 
        int count=0;
        int k=0;

        for(int i=0;i<grid.length;i++){
            List<Integer> rowList = new ArrayList<>();
            for(int j=0;j<grid[i].length;j++){
                rowList.add(grid[i][j]);
            }
            map1.put(rowList,map1.getOrDefault(rowList,0)+1);

        }

        for(int i=0;i<grid.length;i++){
            List<Integer> colList = new ArrayList<>();
            for(int j=0;j<grid[i].length;j++){
                colList.add(grid[j][i]);
            }
            count+=map1.getOrDefault(colList,0);
        }



    return count;
    }
}