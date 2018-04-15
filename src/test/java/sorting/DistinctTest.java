package sorting;

import javafx.scene.shape.ClosePathBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class DistinctTest {

    @Test
    public void shouldReturnTrueIf(){

        Distinct d = new Distinct();

        int[] A = {2, 1, 1, 2, 3, 1};
        int[] B = {3, 2, 2, 2, 2};
        int[] C = {2, 1, 4, 4, 6, 1, 2, 3, 1};

        Assert.assertTrue(d.solution(A) == 3);
        Assert.assertTrue(d.solution(B) == 2);
        Assert.assertTrue(d.solution(C) == 5);

    }

}
