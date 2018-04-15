package prefixsum;

public class CountDiv {

    public int solution(int A, int B, int K){

        int numOfDividers = 0;

        int minNum = ((int) Math.floor((double) A/K)) * K;
        int maxNum = ((int) Math.floor((double) B/K)) * K;

        numOfDividers = (maxNum - minNum)/K;

        //System.out.println(minNum +" " + maxNum);

        return numOfDividers;
    }
}
