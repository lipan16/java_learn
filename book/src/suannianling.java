import java.util.Scanner;
class suannianling 
{
	public static void main(String[] args) 
	{
		Scanner keyin=new Scanner(System.in);
		long n,l,h;
		System.out.print("请输入一个数字：");
		l=keyin.nextLong();
		System.out.print("请输入出生年份：");
		n=keyin.nextLong();
		l=l%10;
		l=(l*2+5)*50+1767-n;
		System.out.println("你今年"+l%100+"周岁");
	}
}
