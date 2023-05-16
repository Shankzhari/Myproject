
public class minmaxArray {

	public static void main(String[] args) {
		
		int b[][]= {{9,2,3},{4,5,12}};
//		int min=b[0][0];
		int max =b[0][0];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
//				if(b[i][j]<min)
//				{
//					min = b[i][j];
//				}
				
				if(b[i][j]>max)
				{
					max = b[i][j];
				}
				
			}
		}
		System.out.println(max);
	

	}

}
