package dynamicProgramming;

import java.util.Arrays;

public class MinJump {
    
    public int jump(int[] A) {
        if (A.length < 2) {
            return 0;
        }
        final int[] memo = new int[A.length];
        Arrays.fill(memo, -1);
        return jump(A, 0,memo);
    }

    private int jump(int[] A, int index,int[] memo) {
        if (index >= A.length - 1) {
            return 0;
        }
        if (memo[index] != -1) {
            return memo[index];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= A[index]; i++) {
            min = Math.min(min, 1 + jump(A, index + i,memo));
        }
        memo[index]=min;
        return min;
    }
}
