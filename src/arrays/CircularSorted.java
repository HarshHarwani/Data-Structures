package arrays;


//find an element in a circular sorted Array
public class CircularSorted {

    public int searchCircularSorted(int[] a, int x, int low, int high) {
        int mid = low + (high - low) / 2;
        if (a[mid] == x)
            return mid;
        if (high < low)
            return -1;
        if (a[low] <= a[mid]) { // left segment is sorted
            if (x >= a[low] && x < a[mid]) {
                return searchCircularSorted(a, x, low, mid - 1); // search left
            } else {
                return searchCircularSorted(a, x, mid + 1, high); // search
                                                                  // right
            }
        } else if (a[mid] <= a[high]) { //right segment is sorted
            if (x > a[mid] && x <= a[high]) {
                return searchCircularSorted(a, x, mid + 1, high); // search
                                                                  // right
            } else {
                return searchCircularSorted(a, x, low, mid - 1); // search left
            }
        } else if (a[low] == a[mid]) {
            if (a[high] != a[mid])
                return searchCircularSorted(a, x, mid + 1, high);// search right
            else {
                int result = searchCircularSorted(a, x, low, mid - 1); // search
                                                                       // left
                if (result == -1) {
                    return searchCircularSorted(a, x, mid + 1, high);
                }
            }
        }
        return -1;
    }
}
