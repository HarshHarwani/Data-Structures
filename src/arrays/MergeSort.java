package arrays;

public class MergeSort {

    public MergeSort() {
    }

    public void sort(int[] a, int[] aux, int low, int high) {
        if (high <= low)
            return;
        int mid = low + (high - low) / 2;
        sort(a, aux, low, mid);
        sort(a, aux, mid + 1, high);
        merge(a, aux, low, mid, high);
    }

    public void sort(int[] a) {
        int[] aux = new int[a.length];
        sort(a, aux, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public void merge(int[] a, int[] aux, int low, int mid, int high) {
        assert(isSorted(a, low, mid));
        assert(isSorted(a, mid + 1, high));

        for (int k = low; k <= high; k++) {
            aux[k] = a[k];
        }
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid)
                a[k] = aux[j++];
            else if (j > high)
                a[k] = aux[i++];
            else if (aux[j] < aux[i])
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
        }

    }

    private static boolean isSorted(int[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++) {
            if (a[i] < a[i - 1])
                return false;
        }
        return true;
    }
    
  
}
