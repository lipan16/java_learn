import java.util.Scanner;
class xiti2_10 
{
	public static void main(String[] args) 
	{
		Scanner keyin=new Scanner(System.in);
		System.out.println("�������ַ���");
		String str=keyin.nextLine();
		int len=str.length();
		int lettercounts=0,spacecounts=0,numbercounts=0,othercounts=0;
		char ch;
		for(int i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(Character.isLetter(ch))
				lettercounts++;
			else if(Character.isDigit(ch))numbercounts++;
			else if(Character.isSpace(ch))spacecounts++;
			else othercounts++;
		}
		System.out.println("Ӣ����ĸ:"+lettercounts+"\n�ո�:"+spacecounts+"\n����:"+numbercounts+"\n����:"+othercounts);
	}
}
