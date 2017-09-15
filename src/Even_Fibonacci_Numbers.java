
public class Even_Fibonacci_Numbers {

	public static void main(String[] args) {
		int one = 1;
		int two = 2;
		int sum = 0;
		while(two<4000000)
		{
			if(two%2==0)sum+=two;
			int temp = two;
			two =one+two;
			one = temp;
			System.out.println(two);
		}
		System.out.println(sum);
	}
}
