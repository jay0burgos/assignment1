package question2.part1;
import java.lang.Object.*;

public class Main {                                       

    public static void main(String[] args) {
        double averageDuration = 0;
        for (int i = 0; i < 10; i++){    //will add up the running time of 10 iterations of this algo
            long startTime = System.nanoTime();
            int[]arr = Question2.firstAlgo(500);
            long endTime = System.nanoTime();

            double duration = (endTime - startTime);
            duration /= 1000000000;
            averageDuration += duration;
        }
        //to prove the algo works, but will not be part of average
        long startTime = System.nanoTime();
        int[]arr = Question2.firstAlgo(2000);
        long endTime = System.nanoTime();

        double duration = (endTime - startTime);
        duration /= 1000000000;
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }


        System.out.println("Running average time for N = 500 is " + averageDuration/10);



    }
}
        //running for n = 250 is on average around  8.0E-4 seconds
        //running for n = 500 is on average around  0.0013 seconds
        //running for n = 1000 is on average around 0.0032 seconds
        //running for n = 2000 is on average around 0.011 seconds
