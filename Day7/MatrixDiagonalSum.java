package Day7;

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
       
        int sum=0;
        int n=mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j)
                sum+=mat[i][j];
                if(i+j==n-1) 
                sum+=mat[i][j];

                if(i==j&&i+j==n-1)
                sum-=mat[i][j];
                
            }
        }
        return sum;
        
    }


    public int diagonalSums(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i]+mat[i][mat.length-1-i];
        }
        if(mat.length%2==0){
            return sum;
        }
        else{
            return sum-mat[mat.length/2][mat.length/2];
        }
    }
}
