package timecomplexity;

import org.junit.Assert;
import org.junit.Test;

public class TapeEquilibriumTest {

    @Test
    public void shouldReturnMinimalDifference(){
        int[] A = {3, 1, 2, 4, 3};

        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

        System.out.println(tapeEquilibrium.solution(A));

        Assert.assertTrue(tapeEquilibrium.solution(A) == 1);
    }
}
