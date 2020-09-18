package question3;
import java.util.*;

import java.awt.*;
import java.util.List;

public class question3Algo {
    public static int recursiveHelper(List<Integer> arrB, int index, int[] mainArray ){
        if(index >= arrB.size()) {
            return -1;
        }
        int runningCount = 0;
        for (int i = 0; i < mainArray.length; i++){
              if(arrB.get(index) == mainArray[i]){
                  runningCount++;
              }
        }
        if(runningCount>(mainArray.length/2.0)){
            return index;
        }
        return recursiveHelper(arrB, index+1, mainArray);

    }
    public static void majority(int[] arr){
        List<Integer> listB = new ArrayList<>();
        for (int i = 0; i < arr.length; i+=2){
            if (arr[i] == arr[i+1]){
                listB.add(arr[i]);
            }
        }
       int index = recursiveHelper(listB, 0, arr);
       if(index == -1){
           System.out.println("There is no majority number");
       }
       else{
           System.out.println("Majority number is " + listB.get(index) );
       }
    }
}
