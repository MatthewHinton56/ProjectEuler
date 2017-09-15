
public class Smallest_Multiple {

	public static long GCD(long a, long b)
	{
		while(b>0)
		{
			long temp = b;
			b = a%b;
			a=temp;		
		}
		return a;
	}
	public static long LCM(long a, long b)
	{
		return (a*b)/GCD(a,b);
	}
	public static void main(String[] args) {
		long lcm = LCM(1,2);
		for(long i = 3;i<=20;i++)
		{
			if(i>lcm)lcm = LCM(i,lcm);
			else lcm = LCM(lcm,i);
			System.out.println(lcm);
		}
		System.out.println(lcm);
		for(int q = 1;q<=20;q++)System.out.println(lcm%q==0);
	}
	
}
