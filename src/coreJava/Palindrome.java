package coreJava;

public class Palindrome {
	public static boolean checkPal(int n)
		{
			int tmp,rem,rev=0;
			tmp=n;
			while(tmp!=0)
			{
				rem = tmp%10;
				rev= rev*10+rem;
				tmp=tmp/10;
			}
			return rev == n;
		}
	

	public static void main(String[] args) {
		int num = 435;
		System.out.println(checkPal(num));
		
	}

}
