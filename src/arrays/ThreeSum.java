package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(a);// nlogn
        for (int i = 0; i < a.length - 2; i++) { // n^2 total=nlogn+n^2 (better
            int j = i + 1;
            int k = a.length - 1;
            while (j < k) {
                int sum = a[i] + a[j] + a[k];
                if (sum == 0) {
                    List<Integer> ele = new ArrayList<>();
                    ele.add(a[i]);
                    ele.add(a[j]);
                    ele.add(a[k]);
                    triplets.add(ele);
                    j++;
                    k--;
                } else if (sum < 0)
                    j++;
                else
                    k--;
            }
        }
        return triplets;

    }

}
