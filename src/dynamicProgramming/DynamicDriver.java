package dynamicProgramming;
public class DynamicDriver {

    public static void main(String[] args) {
        FibonacciNumbers fNumbers=new FibonacciNumbers();
        long startTime = System.currentTimeMillis();
        System.out.println(fNumbers.fib(45));
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("The running time is-->"+(elapsedTime/1000)+"seconds");
        long startTime1 = System.currentTimeMillis();
        System.out.println(fNumbers.fibDp(45));
        long stopTime1 = System.currentTimeMillis();
        long elapsedTime1 = stopTime1 - startTime1;
        System.out.println("The running time is after dp is-->"+(elapsedTime1/1000)+"seconds");
        final int[] coins = new int[]{1, 5, 10, 25};
        final int target = 46;
        CoinChanging cc=new CoinChanging(coins, target);
        System.out.println(cc.getCoinChange());
        
    }

}
