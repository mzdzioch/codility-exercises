package primeandcomposite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Peaks {
    public int solution(int[] A) {
        int count = 0;
        List<Integer> peakList = new ArrayList<>();

        for (int i = 1; i < A.length - 1; i++) {
            if(A[i-1] < A[i] && A[i+1] < A[i]){
                peakList.add(i);
                count++;
            }
        }

        boolean ok = true;

        for (int size = 1; size < A.length; size++) {

            int blocks = A.length/size;

            if(A.length % size != 0 || blocks > count)
                continue;

            int threshold = 0;

            for (int j = 0; j < peakList.size(); j++) {

                if(peakList.get(j)/size > threshold){
                    ok = false;
                    break;
                }

                if(peakList.get(j)/size == threshold){
                    threshold++;
                }

            }

            if(ok)
                return threshold;
        }



        return 0;
    }


}
