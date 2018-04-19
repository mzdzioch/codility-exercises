package sieveoferatosthenes;

public class CountSemiprimes {

    public int[] solution(int N, int[] P, int[] Q){

        int[] result = new int[P.length];
        int[] semiprimes = createSemiprimeArray(N);

        for (int i = 0; i < result.length; i++) {
            result[i] = semiprimes[Q[i]-1] - semiprimes[P[i]-1];
        }
        return result;
    }

    public int[] createSemiprimeArray(int N){
        int[] semiprimes = new int[N];
        int count = 0;

        for (int i = 1; i <= semiprimes.length; i++) {
             if(checkIfSemiprime(i)){
                 count++;
             }
             semiprimes[i-1] = count;
        }

        return semiprimes;
    }

    public boolean checkIfSemiprime(int N){

        int count = 0;

        for (int i = 2; count < 2 && i*i <= N; i++) {
            while (N % i == 0) {
                N = N / i;

                count++;
            }
        }

            if(N > 1)
                count++;


        return (count == 2) ? true : false;
    }
}
