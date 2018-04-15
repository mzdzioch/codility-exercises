package maximumsliceproblem;

public class MaxSliceSum {

    public int solution(int[] A){
        int max = 0, tempMax = 0;

        for (int i = 0; i < A.length; i++) {

            tempMax = ((tempMax + A[i]) > 0) ? tempMax + A[i] : 0;
            max = (tempMax > max) ? tempMax : max;

//            if((A[i] + tempMax) > tempMax){
//                tempMax += A[i];
//            } else if(tempMax > max){
//                max = tempMax;
//                tempMax = 0;
//            } else if(tempMax < max){
//                tempMax = 0;
//            }
        }

        return max;
    }
}
