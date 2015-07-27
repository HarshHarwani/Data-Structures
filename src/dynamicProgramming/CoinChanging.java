package dynamicProgramming;

public class CoinChanging {
    
    public int[] coins;
    public int[] memo;
    public int sum;
    
    public CoinChanging(int[] coins,int sum){
        this.coins=coins;
        this.sum=sum;
        memo=new int[sum+1];
        for(int i=0;i<=sum;i++){
            memo[i]=-1;
        }
        memo[0]=0;
        
    }
    
    
    public int  getCoinChange(){
        return getCoinChange(this.sum);
        
    }


    private int getCoinChange(int sum) {
        if(memo[sum]!=-1){
            return memo[sum];
        }
        int result=Integer.MAX_VALUE;
        for(int coin:coins){
            if(coin<=sum){
                result=Math.min(result, getCoinChange(sum-coin)+1);
            }
        }
        memo[sum]=result;
        return result;
    }

}
