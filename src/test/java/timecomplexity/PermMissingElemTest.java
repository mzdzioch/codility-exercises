package timecomplexity;

import org.junit.Assert;
import org.junit.Test;

public class PermMissingElemTest {

    @Test
    public void shouldReturnMissingElement(){
        PermMissingElem permMissingElem = new PermMissingElem();

        int[] A = {2, 3, 1, 5};

        Assert.assertTrue(permMissingElem.solution(A) == 4);
    }
}
