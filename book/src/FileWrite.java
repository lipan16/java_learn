// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   FileWrite.java

import java.io.FileWriter;
import java.io.IOException;

class FileWrite
{

	FileWrite()
	{
	}

	public static void main(String args[])
		throws IOException
	{
		FileWriter filewriter = new FileWriter("sin.txt");
		for (int i = 0; i <= 90; i++)
			filewriter.write((new StringBuilder()).append("sin(").append(i).append(")=").append(Math.sin(((double)i / 180D) * 3.1415926535897931D)).append("\n\r").toString());

		filewriter.close();
	}
}
