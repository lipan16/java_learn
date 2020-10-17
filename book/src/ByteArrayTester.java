import java.io.*;
class ByteArrayTester 
{
	public static void main(String[] args) throws IOException 
	{
		byte buff[]=new byte[]{1,55,-2,-9,89};
		ByteArrayInputStream in=new ByteArrayInputStream(buff,1,4);
		int data=in.read();
		while(data!=-1)
		{
			System.out.println(data+" ");
			data=in.read();
		}
		in.close();
	}
}
