import java.util.Arrays;
import java.lang.String;
public class TransposeMatrix {
    public static void main(String[] args) {
        Transpose transpose = new Transpose();

        int[][] testArrayOne = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] matrix = transpose.trans(testArrayOne);
        System.out.println(Arrays.deepToString(matrix));

        int[][] testArrayTwo = {{1, 2, 3},{4, 5, 6}};
        System.out.println(Arrays.deepToString(transpose.trans(testArrayTwo)));

    }



}

