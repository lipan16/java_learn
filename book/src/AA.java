class AA
{
	public static void main(String[] args) 
	{
		int i=9;
		try
		{
			int j=i/0;
			System.out.println("helloworld");
		}
		catch (ArithmeticException e)
		{
			System.out.println("iouhibo");
			return ;//���ִ����ô��20�в���ִ��
		}
		finally
		{
			System.out.println("fjubhv");
		}
		System.out.println("b");
	}
}
