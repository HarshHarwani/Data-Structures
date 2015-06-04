package arrays;


//Find number of ways to select k numbers from 1 to N that add to N.
//suppose n is 6 and k=3 then 1 2 3 4 5 6 there is only one pair 1 2 3 which forms 6.
//suppose n is 6 and k=2 then there are two pairs 5 1 and 4 2.

public class NoOfWays {
	
	static int N;
	static int count=0;
	
	//k is the index of the element in one to N.
	//n is the actual number N
	//r is the number of numbers in pairs
	public void CountNoOfWays(int k,int n,int r){
			
		if(n<0){
			System.out.println("Sum got less than zero");
			return;
		}
		if(n==0 && r!=0){
			System.out.println("Sum got zero, but no of pairs didnt satisfy");
			return;
		}
		if(k==N && n!=0){
			System.out.println("currently choosen k is"+String.valueOf(k));
			System.out.println("No solution for this choice");
			return;
		}
		if(n==0 && r==0){
			count++;
			System.out.println("got one solution");
			return;
		}
		if(r<=0){
			System.out.println("The number of pairs exhausted but sum is not yet zero");
		}
		CountNoOfWays(k+1, n, r);
		CountNoOfWays(k+1, n-k, r-1);
	}
	
}
