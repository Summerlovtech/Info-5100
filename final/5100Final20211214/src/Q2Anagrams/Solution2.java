package Q2Anagrams;

import java.util.*;

public class Solution2 {

    public List<List<String>> groupAnagrams(List<String> strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String str : strs) {
            String sortedStr = sortStringByLetter(str);
            if (!groups.containsKey(sortedStr)) {
                groups.put(sortedStr, new ArrayList<>());
            }
            groups.get(sortedStr).add(str);
        }
        return new ArrayList<>(groups.values());
    }

    public String sortStringByLetter(String str) {
        char[] letters = str.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }

    public void printResult(List<List<String>> groups) {
        for (List<String> group : groups) {
            for (String str : group) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }

}
