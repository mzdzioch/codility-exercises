package primeandcomposite;

import org.junit.Test;

public class PeaksTest {

    @Test
    public void shouldReturnNumberOfBlocks(){
        Peaks peaks = new Peaks();

        int[] A = {1,2,3,4,3,4,1,2,3,4,6,2};

        System.out.println(peaks.solution(A));
    }
}
