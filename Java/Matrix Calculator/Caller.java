import java.util.Scanner;

public class Caller
{
    private static Scanner obj=new Scanner(System.in);
    private static Matrix_CALC tool=new Matrix_TOOL(); //Base abstract class can hold an instance of derived class
    public static void main(String args[]){
       try{ 
         System.out.print("What to you want?\n1.Determinant of Matrix\n2.Adjoint of Matrix\n3.Inverse of Matrix\n4.Multiply 2 Matrices\n");
         char x=obj.nextLine().charAt(0); 
         if(x=='1'){
          System.out.print("Enter size of the Matrix="); int size=obj.nextInt();
          if(size==1) throw new ArithmeticException("Matrix Size can't be 1");
          double[][] matrix=new double[size][size];
          System.out.println("\nEnter the Matrix=\n");
          for(int i=0;i<size;i++)
            for(int j=0;j<size;j++) matrix[i][j]=obj.nextDouble();
          double res=tool.MOD(matrix,size);
          System.out.println("The Determinant of the given matrix is= "+res); 
          }
          else if(x=='2'){
          System.out.print("Enter size of the Matrix="); int size=obj.nextInt();
          if(size==1) throw new ArithmeticException("Matrix Size can't be 1");
          double[][] matrix=new double[size][size];
          System.out.println("\nEnter the Matrix=\n");
          for(int i=0;i<size;i++)
            for(int j=0;j<size;j++) matrix[i][j]=obj.nextDouble();
          double[][] res=tool.Adjoint(matrix,size);
          System.out.println("The Adjoint of the given matrix is=\n"); 
          Matrix_CALC.DispMat(res,size,size);
          }
          else if(x=='3'){
          System.out.print("Enter size of the Matrix="); int size=obj.nextInt();
          if(size==1) throw new ArithmeticException("Matrix Size can't be 1");
          double[][] matrix=new double[size][size];
          System.out.println("\nEnter the Matrix=\n");
          for(int i=0;i<size;i++)
            for(int j=0;j<size;j++) matrix[i][j]=obj.nextDouble();
          double[][] res=tool.Inverse(matrix,size);
          System.out.println("The Inverse of the given matrix is=\n"); 
          Matrix_CALC.DispMat(res,size,size);
          }
          else if(x=='4'){
             System.out.print("Enter number of Rows and Columns of first Matrix=");
             int r=obj.nextInt(), c=obj.nextInt();
             double[][] matrix1=new double[r][c];             
             System.out.println("\nEnter the Matrix=\n");
             for(int i=0;i<r;i++)
                for(int j=0;j<c;j++) matrix1[i][j]=obj.nextDouble();
             System.out.print("Enter number of Columns of first Matrix="); int c2=obj.nextInt();
             double[][] matrix2=new double[c][c2];             
             System.out.println("\nEnter the Matrix=\n");
             for(int i=0;i<c;i++)
                for(int j=0;j<c2;j++) matrix2[i][j]=obj.nextDouble();
             double res[][]=tool.MatMul(matrix1,matrix2,r,c,c2);
             System.out.println("The resultant matrix is=\n"); 
             Matrix_CALC.DispMat(res,r,c2);
          }    
          else throw new Exception("Invalid input");
       }catch(Exception e){
           System.out.println(e);
       }
    }
}