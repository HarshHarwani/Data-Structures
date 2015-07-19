package arrays;

//How many times is a sorted array rotated?
public class FindRotationCount {

    public int getRotationcount(int[] a) {
        int low = 0;
        int high = a.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int next = (mid + 1) % a.length;
            int prev = (mid + a.length - 1) % a.length;
            if (a[low] < a[high]) { // case 1 where the entire array is already
                // sorted
                return low;
            }
            else if (a[mid] <= a[next] && a[mid] <= a[prev]) { // case 2 where mid is the
                                                    // minimum element
                return mid;
            } else if (a[low] <= a[mid]) { // case 3 the left segment is rotated
                                           // we know if its sorted the minimum
                                           // element will not
                // be in this segment
                low = mid + 1;
            } else if (a[mid] <= a[high]) { // case 4 the right segment is
                                            // rotated we know if its sorted the
                                            // minimum element will not
                // be in this segment
                high = mid - 1;
            }
        }
        return -1;
    }
}
