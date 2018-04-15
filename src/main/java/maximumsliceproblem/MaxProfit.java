package maximumsliceproblem;

public class MaxProfit {

    public int solution(int[] A) {
        int tempProfit = 0, maxProfit = 0, min = A[0], max = 0;

        for (int i = 0; i < A.length; i++) {
            max = (max < A[i]) ? A[i] : max;

            if (min > A[i]) {
                min = A[i];
                max = 0;
            }

            tempProfit = max - min;
            if(tempProfit > maxProfit) maxProfit = tempProfit;
        }

        return maxProfit > 0 ? maxProfit : 0;
    }
}
