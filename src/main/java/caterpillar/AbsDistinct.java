package caterpillar;

import java.util.*;

public class AbsDistinct {

    public int solution(int[] A){

        return (int) Arrays.stream(A).map(p -> Math.abs(p)).distinct().count();

    }

    public int countAbst(int[] A){
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int i : A) {
         set.add(Math.abs(i));
        }

        return set.size();
    }
}
