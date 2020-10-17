import java.util.Scanner;
class xiti2_11
{
	public static void main(String[] args) 
	{
		Scanner keyin=new Scanner(System.in);
		System.out.println("ÇëÊäÈë20¸öÊı£º");
		int[] a=new int[20];
		for(int i=0;i<20;i++)
			a[i]=keyin.nextInt();
		for(int i=19;i>=0;i--)
			System.out.print(a[i]+" ");
	}
}
