import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] testArray = {1, 3, -1, 3, 4, -1};
        // 3 + (-1) = 2;
        System.out.println(sumOfRepeatedNum(testArray));

        int[] testArrayTwo = {0, 1, 3, 2, 2, 2, -1, -1, 1, 5};
        // 1 + 2 - 1 = 2;
        System.out.println(sumOfRepeatedNum(testArrayTwo));
    }


    private static int sumOfRepeatedNum(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i : arr) {
            count.put(i, count.getOrDefault(i, 0) + 1);
            }
        int sum = 0;
        for (int key : count.keySet()) {
            if (count.get(key) > 1) {
                sum += key;
                }
            }
            return sum;
        }
    }




