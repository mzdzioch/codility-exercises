package caterpillar;

import org.junit.Assert;
import org.junit.Test;

public class CountDistinctSlicesTest {

    @Test
    public void shouldReturnNumberDistinctOfSlices(){
        CountDistinctSlices countDistinctSlices = new CountDistinctSlices();

        int[] A = {3, 4, 5, 5, 2};

        Assert.assertTrue(countDistinctSlices.solution(6, A) == 9);
    }
}
