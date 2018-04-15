package stacksandqueues;

import org.junit.Assert;
import org.junit.Test;

public class FishTest {

    @Test
    public void shouldReturnNUmberOfAliveFish(){
        int[] A = {4, 3 ,2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};

        Fish fish = new Fish();

        Assert.assertTrue(fish.solution(A, B) == 2);
    }
}
