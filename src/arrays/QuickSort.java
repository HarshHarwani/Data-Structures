package arrays;

public class QuickSort {

    public int[] sort(int[] a, int low, int high) {
        if(high<=low)
            return a;
        int j = partition(a, low, high);
        sort(a, low, j - 1);
        sort(a, j + 1, high);
        return a;
    }

    private int partition(int[] a, int low, int high) {
        int i = low;
        int j = high + 1;
        int pivot = a[low];
        while (true) {
            while (a[++i] < pivot){
                if (i == high)
                    break;
            }
            while (pivot < a[--j]){
                if(j==low)
                    break;
            }
           if (i >= j)
               break;
           swap(a, i, j);
        }
        swap(a, low, j);
        return j;
    }

    private void swap(int[] a, int low, int high) {
        int temp = a[low];
        a[low] = a[high];
        a[high] = temp;
    }

}
