package coreJava;

public class Armstrongnumber {
	
	public static boolean armstrong(int num)
	{
		int tmp, digit,sumofpower=0;
		tmp=num;
		int digits=countDigit(num);
		while(tmp!=0) {
			digit = tmp%10;
			sumofpower= sumofpower+(int)Math.pow(digit, digits);
			tmp=tmp/10;
		}
		return sumofpower==num;
	}
	
	public static int countDigit(int n) {
		int count=0;
		while(n !=0)
		{
			n=n/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
	
		int num = 153;
		System.out.println(armstrong(num));

	}

}
