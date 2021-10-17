public class Solution {
    public Solution(){

    }


        public int shortestDistance(String[] wordsDict, String word1, String word2) {
            int minDistance = wordsDict.length;
            if (word1 == word2){
                return 0;
            }
            else{
                for(int i=0; i<wordsDict.length;i++){
                    if (wordsDict[i].equals(word1)){
                        for(int j=0; j<wordsDict.length;j++){
                            if (wordsDict[j].equals (word2)){
                                minDistance =Math.abs(i-j);
                            }
                        }
                    }

                }
                return minDistance;

            }
        }
    }

