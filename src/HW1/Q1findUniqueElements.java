package HW1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Q1findUniqueElements {

     public static void main(String[] args) {

        int[] testArrayOne={1,2,3,2};
        int rstOne = sumOfUnique(testArrayOne);
        System.out.println(rstOne);
        int[] testArrayTwo={1,1,1,1,1};
        int rstTwo = sumOfUnique(testArrayTwo);
        System.out.println(rstTwo);
        int[] testArrayThree={1,2,3,4,5};
        int rstThree = sumOfUnique(testArrayThree);
        System.out.println(rstThree);
     }
     private static int sumOfUnique(int[] nums){
         Map<Integer, Integer> map= new HashMap<>();
         for(int i=0; i<nums.length; i++){
             int currentElement= nums[i];
             map.putIfAbsent(currentElement,0);
             int valueOne= map.get(currentElement);
             map.put(currentElement, valueOne+1);
         }
         int sum=0;
         for (int key: map.keySet()){
             int valueTwo= map.get(key);
             if (valueTwo==1){
                 sum= sum+key;
             }
         }
         return sum;
     }

}



