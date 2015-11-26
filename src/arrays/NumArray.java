package arrays;

public class NumArray {
	
	int[] nums=null;
	int[] sums=null;
	public NumArray(int[] nums) {
		this.nums=nums;
		sums=new int[nums.length+1];
		makeSumArray();
	}

	public int sumRange(int i, int j) {
		return sums[j+1]-sums[i];

	}
	
	private void makeSumArray(){
		for(int i=0;i<nums.length;i++){
			sums[i+1]=sums[i]+nums[i];
		}
	}
}
