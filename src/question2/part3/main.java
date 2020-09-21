package question2.part3;

import question2.Part2.question3;
import question2.part1.Question2;

public class main {
    public static void main(String[] args) {
        int[] arr = part3.algo3(5);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }   //to check it works


        double averageDuration = 0;
        for (int i = 0; i < 10; i++){    //will add up the running time of 10 iterations of this algo
            long startTime = System.nanoTime();
            int[]array = part3.algo3(6400000) ;
            long endTime = System.nanoTime();

            double duration = (endTime - startTime);
            duration /= 1000000000;
            averageDuration += duration;
        }


        System.out.println("Running average time for N = 100,000 is " + averageDuration/10);
    }
}
     // Running average time for N = 100,000 is 0.0033 seconds
     //Running average time for N = 200,000 is 0.0063 seconds
    //Running average time for N = 400,000 is 0.013 seconds
    // Running average time for N = 800,000 is 0.030  seconds
    //  Running average time for N = 1,600,000 is 0.068  seconds
    //Running average time for N = 3,200,000 is 0.1564521639  seconds
    //  Running average time for N = 6,400,000 is 0.3508976158   seconds
