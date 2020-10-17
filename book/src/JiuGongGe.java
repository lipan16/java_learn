import java.util.Scanner;
class  JiuGongGe
{
	public static void main(String[] args) 
	{
		Scanner keyin=new Scanner(System.in);
		int n;
		double d;
		System.out.print("请输入九宫格的行列(只能是奇数)：");
		while(true)
		{
			d=keyin.nextDouble();
			n=(int)d;
			if((d-n)>1.0E-4||n%2==0||n<0)
				System.out.print("输入出错，只能是奇数，请重新输入：");
			else
				break;
		}
		int result[][]=new int[n][n];
		int row=0,col=n/2;
		for(int i=1;i<=n*n;i++)
		{
			result[row][col]=i;
			row--;
			col++;
			if(row<0&&col>=n)//行列都越界
			{
				col--;
				row+=2;
			}
			else
				if(row<0)//行越界
				row=n-1;
			else
				if(col>=n)//列越界
				col=0;
			else
				if(result[row][col]!=0)//有冲突
			{
				col--;
				row+=2;
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.printf("%-5d",result[i][j]);
			System.out.println();
		}
	}
}
