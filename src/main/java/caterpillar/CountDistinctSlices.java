package caterpillar;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctSlices {

    public int solution(int M, int[] A){

        Set<Integer> distinctSet = new HashSet<>();
        int front = 0, count = 0;

        for (int back = 0; back < A.length;  back++) {
            front = back;

            while(front < A.length){
                if(distinctSet.contains(A[front])){
                    distinctSet.clear();
                    break;
                } else {
                    distinctSet.add(A[front]);
                    count++;
                    front++;
                }
            }
            distinctSet.clear();
        }

        return count;
    }
}
