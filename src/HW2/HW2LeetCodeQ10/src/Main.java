public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        char[] testArrayOne = {'a','a','b','b','c','c','c'};
        char[] testArrayTwo = {'a'};
        char[] testArrayThree =  {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        char[] testArrayFour ={'a','a','a','b','b','a','a'};

        int resultOne = solution.compress(testArrayOne);
        System.out.println(resultOne);

        int resultTwo = solution.compress(testArrayTwo);
        System.out.println(resultTwo);

        int resultThree = solution.compress(testArrayThree);
        System.out.println(resultThree);

        int resultFour = solution.compress(testArrayFour);
        System.out.println(resultFour);

    }


}
