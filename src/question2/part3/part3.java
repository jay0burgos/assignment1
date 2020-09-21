package question2.part3;

import java.util.Random;
import java.util.Collections;

public class part3{
    public static void swap(int[] array, int index1, int index2){
           int temp = array[index1];      //run time of 1
           array[index1] = array[index2];  // run time of 1
           array[index2] = temp;        //run time of 1

    }

    public static int[] algo3(int size){
        int[] arr = new int[size];
        Random random = new Random();
        for(int i = 1; i <= size; i++){      //O(N) to fill the array
            arr[i-1] = i;
            //System.out.println(i);
        }
        //System.out.println("-------");
        for(int i = 1; i < size; i++ ){         //runs linearly at N
            swap(arr,i, random.nextInt(size));  // runs at O(3)
        }
        return arr;
    }
}
