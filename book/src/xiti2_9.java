import java.util.Scanner;
class xiti2_9 
{
	public static void main(String[] args) 
	{
		Scanner keyin=new Scanner(System.in);
		System.out.println("ÇëÊäÈëX£º");
		int x=keyin.nextInt();
		double y,y1;
		y1=x/2;
		y=(y1+x/y1)/2;
		while(Math.abs(y-y1)>10E-5)
		{
			y1=y;
			y=(y1+x/y)/2;
		}
		System.out.println("y="+y);
		System.out.println("Math.sqrt("+x+")="+Math.sqrt(x));
	}
}
