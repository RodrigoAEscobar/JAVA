/**
 * This class find the prime numbers up to an inputed integer. written by Duaa
 * Almubasher written in 5/28/2013
 */
public class PrimeGenerator {
	
	public void nextPrime(int num) {

		for (int i = 2; i <= num; i++) {

			boolean isPrime = true;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.print(i + " ");
		}
	}
}
