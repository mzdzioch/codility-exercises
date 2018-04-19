package primeandcomposite;

public class Semiprime {

    public static void main(String[] args) {
        System.out.println(checkIfSemiprime(25));
    }

    public static boolean checkIfSemiprime(int N){

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
