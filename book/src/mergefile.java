import java.io.*;
class mergefile{
  public static void main(String[] args)
  {
     FileReader fr;
     FileWriter fw;
     int ch;
     try{
        fr=new FileReader(args[0]);
        fw=new FileWriter(args[2]);
        ch=fr.read();
        while(ch!=-1)
        { 
           fw.write(ch);
           ch=fr.read();
        }
        fr.close();
        fr=new FileReader(args[1]);
        ch=fr.read();
        while(ch!=-1)
        { 
           fw.write(ch);
           ch=fr.read();
        }
        fr.close();
        fw.close();
     }
     catch(ArrayIndexOutOfBoundsException e1)
     {
        System.out.println("ʹ�ø�ʽ��java mergefile Դ�ļ�1 Դ�ļ�2  Ŀ���ļ�");
     }
     catch(FileNotFoundException e2)
     { 
        System.out.println("��������ļ�������");
     }
     catch(IOException e3)
     {
        System.out.println("������!");
     }
  }
}