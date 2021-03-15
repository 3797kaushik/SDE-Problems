class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> row = new ArrayList<Integer>();
        ArrayList<Integer> col = new ArrayList<Integer>();
    
        int n =matrix.length;
         for(int i=0;i<n;i++)   {
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
         }
        for(int i=0;i<n;i++)   {
            
                if(row.contains(i)){
                    for(int j=0;j<matrix[i].length;j++){
                        matrix[i][j] =0;
                    }
            
                }
            
         }
        for(int j=0;j<matrix[0].length;j++){
            
                if(col.contains(j)){
                    for(int i=0;i<n;i++)   {
                        matrix[i][j] =0;
                    }
            
                }
            
         }
    }
}