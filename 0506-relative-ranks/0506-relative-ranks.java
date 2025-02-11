class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,String> map = new HashMap<>();

        Integer[] integerArray = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(integerArray, Collections.reverseOrder());

        
        for(int i=0;i<integerArray.length;i++) {
            if(i==0)
                map.put(integerArray[i], "Gold Medal");
            else if(i==1)
                map.put(integerArray[i], "Silver Medal");
            else if(i==2)
                map.put(integerArray[i], "Bronze Medal");
            else
                map.put(integerArray[i], String.valueOf(i+1));
        }

        String[] answerArr = new String[score.length];

        for(int i=0;i<score.length;i++) {
            answerArr[i] = map.get(score[i]);
        }
        
        return answerArr;
    }
}