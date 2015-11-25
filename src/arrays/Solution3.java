package arrays;

import java.util.*;

//getting the type of triangle based on the sides
public class Solution3 {
	public static void main(String args[]) throws Exception {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT
		 */
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int[] arr = new int[3];
			for (int j = 0; j < 3; j++) {
				arr[j] = scanner.nextInt();
			}
			int k = 0;
			if (arr[k] == arr[k + 1] && arr[k + 1] == arr[k + 2]) {
				System.out.println("Equilateral");
			} else if ((arr[k] == arr[k + 1] && arr[k + 1] != arr[k + 2])
					|| (arr[k + 1] == arr[k + 2] && arr[k] != arr[k + 1])) {
				System.out.println("Isoceles");
			} else {
				System.out.println("None of these");
			}
		}
		scanner.close();
	}
}