package stacksandqueues;

import org.junit.Assert;
import org.junit.Test;

public class StoneWallTest {

    @Test
    public void shouldReturnTrueIfReturnMinimalNumberOfStone(){
        int[] A = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        int[] B = {8, 8, 5, 7, 9, 8, 7, 8, 8};
        int[] C = {8, 8, 5, 7, 9, 8, 7, 5, 8};


        StoneWall sw = new StoneWall();
        System.out.println(sw.solution(A));

        Assert.assertTrue(sw.solution(A) == 7);
        Assert.assertTrue(sw.solution(B) == 6);
        Assert.assertTrue(sw.solution(C) == 6);

    }
}
