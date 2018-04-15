package stacksandqueues;

import org.junit.Assert;
import org.junit.Test;

public class BracketsTest {

    @Test
    public void shouldReturnTrueIfStringIs(){

        String s = "{[()]}";
        String badString = "{[]()}";
        String goodString = "{[()]}";

        Brackets bracket = new Brackets();

        Assert.assertTrue(bracket.solution(s) == 1);
        Assert.assertTrue(bracket.solution(goodString) == 1);
        Assert.assertTrue(bracket.solution(badString) == 0);
    }

}
