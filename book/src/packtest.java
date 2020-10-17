import mypack.A;//������������ڶ��������
public class packtest
{
   public void display()
   {
      System.out.println("Math.sqrt(2.0)="+Math.sqrt(2.0));
   }
}
class B
{
   public static void main(String [] args)
   {
	  mypack.A b=new mypack.A();//������ʹ��
      packtest a=new packtest();
      a.display();
	  b.print();
   }
}
//javac -d ·��(�����Ĵ洢·��) -classpath ·���б�(�����Ĵ洢·��) *.java
//java -classpath ·���б� ����.����(���javac����classpath·��������ʱ���Բ�дclasspath·��)
//����ͨ������.���������ʣ�����ʱ�Ƿֲ㵼�벻�ᵼ����������

/* ����1
javac -d D:\Java\javaes packtest.java  //mypg��(�ļ���)�洢��D:\Java\javaes��
java -classpath D:\Java\javaes mypg.B  //��D:\Java\javaes��ȥ�� ����mypg.B
*/

/* ����2
javac -d D:\java\javaes -classpath D:\java\javaes packtest.java  //mypg��(�ļ���)�洢��D:\Java\javaes�У���D:\Java\javaes��ȥ����
java -classpath D:\java\javaes mypg.B
*/
