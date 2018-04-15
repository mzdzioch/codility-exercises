package stacksandqueues;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;
import java.util.stream.Collectors;

public class Brackets {

    public int solution(String s){

        //Queue<String> brackets = new LinkedList<String>(Arrays.asList(s.split("")));
        Deque<String> brackets = new ArrayDeque<String>(Arrays.asList(s.split("")));

        while(!brackets.isEmpty()){

            if(!isMatch(brackets.pollFirst(), brackets.pollLast()))
                return 0;
        }

        return 1;
    }


    public boolean isMatch(String a, String b){

        switch (a){
            case "{": return b.equals("}");
            case "(": return b.equals(")");
            case "[": return b.equals("]");
            default: return false;
        }


    }

    
}
