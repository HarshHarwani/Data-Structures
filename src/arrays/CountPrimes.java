package arrays;

import linkedList.cleanData;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 * 
 * @author HarshHarwani
 *
 */
public class CountPrimes {

	public static int countPrimes(int n) {
		boolean[] primes = new boolean[n + 1];
		for (int i = 2; i <= n; i++) {
			primes[i] = true;
		}
		for (int i = 2; i * i <= n; i++) {
			if (primes[i]) {
				for (int j = i; j * i <= n; j++) {
					primes[i*j] = false;
				}
			}
		}
		int prime = 0;
		for (int i = 0; i < primes.length; i++) {
			if (primes[i])
				prime++;
		}
		return prime;
	}
	
	public static void main(String[] args) {
		System.out.println(countPrimes(10));
	}
}
