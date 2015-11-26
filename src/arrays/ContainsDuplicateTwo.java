package arrays;

import java.util.*;

public class ContainsDuplicateTwo {

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int index = map.get(nums[i]);
				if (i - index <= k)
					return true;
			}
			map.put(nums[i], i);
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 1, 2 };
		System.out.println(containsNearbyDuplicate(nums, 3));
	}

}
