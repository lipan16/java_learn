import java.io.*;
class jmcopy
{
  public static void main(String[] args)
  {
     int ch;
     FileInputStream fin;
     FileOutputStream fout;
     try
     {
        fin=new FileInputStream(args[0]);
        fout=new FileOutputStream(args[1]);
        int key=args[2].length()*13;
        ch=fin.read();
        while(ch!=-1)
        {
            fout.write(ch^key);
            ch=fin.read();
        }
        fin.close();fout.close();
     }catch(ArrayIndexOutOfBoundsException e1)
     { System.out.println("ʹ�ø�ʽ������ȷ��ʽΪ��java jmcopy Դ�ļ��� Ŀ���ļ��� ����");
       System.exit(0);
     }
     catch(FileNotFoundException e3){System.out.println("�ļ�û���ҵ���");}
     catch(IOException e2){System.out.println("������");}
  }
}