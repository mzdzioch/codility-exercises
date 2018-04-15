package stacksandqueues;

import java.util.*;

public class Nesting {

    public int solution(String S){

        Queue<Integer> queue = new LinkedList<Integer>();
        String[] array = S.split("");

        for (int i = 0; i < array.length; i++) {

            if(array[i].equals("("))
                queue.add(1);
            else if(array[i].equals(")")){
                if(queue.isEmpty())
                    return 0;
                queue.poll();
            }
                }

        if(queue.isEmpty())
            return 1;
        return 0;
    }

}
