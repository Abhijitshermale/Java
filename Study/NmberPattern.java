class NmberPattern
{
	public static void main(String args[])
	{
		/*
			1
			12
			123
			1234
		*/
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}	
			System.out.println();
		}
		/*
			1
			23
			456
			78910
		*/
		int cnt=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{

				System.out.print(cnt+" ");
				cnt++;
			}	
			System.out.println();
		}
		/*
			1
			21
			321
			4321
		*/
		for(int i=1;i<=4;i++)
		{	
			int no=i;
			for(int j=1;j<=i;j++)
			{

				System.out.print(no+" ");
				no--;
			}	
			System.out.println();
		}
		
		/*
			1
			121
			12321
			1234321

		*/
		for(int i=1;i<=4;i++)
		{	
			int no=i-1;
			for(int k=1;k<=i;k++)
			{	
				System.out.print(k+" ");
			}
			for(int j=2;j<=i;j++)
			{

				System.out.print(no+" ");
				no--;
			}	
			System.out.println();
		}
		/*
			54321
			4321
			321
			21
			1

		*/
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		/*
			1
			2 6
			3 7 10
			4 8 11 13
			5 9 12 14 15
		*/
			for(int i=1;i<=5;i++)
			{
				int no=4;
				int no2=i;
				for(int j=1;j<=i;j++)
				{	
					if(j==1)
					{
						System.out.print(i+" ");
					}
					else
					{	
						no2+=no;
						System.out.print(no2+" ");
						no=no-1;					
					}
					
				}
				System.out.println();
			}

		/*
			1 2 3
			6 5 4
			7 8 9
			12 11 10
			13 14 15
		*/
			int no=1;
			for(int i=1;i<=5;i++)
			{
				if((no)%2==0)
				{
					for(int j=1;j<=3;j++)
					{	
						if(j==3)
						{
							System.out.print(no+" ");
						}
						else
						{
							System.out.print(no+" ");
						 	no--;
						}		
					}
					
				}
				else
				{
					for(int j=1;j<=3;j++)
					{
						if(j==3)
						{
							System.out.print(no+" ");
						}
						else
						{
							System.out.print(no+" ");
						 	no++;
						}	
					}
				}
				System.out.println();
				no+=3;
			}

	}	
}