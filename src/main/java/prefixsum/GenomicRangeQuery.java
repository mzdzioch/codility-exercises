package prefixsum;

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q){
        int length = P.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = findMinmalFactor(S, P[i], Q[i]);

        }

        return result;
    }

    private int findMinmalFactor(String s, int a, int b) {

        char[] chars = s.toCharArray();
        int min = 0;

        for (int i = a; i <= b; i++) {
            min = Math.min(min, getFactor(chars[i]));
        }

        return min;
    }

    public int getFactor(char a){
        switch (a){
            case 'A': return 1;
            case 'C': return 2;
            case 'G': return 3;
            case 'T': return 4;
            default: return -1;
        }
    }


}
