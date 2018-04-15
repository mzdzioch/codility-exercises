package sorting;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void shouldReturnTrueIfFindTriangle(){
        Triangle triangle = new Triangle();

        int[] a = {10, 2, 5, 1, 8, 20};


        Assert.assertTrue(triangle.solution(a, 6) == 1);
    }

    @Test
    public void shouldReturnTrueIfNotFindTriangle(){
        Triangle triangle = new Triangle();

        int[] a = {10, 50, 5, 1};

        Assert.assertTrue(triangle.solution(a, 4) == 0);
    }
}
