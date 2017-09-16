
public class Summation_Of_Primes {
	public static long sum = 0;
	public static void findPrimes(int upperBound)
	{
		 sum = 0;
		boolean[] sieve = new boolean[upperBound];
		for(int set = 2;set<upperBound;set++)sieve[set]=true;
		for(int i = 2;i<upperBound;i++)
		{
			if(sieve[i])for(int q = i+i;q<upperBound;q+=i)sieve[q]=false;
		}
		for(int col = 2;col<upperBound;col++)if(sieve[col])sum+=col;
	}
	public static void main(String[] args) {
		findPrimes(2000000);
		System.out.println(sum);
	}
}
