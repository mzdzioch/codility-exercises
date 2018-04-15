package prefixsum;

import org.junit.Assert;
import org.junit.Test;
import prefixsum.CountDiv;

public class CountDivTest {

    @Test
    public void shouldReturnTrueIfFindNumbersDividedByK(){

        CountDiv cd = new CountDiv();


        Assert.assertTrue(cd.solution(5 ,11 , 2) == 3);
        Assert.assertTrue(cd.solution(13 ,20 , 3) == 2);
        Assert.assertTrue(cd.solution(30 ,50 , 9) == 2);
    }
}
