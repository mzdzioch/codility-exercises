package leader;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class DominatorTest {

    @Test
    public void shouldReturnTrueIf(){

        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        int[] B = {3, 2, 3, -1, 3, 3};
        int[] C = {3, 4, 0, 2, 3, -1, 3, 3};

        Dominator dominator = new Dominator();

        Assert.assertTrue(dominator.solution(A) == 4);
        Assert.assertTrue(dominator.solution(B) == 3);
        Assert.assertTrue(dominator.solution(C) == -1);


    }
}
