class SuperClass 
{
	int a;
	SuperClass()
	{
		a=10;
	}
	public void printA()
	{
		System.out.println("������a="+a);
	}
}
class SubClass extends SuperClass
{
	int a;
	SubClass(int a)//���췽��
	{
		this.a=a;//this.a������a��a�Ǿֲ�����a
	}
	public void printA()
	{
		super.printA();//�������е��ø����еķ���
		System.out.println("������a="+super.a);	
		System.out.println("������a="+a);//this.a
	}
}
public class OverrideDemo1
{
	public static void main(String args[])
	{
		SuperClass s1=new SuperClass();
		SubClass s2=new SubClass(20);
		SuperClass s3=new SubClass(20);//��������ָ���������˭�����������˭�ķ���
		s1.printA();
		System.out.println();
		s2.printA();
		System.out.println();
		s3.printA();
	}
}