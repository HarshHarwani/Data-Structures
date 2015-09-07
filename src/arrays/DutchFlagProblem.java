package arrays;

import java.util.Arrays;

/**
 * 
 * @author hharwani
 *
 *         Given an array A[] consisting 0s, 1s and 2s, write a function that
 *         sorts A[]. The functions should put all 0s first, then all 1s and all
 *         2s in last.
 * 
 *         Example Input = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}; Output = {0, 0,
 *         0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
 */
public class DutchFlagProblem {

    public static int[] dutchFlag(int[] a) {
        int length = a.length;
        int low = 0;
        int mid = 0;
        int high = length - 1;
        while (mid <= high) {
            switch (a[mid]) {
            case 0:
                swap(a, low, mid);
                low++;
                mid++;
                break;
            case 1:
                mid++;
                break;
            case 2:
                swap(a, mid, high);
                high--;
                break;
            default:
                break;
            }
        }
        return a;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String args[]) {
        int[] a = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int[] o = DutchFlagProblem.dutchFlag(a);
        System.out.println(Arrays.toString(o));
    }
}
