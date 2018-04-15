package sieveoferatosthenes;

import org.junit.Assert;
import org.junit.Test;

public class CountSemiprimesTest {

    @Test
    public void shouldReturnTrueIfPositive(){

        CountSemiprimes countSemiprimes = new CountSemiprimes();
        int[] P = {1, 4, 16};
        int[] Q = {26, 10, 20};
        int[] result = {10, 4, 0};
        int N = 26;

        for (int i = 0; i < result.length; i++) {
            System.out.println(countSemiprimes.solution(N, P, Q)[i]);

        }

        //Assert.assertEquals(countSemiprimes.solution(N, P, Q), result);
    }
}
