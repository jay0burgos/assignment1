package question2.part1;

import java.util.Random;

public class Question2 {

        public static boolean isThere(int[] array, int num, int index){
            boolean isItThere = false;
            for(int i =0; i <= index; i++){
                if(array[i] == num){
                    isItThere = true;
                }
            }
            return isItThere;
        }


        public static int[] firstAlgo(int N){
                Random random = new Random();
              int[] arr = new int[N];
              for (int i = 0; i < N; i++){
                  int temp = random.nextInt(N+1);
                  while (isThere(arr, temp, i)){
                      temp = random.nextInt(N+1);
                  }
                  arr[i] = temp;
              }
             return arr;
        }

        
}
