package countingelements;

import java.util.ArrayList;

public class FrogRiverOne {
    public int solution(int distanceX, int[] A, int N) {

        int isNew = 0;
        boolean[] hasLeaf = new boolean[distanceX];


        for (int i = 0; i < A.length; i++) {

            if(A[i] < distanceX){
                if(!hasLeaf[A[i]]){
                    hasLeaf[A[i]] = true;
                    isNew++;
                }
            } else if(A[i] == distanceX && isNew == distanceX - 1){
                return i;
            }

        }

        return -1;
    }
}
