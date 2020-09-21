package question6;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> SecondList = new ArrayList<>();

        for(int i =0; i < 10; i++){
            firstList.add(i+1);
        }
        for(int i=0; i < 3; i++){
            SecondList.add(i+1);
        }
        question6.printLots(firstList, SecondList);

    }
}
