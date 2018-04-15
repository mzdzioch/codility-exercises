package prefixsum;

public class PassingCars {

    public int solution(int[] A){

        final int EAST = 0;
        final int WEST = 1;

        int carEast = 0;
        int pairCars = 0;

        for (int i = 0; i < A.length; i++) {
            if(A[i] == EAST) {
                carEast++;

            } else if(A[i] == WEST){
                pairCars += carEast;
            }
        }

        if(pairCars > 0) return pairCars;

        return -1;
    }
}
