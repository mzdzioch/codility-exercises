package countingelements;

import org.junit.Assert;
import org.junit.Test;

public class FrogRiverOneTest {

    @Test
    public void shouldReturnTrueIfFrogCanCrossRiver5(){
        int A[] = {1, 3, 1, 4, 2, 3, 5, 4};
        int positionsX = 5;
        int N = 0;

        FrogRiverOne frogRiverOne  = new FrogRiverOne();

        Assert.assertTrue(frogRiverOne.solution(positionsX, A, N) == 6);
    }

    @Test
    public void shouldReturnFalseIfFrogCannotCrossRiver(){
        int A[] = {1, 3, 1, 4, 1, 3, 5, 4};
        int positionsX = 5;
        int N = 0;

        FrogRiverOne frogRiverOne  = new FrogRiverOne();

        Assert.assertTrue(frogRiverOne.solution(positionsX, A, N) == -1);
    }

    @Test
    public void shouldReturnTrueIfFrogCanCrossRiver7(){
        int A[] = {1, 3, 1, 4, 2, 3, 4, 5, 6, 2, 1};
        int positionsX = 5;
        int N = 0;

        FrogRiverOne frogRiverOne  = new FrogRiverOne();

        Assert.assertTrue(frogRiverOne.solution(positionsX, A, N) == 7);
    }
}
