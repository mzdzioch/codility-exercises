package stacksandqueues;

import org.junit.Assert;
import org.junit.Test;

public class NestingTest {

    @Test
    public void shouldReturnTrueIfStringIsNested(){

        String s = "(()(())())";
        String a = "(()()(())())";
        String b = "())";
        Nesting nesting = new Nesting();

        System.out.println(nesting.solution(b));


        Assert.assertTrue(nesting.solution(s) == 1);
        Assert.assertTrue(nesting.solution(a) == 1);
        Assert.assertTrue(nesting.solution(b) == 0);

    }
}
