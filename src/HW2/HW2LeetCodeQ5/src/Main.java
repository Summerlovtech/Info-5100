
import java.lang.Integer;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] testArrayOne = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> listOne = solution.spiralOrder(testArrayOne);
        System.out.println(listOne);

        int[][] testArrayTwo = {{1, 2, 3,4}, {5, 6,7,8},{9,10,11,12}};
        List<Integer> listTwo = solution.spiralOrder(testArrayTwo);
        System.out.println(listTwo);

    }
}