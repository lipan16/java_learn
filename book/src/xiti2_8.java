import java.util.Scanner;
class xiti2_8 
{
	public static void main(String[] args) 
	{
		int m,n,gcd,lcm;
		Scanner keyin=new Scanner(System.in);
		System.out.println("请输入两个数：");
		m=keyin.nextInt();
		n=keyin.nextInt();
		if(m==0||n==0)
		{
			System.out.println("输入错误");
			System.exit(0);
		}
		System.out.println("gcd="+gcd(m,n));
		System.out.println("lcm="+lcm(m,n));
	}
	public static int gcd(int a,int b)
	{
		for(int c=1;;b=c)
		{
			c=a%b;
			a=b;
			if(c==0)
				break;
		}
		return b;
	}
	public static int lcm(int a,int b)
	{
		int c;
		for(c=a;;c++)
		{
			if(c%a==0&&c%b==0)
				return c;
		}
	}
}