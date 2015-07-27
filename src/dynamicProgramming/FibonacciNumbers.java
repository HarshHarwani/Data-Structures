package dynamicProgramming;

public class FibonacciNumbers {
    
    public int fib(int n){
        if(n==0)
            return 0;
        else if (n==1)
            return 1;
        else{
            int result=fib(n-1)+fib(n-2);
            return result;
        }
    }
    
    public int fibDp(int n){
        int[] fib=new int[n+1];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n];
    }

}
