class pattern6{
	public static void main(String[]args)
	{
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(i==0||j==0||i==8||j==8||j==i||j==4||i==4||i+j==8)
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

