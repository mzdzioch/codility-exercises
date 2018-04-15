package maximumsliceproblemtest;

import maximumsliceproblem.MaxDoubleSliceSum;
import org.junit.Assert;
import org.junit.Test;

public class MaxDoubleSliceSumTest {

    @Test
    public void shouldReturnMaxDoubleSlice(){
        int[] A = {3, 2, 6, -1, 4, 5, -1, 2};
        int[] B = {1, 1, 0, 10, -100, 10, 0};

        MaxDoubleSliceSum maxDoubleSliceSum = new MaxDoubleSliceSum();

        System.out.println(maxDoubleSliceSum.solution(A));
        System.out.println(maxDoubleSliceSum.solution(B));

        Assert.assertTrue(maxDoubleSliceSum.solution(A) == 17);
    }
}
