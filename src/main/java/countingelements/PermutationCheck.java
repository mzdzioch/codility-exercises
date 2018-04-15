package countingelements;

public class PermutationCheck {
    public int solution(int[] a) {

        int sumToValidate = 0, min = a[0], max = a[0], sum =0;


        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            if(a[i] < min) min = a[i];
            if(a[i] > max) max = a[i];
        }

        sumToValidate = (min + max) * a.length;

        if(((2 * sum) == sumToValidate)  && (a.length > 2)) return 1;

        return 0;
    }
}
