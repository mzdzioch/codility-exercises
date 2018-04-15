package primeandcomposite;

import org.junit.Assert;
import org.junit.Test;

public class CountFactorsTest {
    @Test
    public void shouldReturnNumberOfFactors2(){

        CountFactors countFactors = new CountFactors();

        System.out.println(countFactors.solution2(9));
        System.out.println(countFactors.solution2(12));
        System.out.println(countFactors.solution2(20));

        Assert.assertTrue(countFactors.solution(9) == 3);

    }


//    @Test
//    public void shouldReturnNumberOfFactors(){
//
//        CountFactors countFactors = new CountFactors();
//
//        System.out.println(countFactors.solution(9));
//        System.out.println(countFactors.solution(12));
//        System.out.println(countFactors.solution(20));
//
//        Assert.assertTrue(countFactors.solution(9) == 3);
//
//    }


}
