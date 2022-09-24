package src.com.alogorithm.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer I[] = {1,3,-1,-3,5,3,6,7};


        List<Integer> integers = new ArrayList<>(List.of(I));


        List<Integer> consecutiveSums = ConsecutiveSum.ConsecutiveSum(integers, 3);

        System.out.println(consecutiveSums);
    }
}
