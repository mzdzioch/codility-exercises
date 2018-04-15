package primeandcomposite;

public class CountFactors {

    public int solution(int N){

        int factors = 1, minFactor = 2;

        while(N%minFactor != 0){
            minFactor++;
        }
        factors++;

        for (int i = 2 * minFactor; i <= N; i=i+minFactor) {
            if(N%i == 0) factors++;
        }

        return factors;
    }

    public int solution2(int N){
            int res = 0;
            for (int i = 1; (long)i*i <=N ; i++) {
                if (i*i == N)
                    return ++res;
                else if(N%i == 0)
                    res+=2;
            }
            return res;
    }


}
