class xiti2_3 
{
	public static void main(String[] args) 
	{
		double a=0;
		int i=1,k=1;
		for(;k<=999999999;k+=2)
		{
			a=a+i*1.0/k;
			i=-i;
		}
		System.out.println("PI="+4*a);
	}
}
