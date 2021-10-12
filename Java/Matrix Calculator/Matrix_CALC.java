
public abstract class Matrix_CALC extends Matrix_MOD
{
    public static void DispMat(double mat[][],int r,int c){
         for(int i=0;i<r;i++){
          for(int j=0;j<c;j++) System.out.print(mat[i][j]+" ");
          System.out.println("\n");
         }
    }
    public double[][] Transpose(double A[][],int row,int column){
       double[][] B=new double[column][row];
       for(int i=0;i<row;i++){
          for(int j=0;j<column;j++) B[j][i]=A[i][j];
       }
       return B;
    }
    public double[][] Adjoint(double mat[][],int SIZE){
        int r=0,c=0;
        if(SIZE==2){
           double[][] mat2=new double[2][2];
           mat2[0][0]=mat[1][1]; mat2[0][1]=mat[1][0]*(-1);
           mat2[1][0]=mat[0][1]*(-1); mat2[1][1]=mat[0][0];
           return mat2;
        }
        double[][] matrix=new double[SIZE-1][SIZE-1]; 
        double[][] res=new double[SIZE][SIZE];
        for(int i=0;i<SIZE;i++){
          for(int j=0;j<SIZE;j++){
              r=0;
              for(int k=0;k<SIZE;k++){
                  if(k!=i){
                      c=0;
                      for(int l=0;l<SIZE;l++){
                        if(l!=j){ matrix[r][c]=mat[k][l]; c++;}
                      }
                      r++;
                  }
              }
              res[i][j]=MOD(matrix,SIZE-1)*Math.pow(-1,i+j+2);
          }
        }
        return Transpose(res,SIZE,SIZE);
    }
    
    public double[][] Inverse(double mat[][],int SIZE) throws ArithmeticException{
        double res[][]=new double[SIZE][SIZE];
        double temp=MOD(mat,SIZE);
        if(temp==0) throw new ArithmeticException("Inverse of this Matrix doesn't exist");
        else{
        res=Adjoint(mat,SIZE);
        for(int i=0;i<SIZE;i++)
          for(int j=0;j<SIZE;j++) res[i][j]=res[i][j]/temp;
        return res;
        }
    }
    
    public abstract double[][] MatMul(double A[][],double B[][],int r1,int r2,int c2);
}