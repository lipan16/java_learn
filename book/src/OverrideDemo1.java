class SuperClass 
{
	int a;
	SuperClass()
	{
		a=10;
	}
	public void printA()
	{
		System.out.println("父类中a="+a);
	}
}
class SubClass extends SuperClass
{
	int a;
	SubClass(int a)//构造方法
	{
		this.a=a;//this.a是子类a，a是局部变量a
	}
	public void printA()
	{
		super.printA();//在子类中调用父类中的方法
		System.out.println("父类中a="+super.a);	
		System.out.println("子类中a="+a);//this.a
	}
}
public class OverrideDemo1
{
	public static void main(String args[])
	{
		SuperClass s1=new SuperClass();
		SubClass s2=new SubClass(20);
		SuperClass s3=new SubClass(20);//父类引用指向子类对象，谁创建对象调用谁的方法
		s1.printA();
		System.out.println();
		s2.printA();
		System.out.println();
		s3.printA();
	}
}