package sorting;

import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A, int N) {

        int[] sortedArray = Arrays.stream(A)
                .sorted()
                .toArray();

        if(sortedArray.length > 2 )
        return sortedArray[N-1] * sortedArray[N-2] * sortedArray[N-3];

        return 0;
    }
}
