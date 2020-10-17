import java.util.Scanner;
class xiti2_2
{
	public static void main(String[] args) 
	{
		Scanner keyin=new Scanner(System.in);
		System.out.println("请输入整数，输入0结束程序：");
		long s=1;
		for(int a=1;a!=0;a=keyin.nextInt())
			s=s*a;
		System.out.println("乘积:"+s);
		
	}
}