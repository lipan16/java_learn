import java.util.Scanner;
class xiti2_6 
{
	public static void main(String[] args) 
	{
		int years;
		Scanner a=new Scanner(System.in);
		System.out.println("������ݣ�");
		years=a.nextInt();
		if((years%4==0&&years%100!=0)||years%400==0)
			System.out.println(years+"������");
		else
			System.out.println(years+"��������");
	}
}
