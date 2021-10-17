public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String testStingOne = "the sky is blue";
        String testStingTwo = "hello world";
        String testStingThree = "a good example";
        String testStingFour = " Bob Loves Alice ";
        String testStingFive = "Alice does not even like bob";

        String resultOne = solution.reverseWords(testStingOne);
        System.out.println(resultOne);

        String resultTwo = solution.reverseWords(testStingTwo);
        System.out.println(resultTwo);

        String resultThree = solution.reverseWords(testStingThree);
        System.out.println(resultThree);

        String resultFour = solution.reverseWords(testStingFour);
        System.out.println(resultFour);

        String resultFive = solution.reverseWords(testStingFive);
        System.out.println(resultFive);

    }
}
