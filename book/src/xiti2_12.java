import java.util.Scanner;
class xiti2_12 
{
	public static void main(String[] args) 
	{
		Scanner keyin=new Scanner(System.in);
		System.out.println("������������");
		int [] a=new int[10];
		for(int i=0;i<10;i++)
			a[i]=-1;
		for(int i=0;i<10;i++)
		{
			a[i]=keyin.nextInt();
			if(a[i]==-1)
				break;
		}
		if(a[0]!=-1)
			System.out.print("����Ϊ��");
		for(int i=a.length-1;i>=0;i--)
			if(a[i]!=-1)
			System.out.print(a[i]+" ");
	}
}
