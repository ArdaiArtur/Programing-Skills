package Day7;

public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length==r&& mat[0].length==c)
     return mat;
     if(mat.length* mat[0].length!=c*r)
     return mat;
        int[][]mat2=new int[r][c];
     int a=0,b=0;
     for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[0].length; j++) {
             
            mat2[a][b]=mat[i][j];
                 b++;
                  if(b==c)
                {b=0;
                a++;} 
          
            
        }
     } 
     return mat2;  
    }
}
