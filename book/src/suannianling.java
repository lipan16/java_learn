import java.util.Scanner;
class suannianling 
{
	public static void main(String[] args) 
	{
		Scanner keyin=new Scanner(System.in);
		long n,l,h;
		System.out.print("������һ�����֣�");
		l=keyin.nextLong();
		System.out.print("�����������ݣ�");
		n=keyin.nextLong();
		l=l%10;
		l=(l*2+5)*50+1767-n;
		System.out.println("�����"+l%100+"����");
	}
}
