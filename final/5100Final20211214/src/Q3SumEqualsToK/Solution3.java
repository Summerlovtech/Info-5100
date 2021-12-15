package Q3SumEqualsToK;

public class Solution3 {

    public int numOfSubArrays(int[] nums, int k) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    total++;
                }
            }
        }

        return total;
    }
}
