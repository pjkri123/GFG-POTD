class Solution {
    public void setMatrixZeroes(int[][] mat) {
        // code here
        ArrayList<int[]> arr=new ArrayList<>();
        
        for(int i=0;i<mat.length;i++) 
            for(int j=0;j<mat[i].length;j++)
                if(mat[i][j]==0)
                    arr.add(new int[]{i,j});
        
        for(int[] a:arr) {
            for(int k=0;k<mat[0].length;k++)
                mat[a[0]][k]=0;
            for(int k=0;k<mat.length;k++)
                mat[k][a[1]]=0;
        }
    }
}
