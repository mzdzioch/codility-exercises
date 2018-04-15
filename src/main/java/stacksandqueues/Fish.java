package stacksandqueues;

import java.util.Stack;

public class Fish {

    public int solution(int[] A, int[] B){

        Stack<Integer> stack = new Stack();
        stack.push(0);

        for (int i = 1; i < A.length - 1; i++) {

            if(B[stack.peek()] == 1 && B[i] == 0){
                if (A[stack.peek()] < A[i]){
                    stack.pop();
                    stack.push(i);
                }
            } else {
                stack.push(i);
            }
        }

        return stack.size();
    }
}
