package sorting;

import java.util.Arrays;

public class Distinct {


    public int solution(int[] A){

        int distinct = 1;

        if(A.length == 0) return 0;

        int[] tempA = Arrays.stream(A)
                .sorted()
                .toArray();

        for (int i = 0; i < tempA.length - 1; i++) {
            if(tempA[i] != tempA[i+1])
                distinct++;
        }

        return distinct;
    }
}
