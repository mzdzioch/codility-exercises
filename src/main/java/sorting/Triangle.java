package sorting;

import java.util.Arrays;

public class Triangle {

    public int solution(int[] B, int N){

        int a = 0, b = 0, c = 0;

        int[] A = Arrays.stream(B)
                .sorted()
                .toArray();

        for (int i = 0; i < A.length - 2; i++) {

            a = A[i];
            b = A[i + 1];
            c = A[i + 2];

            if((a + b > c) && (b + c > a) && (c + a > b)){
                return 1;
            }
        }
        return 0;

    }
}
