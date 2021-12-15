package Q2Anagrams;
import java.util.*;

public class Main {

        public static void main(String[] args) {
            Solution2 solution = new Solution2();

            // Test 1
            System.out.println("Test Case 1:");
            List<String> originalStrs = new ArrayList<>();
            originalStrs.add("eat");
            originalStrs.add("tea");
            originalStrs.add("tan");
            originalStrs.add("ate");
            originalStrs.add("nat");
            originalStrs.add("bat");

            List<List<String>> groups = solution.groupAnagrams(originalStrs);
            solution.printResult(groups);

            // Test 2
            System.out.println("Test Case 2:");
            originalStrs = new ArrayList<>();
            groups = solution.groupAnagrams(originalStrs);
            solution.printResult(groups);

            // Test 3
            System.out.println("Test Case 3:");
            originalStrs = new ArrayList<>();
            originalStrs.add("a");
            groups = solution.groupAnagrams(originalStrs);
            solution.printResult(groups);
        }
    }
