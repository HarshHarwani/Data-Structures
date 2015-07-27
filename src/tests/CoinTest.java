package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import dynamicProgramming.CoinChanging;

public class CoinTest {

    @Test
    public void test() {
        final int[] coins = new int[]{1, 5, 10, 25};
        final int target = 46;
        CoinChanging cc=new CoinChanging(coins, target);
        int result=cc.getCoinChange();
        assertEquals(4, result);
    }
    
    @Test
    public void testSlow() {
        final int[] coins = new int[]{1, 3, 4};
        final int target = 40;
        CoinChanging cc=new CoinChanging(coins, target);
        int result=cc.getCoinChange();
        assertEquals(10, result);
    }

}
