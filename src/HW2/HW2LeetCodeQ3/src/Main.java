import java.lang.String;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {0,1,0,3,12};
        int[] newarrOne =solution.moveZeroes(nums1);
        System.out.println(Arrays.toString(newarrOne));

        int[] nums2 = {0};
        int[] newarrTwo =solution.moveZeroes(nums2);
        System.out.println(Arrays.toString(newarrTwo));

    }
}
