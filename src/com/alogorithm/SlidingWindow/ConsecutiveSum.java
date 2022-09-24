package src.com.alogorithm.SlidingWindow;


import javax.imageio.stream.IIOByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
 * You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 *
 * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [3,3,5,5,14,16]
 * Explanation:
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       14
 *  1  3  -1  -3  5 [3  6  7]      16
 *
 * Return the max sliding window.
 */

public class ConsecutiveSum {

    private List<Number> array;

    ConsecutiveSum(List<Number> array){
        this.array = array;
    }

    public static List<Integer> ConsecutiveSum(List<Integer> numbers, Integer windowSize){
        if(numbers.size() < windowSize){
            throw new RuntimeException("Size of array is less than window size");
        }

        int sum = 0;
        List<Integer> consecutiveSums = new ArrayList<>();
        List<Integer> max = new ArrayList<>();

        for (int i = 0; i <= windowSize - 1; i++){
            sum += numbers.get(i);
        }

        consecutiveSums.add(sum);

        for(int i = 1; i <= numbers.size() - windowSize; i++ ){
            if(windowSize + i > numbers.size()){
                break;
            }

            Integer prev = consecutiveSums.get(i - 1);
            Integer next = prev - numbers.get(i - 1) + numbers.get(windowSize + i - 1);

            consecutiveSums.add(next);

        }

        return consecutiveSums;
    }
}
