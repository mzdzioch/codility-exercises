package maximumsliceproblem;

public class MaxDoubleSliceSum {

    public int solution(int[] A){
        int max = 0;
        int[] A1 = new int[A.length];
        int[] A2 = new int[A.length];

        for (int i = 1; i < A.length-1; i++) {
            A1[i] = Math.max(A1[i-1] + A[i], 0);
        }
        for (int i = A.length -2; i >=1; i--) {
            A2[i] = Math.max(A2[i+1] + A[i], 0);
        }

        for (int i = 1; i < A.length-1; i++) {
            max = Math.max(max, A1[i-1] + A2[i+1]);
        }
        return max;
    }
}
