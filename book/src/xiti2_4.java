class xiti2_4 
{
	public static void main(String[] args) 
	{
		int x,y;
		for(x=1;x<=49;x++)
		{
			y=49-x;
			if(2*x+4*y==100)
				{
				System.out.println("x="+x+"\ny="+y);
				break;
				}
		}
	}
}