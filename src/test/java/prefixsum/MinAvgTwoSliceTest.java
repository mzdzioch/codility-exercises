package prefixsum;

import org.junit.Assert;
import org.junit.Test;

public class MinAvgTwoSliceTest {

    @Test
    public void shouldReturnTrueIfFindMinAvgNumSlice() {

        MinAvgTwoSlice mats = new MinAvgTwoSlice();
        int[] A = {5, 2, 2, 5, 1, 5, 8};


        Assert.assertTrue(mats.solution(A, 7) == 1);

    }

    @Test
    public void shouldReturnTrueIfFindMinAvgSlice() {

        MinAvgTwoSlice mats = new MinAvgTwoSlice();
        int[] A = {5, 4, 1, 1, 1, 1, 1};


        Assert.assertTrue(mats.solution(A, 7) == 2);

    }

}
