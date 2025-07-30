package practise;
import java.util.*;

public class QNO26 {

    public static void main(String[] args) {
        int[] input = {2, 3, 54, 1, 6, 7, 7};
        Set<Integer> uniqueSet = new HashSet<>();

        for (int num : input) {
            uniqueSet.add(num);
        }

        int evenSum = 0;
        for (int num : uniqueSet) {
            if (num % 2 == 0) {
                evenSum += num;
            }
        }

        System.out.println("Unique elements: " + uniqueSet);
        System.out.println("Sum of even numbers: " + evenSum);
    }
}
