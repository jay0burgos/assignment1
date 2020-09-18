package question4;
import java.lang.Math;

public class q4algo {
    public static boolean isPrime(int N){
        for(int i=2; i <= Math.sqrt(N); i++ ){
            if(N%i == 0){
                return false;
            }
        }
        return true;
    }

}
