import java.io.*;
class dataxiugai 
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			RandomAccessFile d=new RandomAccessFile(new File("datatest.txt"),"rw");//RandomAccessFile d=new RandomAccessFile("datatest.txt","rw");
		    d.seek(20);//设置文件指针到第20个字节
		    d.writeLong(102);
			d.close();
		}
		catch (IOException e)
		{
			System.out.println("File access error :"+e); 
		}
	}
}
