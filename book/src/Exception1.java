import java.io.*;
class Exception1
{
    public static void main(String[] args) throws IOException
	{
        if (args.length == 0)
		{
            System.out.println("Must give filename as first arg.");
            return;
        }
        FileInputStream in;
        try
        {
            in = new FileInputStream(args[0]);
        }
        catch(FileNotFoundException e)
		{
            System.out.println("Can't find file: "+args[0]);
            return;
        }
        int ch;
        while ((ch=in.read()) != -1)
		{
            System.out.print(Integer.toString(ch));//以二进制输出
        }
		/*Integer.toHexString(int i)//以十六进制输出
		Integer.toOctalString(int i)//以八进制输出*/
        System.out.println();
        in.close();
    }
}
