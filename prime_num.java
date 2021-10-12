public class Main {

    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
    public static boolean isPrime(int x){
        if( x <= 1)
            return false;
        else if( x ==2 )
            return true;
        else if (x % 2 == 0)
            return false;

        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(x); i += 2)
        {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
