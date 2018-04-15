package maximumsliceproblem;

public class MinPerimeterRectangle {

    public int solution(int N){
        int perimeter = N*N, a = 0, b = 0;

        for (int i = 1; i*i <= N; i++) {
            if(N%i == 0)
                perimeter = (perimeter > (2*i + 2*(N/i))) ? (2*i + 2*(N/i)) : perimeter;
        }

        return perimeter;
    }
}
