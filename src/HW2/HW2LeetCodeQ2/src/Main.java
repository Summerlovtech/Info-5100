import java.lang.String;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] wordsDict1 = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "practice";

        int dis1 = solution.shortestDistance(wordsDict1,word1,word2);
        System.out.println(dis1);

        String[] wordsDict2 = {"practice", "makes", "perfect", "coding", "makes"};
        String word3 = "makes";
        String word4 = "coding";
        int dis2 = solution.shortestDistance(wordsDict2,word3,word4);
        System.out.println(dis2);

    }

}


