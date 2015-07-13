package arrays;

public class PrintSpiral {

    public void printSpiralOrder(int[][] a) {
        int rows = a.length;
        int columns = rows;
        int dir = 0;
        int t = 0, b = rows - 1, l = 0, r = columns - 1;
        while (l <= r && t <= b) {
            if (dir == 0) {
                for (int i = l; i <= r; i++)
                    System.out.print(a[t][i] + " ");
                t++;
            } else if (dir == 1) {
                for (int i = t; i <= b; i++)
                    System.out.print(a[i][r] + " ");
                r--;
            } else if (dir == 2) {
                for (int i = r; i >= l; i--)
                    System.out.print(a[b][i] + " ");
                b--;
            } else if (dir == 3) {
                for (int i = b; i >= t; i--)
                    System.out.print(a[i][l] + " ");
                l++;
            }
            System.out.println("\n");
            dir = (dir + 1) % a.length;
        }
    }

}
