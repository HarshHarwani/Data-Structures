package arrays;


//find a given string in a string array which as interleaved blank strings.
public class FindSortedString {

    public int searchString(String[] s, String str, int low, int high) {
        while (low < high) {
            int mid = (low + high) / 2;
            if (s[mid].compareTo(str) == 0)
                return mid;
            if (s[mid].isEmpty()) {
                int left = mid - 1;
                int right = mid + 1;
                while (true) {
                    if (left < low && right > high)
                        return -1;
                    else if (!s[left].isEmpty()) {
                        mid = left;
                        break;
                    } else if (!s[right].isEmpty()) {
                        mid = right;
                        break;
                    }
                    left--;
                    right++;
                }
                if (str.compareTo(s[mid]) == 0) {
                    return mid;
                } else if (str.compareTo(s[mid]) < 0) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
