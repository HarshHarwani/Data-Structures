package linkedList;

public class CheckLLPalindrome<Item> {
	
	class Result{
	
		Result(LLNode<Item> node,boolean result){
			this.node=node;
			this.result=result;
		}
		public LLNode<Item> node;
		public boolean result;
	}
	
	public boolean checkPalindrome(LLNode<Item> head){
		Result result=checkPalindromeRecurse(head,LinkedList.getSize());
		return result.result;
	}
	
	public Result checkPalindromeRecurse(LLNode<Item> node,int size){
		return null;
	}

}
