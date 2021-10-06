public class Program
{
    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=n;col>=row;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row=1;row<=2*n;row++){
        int no_of_col;
        if(row>n){
            no_of_col=2*n-row;
        }else {
            no_of_col=row;
        }
            for(int col=1;col<=no_of_col;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}