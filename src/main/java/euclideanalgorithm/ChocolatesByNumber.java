package euclideanalgorithm;

import java.util.Arrays;

public class ChocolatesByNumber {

    public int solution(int N, int M){
        int i = 0, count = 0;
        
        int[] bars = new int[N];


        while(bars[i] == 0){
            bars[i] = 1;
            count++;
            i = ((i + M) < N) ? i+M : (M - (N - i));
        }

        return count;
    }
}
