import java.util.Scanner;
class xiti2_5 
{
	public static void main(String[] args) 
	{
		System.out.println("���������0�ĸ�����������-1.0��������");
		float s=0,a=0,p,max,min;
		int i=0;
		Scanner keyin=new Scanner(System.in);
		a=keyin.nextFloat();
		if(a!=-1.0)
		{
			s=max=min=a;
			i++;
			do{
				a=keyin.nextFloat();
				if(a==-1.0)
					break;
				if(max<a)
					max=a;
				if(min>a)
					min=a;
				i++;
				s=s+a;
			}while(a!=-1.0);
		System.out.println("ƽ����="+s/i+"\n����="+i+"\nmax="+max+"\nmin="+min);
		}
	}
}
