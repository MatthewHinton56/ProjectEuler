import java.util.ArrayList;

public class Largest_Prime_Factor {

	public static void main(String[] args) {
		long test = 600851475143l;
		findPrimes((int)Math.sqrt(test));
		for(int i = 0;i<primes.size();i++)
			if(test%primes.get(i)==0)System.out.println(primes.get(i));
	}
	public static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	public static void findPrimes(int upperBound)
	{
		boolean[] sieve = new boolean[upperBound];
		for(int set = 2;set<upperBound;set++)sieve[set]=true;
		for(int i = 2;i<upperBound;i++)
		{
			if(sieve[i])for(int q = i+i;q<upperBound;q+=i)sieve[q]=false;
		}
		for(int col = 2;col<upperBound;col++)if(sieve[col])primes.add(col);
	}
}
