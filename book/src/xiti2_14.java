import java.util.Scanner;
class xiti2_14 
{
	public static void main(String[] args) 
	{
		Scanner keyin=new Scanner(System.in);
		System.out.println("请输入字符串:");
		String str=keyin.nextLine();
		StringBuffer strbuf=new StringBuffer();
        for(int i=0;i<str.length();i++)
		{
            strbuf.insert(0,str.charAt(i));
        }
        System.out.println(strbuf.toString());
        System.out.println(strbuf.reverse());
/**      char[] ch=new char[str.length()];
		for(int i=0;i<str.length();i++)
			ch[str.length()-i]=str.charAt(i);行不通
		for(int i=0;i<str.length();i++)
			System.out.print(ch[i]);
*/
	}
}