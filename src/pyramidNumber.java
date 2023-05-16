
public class pyramidNumber {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=0; i<=4;i++)
		{
			
			for(int j=4;j>=5-i;j--)
			{ 
				
				sum++;
				System.out.print(sum+" ");
				
			}
			
			System.out.print("\n");
		}
		

	}

}
