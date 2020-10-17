import java.util.Scanner;
class lcm extends gcd 
{
	public int f(int a,int b)
	{
		int n=a;
	    while(n%b!=0||n%a!=0)
			n++;
		return n;
	}
	public void print(int a,int b)
	{
		System.out.println("最大共因数:"+super.f(a,b));
		System.out.println("最小公倍数:"+a*b/super.f(a,b));
		System.out.println(f(a,b));
	}

	public static void main(String[] args)
	{
		Scanner keyin=new Scanner(System.in);
		int a,b;
		a=keyin.nextInt();
		b=keyin.nextInt();
		lcm l=new lcm();
		l.print(a,b);
	}
}
