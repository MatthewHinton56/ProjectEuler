
public class Special_Pythagorean_triple {

	public static boolean check(int a,int b)
	{
		int c = (int)Math.sqrt(a*a+b*b);
		return (a<c&&b<c&&a+b+c==1000&&a<b);
	}
	public static void main(String[] args) {
		for(int i = 1;i<999;i++)
			for(int q = 1;q<999;q++)
				if(check(i,q))System.out.println(i+" "+q+Math.sqrt(i*i+q*q));
		System.out.println(200+" "+375+" "+425);
		System.out.println(200*200+" "+375*375+" "+425*425);
		System.out.println(200l*375l*425l);
	}
	
}
