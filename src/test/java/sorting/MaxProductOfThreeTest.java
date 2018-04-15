package sorting;

import org.junit.Assert;
import org.junit.Test;

public class MaxProductOfThreeTest {

    @Test
    public void shouldReturnTrueIfFindMaxProduct(){
        MaxProductOfThree maxP = new MaxProductOfThree();

        int[] A = {-3, 1, 2, -2, 5, 6};


        Assert.assertTrue(maxP.solution(A, A.length) == 60);
    }
}
