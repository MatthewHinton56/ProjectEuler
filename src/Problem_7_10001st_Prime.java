import java.util.ArrayList;

public class Problem_7_10001st_Prime {

	public static void main(String[] args) {
		findPrimes(1000000);
		System.out.println(primes.get(10000));
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
