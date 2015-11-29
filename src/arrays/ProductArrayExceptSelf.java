package arrays;

import java.util.Arrays;

public class ProductArrayExceptSelf {

	public static int[] getProductArray(int[] nums) {
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];
		left[0] = 1;
		right[nums.length - 1] = 1;
		for (int i = 1; i < nums.length; i++) {
			left[i] = left[i - 1] * nums[i - 1];
		}
		for (int j = nums.length - 2; j >= 0; j--) {
			right[j] = right[j + 1] * nums[j + 1];
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = left[i] * right[i];
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		nums = getProductArray(nums);
		System.out.println(Arrays.toString(nums));
	}

}
