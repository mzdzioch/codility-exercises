package timecomplexity;

import countingelements.FrogRiverOne;
import org.junit.Assert;
import org.junit.Test;

public class FrogJmpTest {

    @Test
    public void shouldReturnMinNumberOfJumps(){

        FrogJmp frogJmp = new FrogJmp();

        Assert.assertEquals(frogJmp.solution(10, 85, 30), 3);
    }
}
