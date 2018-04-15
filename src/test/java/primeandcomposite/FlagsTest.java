package primeandcomposite;

import org.junit.Assert;
import org.junit.Test;

public class FlagsTest {

    @Test
    public void shouldReturnMaxNumberOfFlags(){
        Flags flags = new Flags();

        int[] A = {1,5,3,4,3,4,1,2,3,4,6,2};

        System.out.println(flags.solution(A));

        Assert.assertTrue(flags.solution(A) == 3);
    }


}
