package strings;

public class AllCombinations {

    // as we have to generate all combinations of a string i considered it as
    // printing a combination of binary numbers
    public static char[] charArray;

    public AllCombinations(String s) {
        charArray = s.toCharArray();
    }

    public void getAllCombinations(int[] a, int k, int n) {
        if (k == n) {
            a[k] = 0;
            print(a, n);
            a[k] = 1;
            print(a, n);
            return;
        }
        a[k] = 0;
        getAllCombinations(a, k + 1, n);
        a[k] = 1;
        getAllCombinations(a, k + 1, n);
    }

    private void print(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (a[i] == 1) {
                System.out.print(charArray[i]);
                sum++;
            }
        }
        if (sum == 0) {
            System.out.println("null set");
        }
        System.out.println("");
    }

}
