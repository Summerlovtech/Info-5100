package Q3SumEqualsToK;

public class Main {

        public static void main(String[] args) {
            Solution3 solution = new Solution3();
            // Test 1
            int[] nums1 = {1,1,1};
            int k1 = 2;
            System.out.println("Test Case 1:");
            System.out.println(solution.numOfSubArrays(nums1, k1));

            // Test 2
            int[] nums2 = {1,2,3};
            int k2 = 3;
            System.out.println("Test Case 2:");
            System.out.println(solution.numOfSubArrays(nums2, k2));
        }
    }

