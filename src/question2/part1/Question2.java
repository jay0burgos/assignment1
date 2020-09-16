package question2.part1;

import java.util.Random;

public class Question2 {
              //running time of function is N!!!!!!
        public static boolean isThere(int[] array, int num, int index){
            boolean isItThere = false;   //running time of 1
            for(int i =0; i <= index; i++){      //running time i
                if(array[i] == num){   //running time of 1
                    isItThere = true;   //running time of 1
                }
            }
            return isItThere;
        }


        public static int[] firstAlgo(int N){
                Random random = new Random();  //running time of 1(initilizing)k
              int[] arr = new int[N];
              for (int i = 0; i < N; i++){
                  int temp = random.nextInt(N+1);  //running time of random is O(1)
                  while (isThere(arr, temp, i)){
                      temp = random.nextInt(N+1);
                  }
                  arr[i] = temp;
              }
             return arr;
        }

        
}
