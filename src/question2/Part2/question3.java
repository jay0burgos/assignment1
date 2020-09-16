package question2.Part2;
import java.util.Arrays;
import java.util.Random;

public class question3 {
    public static int[] algo3(int num){
        boolean[] helperArray = new boolean[num];
        Arrays.fill(helperArray,false);
        Random random = new Random();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++){
            int temp = random.nextInt(num)+1;
            
            while(helperArray[temp-1]){     //runs till temp is not an index that is true
                temp = random.nextInt(num)+1;
            }
            helperArray[temp-1] = true;
            arr[i] = temp;
        }
        return arr;
    }
}
