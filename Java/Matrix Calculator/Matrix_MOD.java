import java.util.ArrayList;
//import java.util.Collections;
public abstract class Matrix_MOD
{
  private double Mod2(double data[][],double factor){
         double res=data[0][0]*data[1][1]-data[0][1]*data[1][0];
         res=res*factor;
         return res;
  }
  private ArrayList<MATRIX_DATA> Store=new ArrayList<MATRIX_DATA>();
  private ArrayList<MATRIX_DATA> temp=new ArrayList<MATRIX_DATA>();
  private void ADD(double data[][],int SIZE){
        int r=0,c=0;
        for(int i=0;i<SIZE;i++){
            MATRIX_DATA x=new MATRIX_DATA(SIZE-1,SIZE-1);
            x.factor=data[i][0]*Math.pow(-1,i+2);
            r=0;
            for(int j=0;j<SIZE;j++){
                c=0;
                if(j!=i){
                    for(int k=1;k<SIZE;k++){ x.matrix[r][c]=data[j][k]; c++;}
                    r++; 
                }
            }
            Store.add(x);
        }
    }
    
    private void ADD2(double data[][],int SIZE,double fact){
        int r=0,c=0;
        for(int i=0;i<SIZE;i++){
            MATRIX_DATA x=new MATRIX_DATA(SIZE-1,SIZE-1);
            x.factor=fact*data[i][0]*Math.pow(-1,i+2);
            r=0;
            for(int j=0;j<SIZE;j++){
                c=0;
                if(j!=i){
                    for(int k=1;k<SIZE;k++){ x.matrix[r][c]=data[j][k]; c++;}
                    r++; 
                }
            }
            temp.add(x);
        }
    }
      
    @SuppressWarnings("unchecked")
	private void AddContinue(){
       for(int i=0;i<Store.size();i++){
           ADD2(Store.get(i).matrix,Store.get(i).ROW,Store.get(i).factor);
       }
       Store.clear();
       Store=(ArrayList<MATRIX_DATA>)temp.clone();
       temp.clear();
    }
    
    public double MOD(double mat[][],int SIZE){
       if(SIZE==2) return Mod2(mat,1.0);
       else{
       int iterator=SIZE-3;
       double res=0;
       ADD(mat,SIZE);
       for(int j=0;j<iterator;j++) AddContinue();
       for(int i=0;i<Store.size();i++) res+=Mod2(Store.get(i).matrix,Store.get(i).factor);
       Store.clear(); temp.clear();
       return res;
      }
    }
    
    public abstract double[][] Adjoint(double mat[][],int SIZE);
    public abstract double[][] Inverse(double mat[][],int SIZE) throws ArithmeticException;
}