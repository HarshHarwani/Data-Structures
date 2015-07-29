package dynamicProgramming;

public class StairCase {
    
    public int CountWays(int n){
        if(n==1 || n==0)
            return 1;
        else
            return CountWays(n-1)+CountWays(n-2)+CountWays(n-3);
    }

}
