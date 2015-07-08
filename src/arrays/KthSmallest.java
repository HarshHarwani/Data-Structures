package arrays;

public class KthSmallest {
    
    public int kthsmallest(int[] a,int k){
        
        if(k<0 || k>a.length){
            throw new java.lang.IndexOutOfBoundsException("invalid Index");
        } else {
            int low=0;
            int high=a.length-1;
            while(high>low){
                int p=partition(a, low, high);
                if(p>k)
                    high=p-1;
                else if(p<k)
                    low=p+1;
                else
                    return a[p];
            }
            return a[low];
        }
        
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
            while (pivot < a[--j]);
                if(j==low)
                    break;
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
