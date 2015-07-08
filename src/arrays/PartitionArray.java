package arrays;

public class PartitionArray {

    public int[] partitionArray(int[] a, int m) {
        int i = 0;
        int j = a.length - 1;
        int pivot = a[m];
        while (i < j) {

            while (a[i] < pivot)
                i++;
            while (a[j] > pivot)
                j--;
            if(i<j)
                swap(a,i,j);
        }
        return a;
    }
    
    public void swap(int[] a,int i,int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
