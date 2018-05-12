package prefixsum;

import org.junit.Test;

public class GenomicRangeQueryTest {

    @Test
    public void shouldReturnArrayOfMinimalImpactFactor(){

        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        String s = "CAGCCTA";

        int[] expectedResult = {2, 4, 1};
        GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();
        int[] result = genomicRangeQuery.solution(s, P, Q);


    }
}
