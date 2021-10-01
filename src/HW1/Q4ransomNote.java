package HW1;

public class Q4ransomNote {
    public static void main(String[] args) {
        String ransomNoteOne = "aa";
        String magazineOne = "aab";
        boolean resultOne = checkResult(ransomNoteOne, magazineOne);
        System.out.println(resultOne);

        String ransomNoteTwo = "aa";
        String magazineTwo = "ab";
        boolean resultTwo = checkResult(ransomNoteTwo, magazineTwo);
        System.out.println(resultTwo);

        String ransomNoteThree = "adfi";
        String magazineThree = "abcdeffghii";
        boolean resultThree = checkResult(ransomNoteThree, magazineThree);
        System.out.println(resultThree);
    }

    private static boolean checkResult(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int i = 0;
        for (int j = 0; j < magazine.length(); j++) {
            char r = ransomNote.charAt(i);
            char m = magazine.charAt(j);
            if (r == m) {
                i = i + 1;
            }
            if (i == ransomNote.length()) {
                return true;
            }
        }
            return false;
        }

    }

