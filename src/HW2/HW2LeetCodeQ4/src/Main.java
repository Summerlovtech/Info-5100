import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[][] testArrayOne = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrixOne = solution.rotate(testArrayOne);
        System.out.println(Arrays.deepToString(matrixOne));

        int[][] testArrayTwo = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int[][] matrixTwo = solution.rotate(testArrayTwo);
        System.out.println(Arrays.deepToString(matrixTwo));

        int[][] testArrayThree = {{1,2},{3,4}};
        int[][] matrixThree = solution.rotate(testArrayThree);
        System.out.println(Arrays.deepToString(matrixThree));

        int[] testArrayFour = {1};
        int[] matrixFour = solution.rotateTwo(testArrayFour);
        System.out.println(Arrays.toString(matrixFour));
        


    }
}

