package question2.Part2;
import java.util.Arrays;
import java.util.Random;

public class question3 {
    public static int[] algo3(int num){
        boolean[] helperArray = new boolean[num];   //running time of 1
        Arrays.fill(helperArray,false);    //running time of O(n) for this function
        Random random = new Random();  // running time of 1
        int[] arr = new int[num];
        for (int i = 0; i < num; i++){      //O(n)
            int temp = random.nextInt(num)+1;  //running time of 1
            
            while(helperArray[temp-1]){     //runs till temp is not an index that is true
                temp = random.nextInt(num)+1;            //runs at O(log n)
            }
            helperArray[temp-1] = true;    //running time of 1
            arr[i] = temp;         // running time of 1
        }
        return arr;
    }
}
//Complexity
//4n+n*logn   therefor its n*logn