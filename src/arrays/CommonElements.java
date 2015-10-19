package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElements {

    public static List<Integer> getIntersection(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<Integer>();
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                list.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        return list;
    }

    public static void main(String args[]) {
        int[] a = { 1, 3, 5, 7, 9 };
        int[] b = { 9, 3, 9, 4 };
        List<Integer> intersectionList = getIntersection(a, b);
        System.out.println(intersectionList.toString());
    }

}
