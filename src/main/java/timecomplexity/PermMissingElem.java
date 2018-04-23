package timecomplexity;

public class PermMissingElem {

    public int solution(int[] A){

        int sum = 0, N = A.length + 1;

        int sumTemp = N * (1 + N)/2;

        for (int i : A) {
            sum +=i;
        }

        return sumTemp - sum;
    }
}
