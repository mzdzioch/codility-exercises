package stacksandqueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StoneWall {

    public int solution(int[] A){
        int stone = 0, tempHead = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        if(A.length == 0) {
            return 0;
        } else {
            stone++;
            stack.push(A[0]);
        }

        for (int i = 1; i < A.length; i++) {

            if(A[i-1] == A[i]){

            } else if(A[i-1] > A[i]) {

                while(tempHead != -1){
                    stack.pop();
                    tempHead = stack.peek();

                    if(A[i] == tempHead) {
                        tempHead = -1;
                    } else if(A[i] > tempHead) {
                        stone++;
                        stack.push(A[i]);
                        tempHead = -1;
                    }
                }
                tempHead = 0;

            } else if(A[i-1] < A[i]){
                stack.push(A[i]);
                stone++;
            }
        }

        return stone;
    }

}
