package timecomplexity;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class TapeEquilibrium {

    public int solution(int[] A){

//        IntStream.rangeClosed(1, A.length)
//                .mapToObj(i -> A[A.length - i])
//                .toArray();


        int[] F = getPrefixSum(A, true);
        int[] B = getPrefixSum(A, false);
        int difference = Math.abs(F[0] - B[0]);

        for (int i = 0; i < A.length-2; i++){
            difference = Math.min(difference, Math.abs(F[i] - B[i+1]));
        }

        return difference;
    }


    public int[] getPrefixSum(int[] A, boolean forward){
        int[] prefixSum = new int[A.length];

        if(forward){
            prefixSum[0] = A[0];
            for (int i = 1; i < A.length; i++) {
                prefixSum[i] = prefixSum[i-1] + A[i];
            }
        } else {
            prefixSum[A.length - 1] = A[A.length - 1];
            for (int i = A.length-2; i > 0 ; i--) {
                prefixSum[i] = prefixSum[i + 1] + A[i];
            }
        }

        return prefixSum;
    }

}
