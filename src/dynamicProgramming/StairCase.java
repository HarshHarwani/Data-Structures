package dynamicProgramming;

public class StairCase {
    
    public static int CountWays(int n){
    	if(n<0)
    		return 0;
    	if(n==0)
            return 1;
        else
            return CountWays(n-1)+CountWays(n-2)+CountWays(n-3);
    }

    public static void main(String[] args) {
		System.out.println(CountWays(3));
	}
}
