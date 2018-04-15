package prefixsum;

public class MinAvgTwoSlice {

    public int solution(int[] A, int N){

        double sum = 0, tempSum = 0;
        int index = 0;

        for (int i = 0; i < A.length; i++) {
            if(i != A.length - 1) {
                sum = ((double) A[i] + (double) A[i + 1]) * 0.5;

                if(i == 0) {
                    tempSum = sum;
                }

                if(sum < tempSum) {
                    tempSum = sum;
                    index = i;
                }
            }
        }

        return index;
    }
}
