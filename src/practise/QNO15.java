package practise;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QNO15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        System.out.println("\nOccurrences of each element:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
        }

        sc.close();
		

	}

}
