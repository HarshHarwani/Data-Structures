package arrays;

import java.util.*;

public class WindowSum {

	public static void main(String[] args) {
		Integer[] arr = { 4, 2, 73, 11, -5 };
		ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(arr));

		ArrayList<Integer> result = calculateWindowSum(arrList, 2);
		System.out.println(result.toString());
	}

	private static ArrayList<Integer> calculateWindowSum(ArrayList<Integer> arrList, int w) {

		if (w == 1)
			return arrList;

		ArrayList<Integer> result = new ArrayList<>();

		int currentSum = 0;
		for (int i = 0; i < w && i < arrList.size(); i++) {
			currentSum = currentSum + arrList.get(i);
		}
		result.add(currentSum);
		for (int i = w; i < arrList.size(); i++) {
			currentSum = currentSum - arrList.get(i - w);
			currentSum = currentSum + arrList.get(i);
			result.add(currentSum);
		}
		return result;
	}
}
