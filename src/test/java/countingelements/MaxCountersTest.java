package countingelements;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class MaxCountersTest {

    @Test
    public void shouldReturnArrayofResult(){

        MaxCounters maxCounters = new MaxCounters();

        int[] A = {3,4,4,6,1,4,4};
        int[] expectedResult = {3,2,2,4,2};

       int[] result = maxCounters.solution(5, A);

        for (int i = 0; i < result.length; i++) {
            Assert.assertEquals(expectedResult[i], result[i]);
        }

    }
}
