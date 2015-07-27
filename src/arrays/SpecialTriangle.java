package arrays;

import java.util.Arrays;

public class SpecialTriangle {

    public void Triangle(int[] a) {
        if (a.length >= 1) {
            int[] temp = new int[a.length - 1];
            for (int i = 0; i < a.length - 1; i++) {
                int sum = a[i] + a[i + 1];
                temp[i] = sum;
            }
            Triangle(temp);
            System.out.println(Arrays.toString(a));
        }
    }

}
