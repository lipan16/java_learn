import java.io.*;
public class Type{
  public static void main(String[] args){
    FileInputStream filein;
    int ch;
    try{
      filein=new FileInputStream(args[0]);
      ch=filein.read();
      while(ch!=-1)
      {
         System.out.print((char)ch);
         ch=filein.read();
      }
      filein.close();
    }
    catch(ArrayIndexOutOfBoundsException e1)
    {
       System.out.println("ʹ�ø�ʽ��java Type �ı��ļ���");
    }
    catch(FileNotFoundException e2)
    {
       System.out.println("��������ļ�������!");
    }
    catch(IOException e3)
    {
      System.out.println("�������������!");
    }
  }
}