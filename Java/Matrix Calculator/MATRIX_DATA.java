
public class MATRIX_DATA
{
    public int ROW,COLUMN;
    public double factor, matrix[][];
    public MATRIX_DATA(int row,int column)
    {
       ROW=row; COLUMN=column;
       matrix=new double[ROW][COLUMN];
    }
}