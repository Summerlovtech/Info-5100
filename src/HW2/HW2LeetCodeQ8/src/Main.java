public class Main {
    public static void main(String[] args) {


        Solution solution = new Solution();
        String testStingOne = "A man, a plan, a canal: Panama";
        String testStingTwo = "race a car";
        boolean resultOne = solution.isPalindrome(testStingOne);
        System.out.println(resultOne);
        boolean resultTwo = solution.isPalindrome(testStingTwo);
        System.out.println(resultTwo);

    }
}