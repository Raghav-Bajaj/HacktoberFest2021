
final public class Matrix_TOOL extends Matrix_CALC //final keyword tells the compiler that this class can't be extended anymore
{
    public double[][] MatMul(double A[][],double B[][],int r1,int r2,int c2){
      double sum=0;
      double[][] C=new double[r1][c2];
      for(int k=0;k<c2;k++){
       for(int i=0;i<r1;i++){
	for(int j=0;j<r2;j++)
	  sum=sum+A[i][j]*B[j][k];
          C[i][k]=sum;
          sum=0;
        }
      } 
      return C;
    }
}