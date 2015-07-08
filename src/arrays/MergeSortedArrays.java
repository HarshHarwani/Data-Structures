package arrays;

public class MergeSortedArrays {

    public int[] mergeSortedArrays(int[] a, int[] b) {
        if (a.length == 0) {
            return b;
        } else if (b.length == 0) {
            return a;
        } else {
            int[] c = new int[a.length + b.length];
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < a.length && j < b.length) {
                if (a[i] < b[j]) {
                    c[k] = a[i];
                    i++;
                    k++;
                } else if (b[j] < a[i]) {
                    c[k] = b[j];
                    k++;
                    j++;
                }
            }
            while (i < a.length) {
                c[k] = a[i];
                i++;
                k++;
            }
            while (j < b.length) {
                c[k] = b[j];
                j++;
                k++;
            }
            return c;
        }
    }

}
