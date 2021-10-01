package HW1;

import com.sun.deploy.security.SelectableSecurityManager;

import java.lang.reflect.Array;

import java.util.Arrays;

public class Q2SquaresOfASortedArray {
    public static void main(String[] args) {

        int[] testArrayOne = {-4, -1, 0, 3, 10};
        int[] rstOne = squaresOfASortedArray(testArrayOne);
        System.out.println(Arrays.toString(rstOne));
    }

    private static int[]squaresOfASortedArray(int[] numsOne){
        int n=numsOne.length;
        int[] numsTwo = new int[n];
        for(int i=0,j= n-1;i<j;n--) {
            if (Math.abs(numsOne[i]) >= Math.abs(numsOne[j])) {
                numsTwo[n-1] = numsOne[i] * numsOne[i];
                i++;
                System.out.println("i = " + i);
            } else if(Math.abs(numsOne[i]) < Math.abs(numsOne[j])) {
                numsTwo[n-1] = numsOne[j] * numsOne[j];
                j--;
                System.out.println("j = " + j);
            }

        }
        return numsTwo;

            }
        }


