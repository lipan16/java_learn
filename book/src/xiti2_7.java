class xiti2_7 
{
	public static void main(String[] args) 
	{
		long s=0;
		long k,a=1;
		for(int i=1;i<=9;i++)
		{
			for(k=1;k<=i;k++)
			a=a*k;
			s=s+a;
		}
		System.out.println(s);
	}
}
