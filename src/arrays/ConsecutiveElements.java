package arrays;

//Check if array elements are consecutive
public class ConsecutiveElements {

    public boolean isConsecutiveElements(int[] a, int n) {
        if (n < 1)
            return false;
        int max = getMax(a);
        int min = getMin(a);
        if (max - min + 1 == n) {
            boolean[] visited = new boolean[a.length];
            for (int i = 0; i < a.length; i++) {
                if (visited[a[i] - min] == true)
                    return false;
                else
                    visited[a[i] - min] = true;

            }
            return true;
        } else {
            return false;
        }

    }

    public int getMax(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public int getMin(int[] a) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
}
