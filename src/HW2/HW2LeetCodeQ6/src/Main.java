
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String testStingOne = "egg";
        String testStingTwo = "add";
        boolean resultOne = solution.isIsomorphic(testStingOne,testStingTwo);
        System.out.println(resultOne);

        String testStingThree = "foo";
        String testStingFour = "bar";
        boolean resultTwo = solution.isIsomorphic(testStingThree,testStingFour);
        System.out.println(resultTwo);

        String testStingFive = "paper";
        String testStingSix = "title";
        boolean resultThree = solution.isIsomorphic(testStingFive,testStingSix);
        System.out.println(resultThree);


    }
}