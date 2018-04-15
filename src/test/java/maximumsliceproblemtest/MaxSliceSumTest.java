package maximumsliceproblemtest;

import maximumsliceproblem.MaxSliceSum;
import org.junit.Assert;
import org.junit.Test;

public class MaxSliceSumTest {

    @Test
    public void shouldReturnMaximumSliceOfAnySum(){

        MaxSliceSum maxSliceSum = new MaxSliceSum();

        int[] A = {3, 2, -6, 4, 0};
        int[] B = {3, 2, -3, 4, 0};

        System.out.println(maxSliceSum.solution(A));
        System.out.println(maxSliceSum.solution(B));


        Assert.assertTrue(maxSliceSum.solution(A) == 5);
        Assert.assertTrue(maxSliceSum.solution(A) == 6);

    }
}
