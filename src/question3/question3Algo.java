package question3;
import java.util.*;

import java.awt.*;
import java.util.List;

public class question3Algo {
    public static void main(String[] args) {
          int[] nums = {3,3,4,2,4,4,2,4,4};
        ArrayList<Integer> mainList = new ArrayList<>(Arrays.asList(3,3,4,2,4,4,2,4,4));
        ArrayList<Integer> mainCandidate = new ArrayList<>();
        mainCandidate = majority(mainList); //will return zero or one no matter what since mathmatically if only two
        // opposing candidates are in the new array it means there isn't a majority number
        if(mainCandidate.size() == 0){
            System.out.println("There is no majority number");
        }
        else{
            int runningTotal = 0;
            for (int i = 0; i < mainList.size(); i++){
                if(mainList.get(i) == mainCandidate.get(0)){
                     runningTotal++;
                }
            }
            if (runningTotal > mainList.size()/2){
                System.out.println("Majority number is " + mainCandidate.get(0) );
            }
            else {
                System.out.println("There is no majority number");
            }
        }


    }
        

    public static ArrayList<Integer> majority(ArrayList<Integer>arr){
        ArrayList<Integer> listB = new ArrayList<>();
        for (int i = 0; i < arr.size(); i+=2){
            if (arr.get(i) == arr.get(i+1)){
                listB.add(arr.get(i));
            }
            else if(arr.size() %2 != 0 && i+2 == arr.size()-1 && (arr.get(i+1) == arr.get(i+2) || arr.get(i+2) == arr.get(0))){   //also checks if front and back are the same for odd ints such as in the case of an array like 1 2 1 2 1
                listB.add(arr.get(i+2));
            }
        }


        if(listB.size() >=2){     //loops untill theres only one candidate
            return majority(listB);
        }
        else if(listB.size() == 1){
            return listB;
        }
        else    //if its zero
            return listB;



    }
}
