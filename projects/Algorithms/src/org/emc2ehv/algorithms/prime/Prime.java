package org.emc2ehv.algorithms.prime;

public class Prime {
	public static boolean isPrime(Integer number) {
		if(number<2) {
			return false;
		}
		for(int i = 2; i<=number/i; i++) {
			if(number%i==0) return false;
		}
		return true;
	}
}
