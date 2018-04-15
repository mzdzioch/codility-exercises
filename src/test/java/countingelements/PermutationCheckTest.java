package countingelements;

import org.junit.Assert;
import org.junit.Test;

public class PermutationCheckTest {

    @Test
    public void shouldReturnOneIfArrayIsPermutation(){

        PermutationCheck pm = new PermutationCheck();

        int[] a = {4, 1, 3, 2};
        int[] b = {1, 5, 2, 3, 4};
        int[] c = {1, 2, 3};

        Assert.assertTrue(pm.solution(a) == (1));
        Assert.assertTrue(pm.solution(b) == (1));
        Assert.assertTrue(pm.solution(c) == (1));

    }


    @Test
    public void shouldReturnOneIfArrayIsNotPermutation(){

        PermutationCheck pm = new PermutationCheck();

        int[] a = {4, 1, 2};
        int[] b = {1, 5, 3, 4};
        int[] c = {1, 3};

        Assert.assertTrue(pm.solution(a) == (0));
        Assert.assertTrue(pm.solution(b) == (0));
        Assert.assertTrue(pm.solution(c) == (0));

    }
}
