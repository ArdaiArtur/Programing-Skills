package Day7II;

public class DetermibeWhetherMatrixCanBeObtainedByRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(check(mat, target)) return true;
        rotate(mat);
        if(check(mat, target)) return true;
        rotate(mat);
        if(check(mat, target)) return true;
        rotate(mat);
        if(check(mat, target)) return true;
        return false;
    }
    
    public boolean check(int[][] mat, int[][] target){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] != target[i][j]) return false;
            }
        }
        return true ;
    }
    
    public void rotate(int[][] matrix){
        int n = matrix.length;
        int m = n-1;
        for(int i = 0; i < n/2; i++){
            for(int j = i; j < n-i-1; j++){
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[m-j][i];
                matrix[m-j][i] = matrix[m-i][m-j];
                matrix[m-i][m-j] = matrix[j][m-i];
                matrix[j][m-i] = temp;
                
            }
        }
    }
}
