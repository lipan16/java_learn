import java.util.Scanner;
public class trycatchdemo
{
  public static void main(String[] args)
  {
     int a=0,b=0,c=0;
     try{
       a=Integer.parseInt(args[0]);
       b=Integer.parseInt(args[1]);
       c=a/b;
       System.out.println("c="+c);
       System.out.println("******����ִ��*****");
       System.out.println("ʵ���ĳ�����������ѧ���쳣��3.0/0.0="+(3.0/0.0));
     }
     catch(ArrayIndexOutOfBoundsException e1)
     {
        System.out.println("�˳���Ҫ��������������");
     }
     catch(NumberFormatException e2)
     {
       System.out.println("������������! ");
     }
     catch(ArithmeticException e3)
     {
       System.out.println("��������Ϊ0!"); 
       System.out.print("���������������");  //��ʾ��β���
       Scanner in=new Scanner(System.in);
       b=in.nextInt();
       c=a/b;
       System.out.println("c="+c);
     }
  }
}