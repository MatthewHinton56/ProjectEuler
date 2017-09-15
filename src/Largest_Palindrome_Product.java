
public class Largest_Palindrome_Product {
	public static void main(String[] args) {
		
		int max = 0;
		for(int i = 900;i<=999;i++)
		for(int q = 900;q<=999;q++)
			if(isPalindrome((i*q)+""))System.out.println(i*q);
	}

	public static boolean isPalindrome(String test)
	{
		int x = 0;
		int y = test.length()-1;
		boolean isPalindrome=true;
		while(x<=y&&isPalindrome)
		{
			isPalindrome = (test.charAt(x)==test.charAt(y));
			x++;
			y--;
		}
		return isPalindrome;
	}
	
}

