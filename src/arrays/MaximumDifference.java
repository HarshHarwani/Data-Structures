package arrays;

//Maximum difference between two elements such that larger element appears after the smaller number
//If array is [2, 3, 10, 6, 4, 8, 1] then returned value should be 8 (Diff between 10 and 2). If array is [ 7, 9, 5, 6, 3, 2 ]
//then returned value should be 2 (Diff between 7 and 9)
public class MaximumDifference {

    public static int getMaxDifference(int[] a) {
        int maxDifference = a[1] - a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] - min > maxDifference) {
                maxDifference = a[i] - min;
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        return maxDifference;
    }

    public static void main(String args[]) {
        int[] a = { 7, 9, 5, 6, 3, 2 };
        int max = getMaxDifference(a);
        System.out.println(max);
    }
}
