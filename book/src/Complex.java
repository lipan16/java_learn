import java.util.Scanner;
class fushu
{
	private double realpart;
	private double imaginarypart;
	Scanner keyin=new Scanner(System.in);
	fushu()
	{
		realpart=0;
		imaginarypart=0;
	}
	fushu(double x,double y)
	{
		realpart=x;
		imaginarypart=y;
	}
	public double getReal()
	{
		return realpart;
	}
    public double getImag()
	{
		return imaginarypart;
	}
	public static final String getDesigner()
	{
		String str="设计者：李攀    学号：320160939611    班级：计算机二班";
		return str;
	}
	public void setX(double x)
	{
		realpart=x;
	}
	public void setY(double y)
	{
		imaginarypart=y;
	}
	public void input()
	{
		System.out.print("请输入realpart:");
		realpart=keyin.nextDouble();
		System.out.print("请输入imaginary:");
		imaginarypart=keyin.nextDouble();
	}
	public void display()
	{
		System.out.println(toString());
	}
	public String toString()
	{
		String str=""+realpart;
		if(imaginarypart<0.0)
			str=str+imaginarypart+"i";
		else 
			str=str+"+"+imaginarypart+"i";
		return str;
	}
	public boolean equals(fushu another)
	{
		if(another==null)
			return false;
		else
			if(this==another)
			return true;
		else
			if(this.realpart==another.realpart&&this.imaginarypart==another.imaginarypart)
			return true;
		else
			return false;
	}
	public int hashcode()
	{
		return ((int)this.realpart*7+(int)this.imaginarypart*13);
	}
	public static void jiajianchengchu(fushu a,fushu b)
	{
		double c,d,e,g;
		c=a.getReal();
		d=a.getImag();
		e=b.getReal();
		g=b.getImag();

		System.out.println("两个运算的复数分别是："+a.toString()+"\t"+b.toString());
		fushu f=new fushu(c+e,d+g);
		System.out.println("两复数的和 ("+a+") + ("+b+") = "+f);

		fushu s=new fushu(c-e,d-g);
		System.out.println("两复数的差 ("+a+") - ("+b+") = "+s);

		fushu m=new fushu(c*e-d*g,c*g+d*e);
		System.out.println("两复数的积 ("+a+") * ("+b+") = "+m);

		if(e*e+g*g==0)
			System.out.println("分母为零");
		else
		{
			fushu h=new fushu((c*e+d*g)/(e*e+g*g),(d*e-c*g)/(e*e+g*g));
			System.out.println("两复数的商 ("+a+") / ("+b+") = "+h);
		}
	 }
}
public class Complex
{
	public static void main(String[] args)
	{
		Scanner keyisn=new Scanner(System.in);
		fushu m1=new fushu(2,3);
		fushu m2=new fushu(4,6);
		fushu m3=new fushu();
		m3.input();
		System.out.println("m1="+m1.toString()+"\nm2="+m2.toString());
		System.out.println("m1.equals(m2)="+m1.equals(m2));
		System.out.println("m1.hashcode="+m1.hashcode());
		System.out.println("m2.hashcode="+m2.hashcode());
		fushu.jiajianchengchu(m1,m2);
		m3.display();
		System.out.println("\n"+fushu.getDesigner());
	}
}