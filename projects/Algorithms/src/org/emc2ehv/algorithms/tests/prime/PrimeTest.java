package org.emc2ehv.algorithms.tests.prime;

import org.emc2ehv.algorithms.prime.Prime;
import org.junit.Assert;
import org.junit.Test;

public class PrimeTest {
	
	@Test
	public void verifyIsPrime() {
		Assert.assertFalse(Prime.isPrime(1));
		Assert.assertFalse(Prime.isPrime(4));
		Assert.assertFalse(Prime.isPrime(9));
		Assert.assertFalse(Prime.isPrime(12));
		Assert.assertFalse(Prime.isPrime(111));
		Assert.assertTrue(Prime.isPrime(2));
		Assert.assertTrue(Prime.isPrime(5));
		Assert.assertTrue(Prime.isPrime(7));
		Assert.assertTrue(Prime.isPrime(611953));
		Assert.assertTrue(Prime.isPrime(104729));
	}
}
