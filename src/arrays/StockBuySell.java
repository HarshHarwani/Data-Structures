package arrays;

//Stock Buy Sell to Maximize Profit
public class StockBuySell {

    public static void calculateBuySellPairs(int[] a) {
        int n = a.length;
        if (n == 1)
            return;
        Solution[] interval = new Solution[(a.length / 2) + 1];
        int i = 0;
        int count = 0;
        while (i < n - 1) {
            // Find local minima
            while (i < n - 1 && a[i + 1] <= a[i])
                i++;
            if (i == n - 1)
                break;
            // update buying pair
            interval[count] = new Solution();
            interval[count].buy = i++;
            // find local maxima
            while (i < n && a[i] >= a[i - 1])
                i++;
            interval[count].sell = i - 1;
            count++;
        }
        for (int k = 0; k < count; k++) {
            System.out.println("Buy on " + interval[k].buy + " "
                    + " Sell on " + interval[k].sell);
        }
    }

    public static void calculateBuySellPairs1(int[] a) {
        int n = a.length;
        if (n == 0 || n == 1)
            return;
        int max_difference = a[1] - a[0];
        int minimum = a[0];
        int buy = 0, sell = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] - minimum > max_difference) {
                max_difference = a[i] - minimum;
                sell = i;
            }
            if (a[i] < minimum) {
                minimum = a[i];
                buy = i;
            }
        }
        System.out
                .println("Buy on " + buy + " " + " Sell on " + sell);
    }

    public static void main(String[] args) {
        int[] price = { 100, 180, 260, 310, 40, 535, 695 };
        calculateBuySellPairs(price);
        calculateBuySellPairs1(price);
    }

}

class Solution {
    public int buy;
    public int sell;
}
