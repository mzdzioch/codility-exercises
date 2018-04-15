package maximumsliceproblemtest;

import maximumsliceproblem.MinPerimeterRectangle;
import org.junit.Assert;
import org.junit.Test;

public class MinPerimeterRectangleTest {

    @Test
    public void shouldReturnMinPerimeterRectangle(){
        MinPerimeterRectangle minPerimeterRectangle = new MinPerimeterRectangle();

        int N = 24;
        int A = 9;


        Assert.assertTrue(minPerimeterRectangle.solution(N) == 20);
        Assert.assertTrue(minPerimeterRectangle.solution(A) == 12);


    }

}
