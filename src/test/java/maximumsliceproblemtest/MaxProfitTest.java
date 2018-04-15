package maximumsliceproblemtest;

import maximumsliceproblem.MaxProfit;
import org.junit.Assert;
import org.junit.Test;

public class MaxProfitTest {

    @Test
    public void shouldReturnMaxProfit(){

        int[] A = {23171, 21011, 21123, 21366, 21013, 21367};

        MaxProfit maxProfit = new MaxProfit();

        System.out.println(maxProfit.solution(A));

        Assert.assertTrue(maxProfit.solution(A) == 356);


    }
}
