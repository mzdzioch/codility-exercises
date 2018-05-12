package countingelements;

import java.util.Arrays;

public class MaxCounters {

    public int[] solution(int N, int[] A){
        int[] result = new int[N];
        Arrays.fill(result, 0);
        int max = 0, index;

        for (int i = 0; i < A.length; i++) {
            if(A[i] <= N){
                index = A[i] - 1;
                result[index] = increase(result[index]);
                max = Math.max(max, result[index]);
            } else {
                Arrays.fill(result, max);
            }
        }

        return result;
    }


    public int increase(int a){
        return ++a;
    }


}
