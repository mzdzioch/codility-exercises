package primeandcomposite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flags {

    public static int solution(int[] A) {
        return flags(A);
    }

    public static int[] nextPeak(int[] A) {
        int N = A.length;
        ArrayList<Integer>  peaks = createPeaks(A);
        int[] next = new int[N];
        next[N-1] = -1;
        for (int i = N-2; i > -1; i--) {
            if(peaks.contains(i))
                next[i] = i;
            else
                next[i] = next[i+1];
        }
        return next;
    }

    public static ArrayList<Integer> createPeaks(int[] A) {
        ArrayList<Integer> peaks = new ArrayList<Integer>();
        for (int i = 1; i < A.length-1; i++)
            if (A[i] > A[i-1] && A[i] > A[i+1])
                peaks.add(i);
        return peaks;
    }

    public static int flags(int[] A) {
        int N = A.length;
        int[] next = nextPeak(A);
        int i = 1;
        int result = 0;
        while ((i-1)*i <= N) {
            int pos = 0;
            int num = 0;
            while (pos < N && num < i) {
                pos = next[pos];
                if (pos == -1)
                    break;
                num += 1;
                pos += i;
            }
            result = Math.max(result, num);
            i++;
        }
        return result;
    }


}
