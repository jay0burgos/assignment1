package question2.part3;

import java.util.Random;
import java.util.Collections;

public class part3{
    public static void swap(int[] array, int index1, int index2){
           int temp = array[index1];
           array[index1] = array[index2];
           array[index2] = temp;

    }

    public static int[] algo3(int size){
        int[] arr = new int[size];
        Random random = new Random();
        for(int i = 1; i <= size; i++){
            arr[i-1] = i;
            System.out.println(i);
        }
        System.out.println("-------");
        for(int i = 1; i < size; i++ ){
            swap(arr,i, random.nextInt(size));
        }
        return arr;
    }
}
