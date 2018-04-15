package countingelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MisssingInteger {


    public int solution(int[] A) {

        ArrayList<Integer> integerList = Arrays.stream(A)
                .boxed()
                .filter(i -> i > 0)
                .sorted()
                .distinct()
                .collect(
                        Collectors.toCollection(
                                ArrayList::new)
                );

        for (int i = 0; i < integerList.size(); i++) {
            if(integerList.get(i) > i + 1) //we start with at least 1 (0 is excluded)
                return i + 1;

        }

        return integerList.size() + 1;
    }
}
