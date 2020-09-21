package question6;
import java.util.*;

public class question6 {
    public static void printLots(List<Integer> L,List<Integer> P ){
        for (int i=0; i < P.size(); i++){
            System.out.println(L.get(P.get(i)));
        }
    }

}
