package caterpillar;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctSlices {

    public int solution(int M, int[] A){

        Set<Integer> distinctSet = new HashSet<>();
        int back = 0, front = 0, count = 0;

        for (int k : A) {
            front = k;

            if(distinctSet.contains(A[front])){

            }
        }

        return 0;
    }
}
