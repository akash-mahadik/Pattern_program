class pattern8{
	public static void main(String[]args)
	{
		int num=5,i,j;
		for(i=0;i<num;i++)
		{
			for(j=0;j<num;j++)
			{
				if(j<num-i-1)
				{
					System.out.print(" "+" ");
				}
				else{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}
}

				
