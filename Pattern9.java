//M PATTERN
class Pattern9{
	public static void main(String[]args)
	{
	
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i+j==4&&j>=2||i<=1&&j==0||i-j==0&&j<=2||j==0||j==4)
				{
					System.out.print("*"+" ");
				}
				else{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}
