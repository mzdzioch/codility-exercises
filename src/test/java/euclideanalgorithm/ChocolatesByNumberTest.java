package euclideanalgorithm;

import org.junit.Assert;
import org.junit.Test;

public class ChocolatesByNumberTest {

    @Test
    public void shouldReturnNumberOfEatenChocolateBars(){
        ChocolatesByNumber chocolates = new ChocolatesByNumber();
        System.out.println(chocolates.solution(10, 4));

        Assert.assertTrue(chocolates.solution(10, 4) == 5);

    }
}
