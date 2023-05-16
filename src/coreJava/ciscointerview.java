package coreJava;

public class ciscointerview {

	public static void main(String[] args) {
		int b[][]= {{9,2,13},{4,5,12}};
		int min=b[0][0];
		int col=0;
		
		
		
		/*for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(b[i][j]<min) 
				
				{
					min = b[i][j];
					 row=i;
					
				}
				
				
			}
		}
		int max = b[row][0];
		for(int j=0;j<3;j++)
		{
			
			if(b[row][j]>max)
			{
				max=b[row][j];
			}
		}
		System.out.println(max);*/
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(b[i][j]<min) 
				
				{
					min = b[i][j];
					 col = j;
					
				}
			}
		}
		int max = b[0][col];
		
		for(int i=0;i<2;i++)
		{
			if(b[i][col]>max)
			{
			
				max= b[i][col];
			
			}
		}
		System.out.println(max);
}
}
