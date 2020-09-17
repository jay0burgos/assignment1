package question2.Part2;

import question2.part1.Question2;

public class Main {
    public static void main(String[] args) {

        double averageDuration = 0;
        for (int i = 0; i < 10; i++){    //will add up the running time of 10 iterations of this algo
            long startTime = System.nanoTime();
            int[]arr = question3.algo3(800000) ;
            long endTime = System.nanoTime();

            double duration = (endTime - startTime);
            duration /= 1000000000;
            averageDuration += duration;
        }

        int[] arr = question3.algo3(800000) ;
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Running average time for N = 25,000 is " + averageDuration/10);
    }
}
//running for n = 25000 is on average around  0.0045 seconds
//running for n = 50000 is on average around  0.0090 seconds
//running for n = 100000 is on average around  0.017 seconds
//running for n = 200000 is on average around  0.036 seconds
//running for n = 400000 is on average around  0.078 seconds
//running for n = 800000 is on average around  0.175 seconds
