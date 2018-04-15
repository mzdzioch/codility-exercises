package prefixsum;

import org.junit.Assert;
import org.junit.Test;

public class PassingCarsTest {

    @Test
    public void shouldReturnPairsOfCars(){

        int[] a = {0, 1, 0, 1, 1};
        int[] b = {0, 0, 0, 1, 1, 1};
        int[] c = {0, 1, 0, 1, 0, 1};
        int[] d = {0, 0, 0, 0, 0, 0};

        PassingCars pc = new PassingCars();

        Assert.assertTrue(pc.solution(a) == 5);
        Assert.assertTrue(pc.solution(b) == 9);
        Assert.assertTrue(pc.solution(c) == 6);
        Assert.assertTrue(pc.solution(d) == -1);

    }


}
