package countingelements;

import org.junit.Assert;
import org.junit.Test;

public class MissingIntegerTest {

    @Test
    public void shouldReturnTrueIfIntegerIsFive(){
        MisssingInteger misssingInteger = new MisssingInteger();

        int[] A = {1, 3, 6, 4, 1, 2};

        System.out.println(misssingInteger.solution(A));

        Assert.assertTrue(misssingInteger.solution(A) == 5);
    }

    @Test
    public void shouldReturnTrueIfIntegerIsFive2(){
        MisssingInteger misssingInteger = new MisssingInteger();

        int[] A = {0, 1, 3, 6, 4, 2};

        System.out.println(misssingInteger.solution(A));

        Assert.assertTrue(misssingInteger.solution(A) == 5);
    }

    @Test
    public void shouldReturnTrueIfReturnIntegerFour(){
        MisssingInteger misssingInteger = new MisssingInteger();

        int[] A = {1, 2, 3};

        Assert.assertTrue(misssingInteger.solution(A) == 4);
    }

    @Test
    public void shouldReturnTrueIfReturnIntegerOne(){
        MisssingInteger misssingInteger = new MisssingInteger();

        int[] A = {-1, -3};

        Assert.assertTrue(misssingInteger.solution(A) == 1);
    }





}
