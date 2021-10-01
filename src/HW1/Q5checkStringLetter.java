package HW1;

public class Q5checkStringLetter {
    public static void main(String[] args) {

        String checkResultOne="1A3d4s5t";
        boolean resultOne = example(checkResultOne);
        System.out.println(resultOne);
        String checkResultTwo="A2bb2d4";
        boolean resultTwo = example(checkResultTwo);
        System.out.println(resultTwo);
    }
    private static boolean example(String checkResult) {
        boolean pre = false;
        boolean post = false;
        for (int i = 0; i < checkResult.length() - 1; i++) {
            pre = Character.isDigit(checkResult.charAt(i));
            post = Character.isDigit(checkResult.charAt(i + 1));
            if (pre == post){
                return false;
            }
        }
        return true;
    }
}
