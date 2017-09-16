
public class Sum_Square_Difference {

	public static long Sum_Of_Squares(int upperbound)
	{
		long sum = 0;
		for(long l = 1;l<=upperbound;l++)sum+=(l*l);
		return sum;
	}
	public static long Square_Of_Sums(int upperbound)
	{
		long count = (1+upperbound)*(upperbound/2);
		return count*count;
	}
	public static void main(String[] args) {
		System.out.println(Sum_Of_Squares(100)-Square_Of_Sums(100));
	}
}
