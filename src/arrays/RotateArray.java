package arrays;

import java.util.Arrays;

public class RotateArray {
	
	
	public static void rotateEff(int[] nums,int k){
		int order=k%nums.length;
		int a=nums.length-order;
		reverse(nums,0,a-1);
		reverse(nums,a,nums.length-1);
		reverse(nums,0,nums.length-1);
		System.out.println(Arrays.toString(nums));
	}
	
	private static void reverse(int[] nums, int i, int j) {
		if(nums==null || nums.length==1)
			return;
		while(i<j){
			int temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
			i++;
			j--;
		}
	}

	public static void rotate(int[] nums, int k) {
        for(int i=0;i<k;i++){
            rotateRightByOne(nums);
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    
    private static void rotateRightByOne(int[] nums){
    	for (int j = nums.length - 1; j > 0; j--) {
			int temp = nums[j];
			nums[j] = nums[j - 1];
			nums[j - 1] = temp;
		}
    }
    
    public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7};
		//rotate(a,3);
		rotateEff(a,3);
	}

}
