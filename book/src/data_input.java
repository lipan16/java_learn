import java.io.*;
class data_input
{
public static void main(String[] args) throws IOException
{
   DataInputStream dis=new DataInputStream
    (new FileInputStream("datatest.txt"));
   try{ System.out.println("\t "+dis.readBoolean());//1B
	    System.out.println("\t "+dis.readByte());//1B
	    System.out.println("\t "+dis.readChar());//2B
	    System.out.println("\t "+dis.readDouble());//8B
	    System.out.println("\t "+dis.readFloat());//4B
	    System.out.println("\t "+dis.readInt());//4B
	    System.out.println("\t "+dis.readLong());//8B
	    System.out.println("\t "+dis.readShort());//2B
        System.out.println("\t "+dis.readUTF());
	}finally{dis.close();}
}}
