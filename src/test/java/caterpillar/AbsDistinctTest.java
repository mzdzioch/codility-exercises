package caterpillar;

import org.junit.Assert;
import org.junit.Test;

public class AbsDistinctTest {

    @Test
    public void shouldReturnCountNumberOfAbsoluteNumber(){
        AbsDistinct absDistinctTest = new AbsDistinct();
        int[] A = {-5, -3, -1, 0, 3, 6};

        Assert.assertTrue(absDistinctTest.solution(A) == 5);
    }
}
