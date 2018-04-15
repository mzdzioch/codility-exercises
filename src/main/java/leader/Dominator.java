package leader;

import java.util.Arrays;

public class Dominator {

    public int solution(int[] A){

        int max = 0, current = 0;


        int[] sortedArray = Arrays.stream(A)
                .sorted()
                .toArray();

        for (int i = 0; i < sortedArray.length; i++) {

            if(current == sortedArray[i]){
                max++;
            } else {
                current = sortedArray[i];
            }
        }

        if((2 * max) >= A.length)
            return max;
        return -1;
    }


}
