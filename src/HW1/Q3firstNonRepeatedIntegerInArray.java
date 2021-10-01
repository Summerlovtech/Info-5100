package HW1;

import java.util.HashMap;
import java.util.Map;

public class Q3firstNonRepeatedIntegerInArray {

    public static void main(String[] args) {
        int[] testArrayOne = {2, 3, 4, 2, 2, 3, 5, 7};
        int first = firstNonRepeatedInteger(testArrayOne);
        System.out.println(first);
    }

    private static int firstNonRepeatedInteger(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentElement = nums[i];
            map.putIfAbsent(currentElement, 0);
            int valueOne = map.get(currentElement);
            map.put(currentElement, valueOne + 1);
        }
        for (int k: nums) {
            if (map.get(k) ==1) {
                return k;
            }
        }
        return -1;
    }
}




