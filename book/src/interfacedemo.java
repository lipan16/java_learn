interface Computable
{
   int M=10;//��̬����
   int f(int x);//���󷽷�
   public abstract int g(int x,int y);//���󷽷�
}
class A implements Computable//ʵ�ֽӿ�
{
  public int f(int x)
  { 
    return M+2*x;
  }
  public int g(int x,int y){return M*(x+y);}
}
class B implements Computable//ʵ�ֽӿ�
{
  public int f(int x){return x*x*x;}
  public int g(int x,int y){return x*y*M;}
}
public class interfacedemo
{
  public static void main(String[] args)
  {
    A a=new A();//�ɻ�ΪComputable a=new A();a�ǽӿڶ�������ã�ָ��ʵ�ֽӿڵ��ഴ���Ķ���A()
    B b=new B();//�ɻ�ΪComputable b=new B();�ӿ��ܶ������õ����ܴ�������
    System.out.println(a.M);
    System.out.println(""+a.f(20)+", "+a.g(12,2));
    System.out.println(b.M);
    System.out.println(""+b.f(20)+", "+b.g(12,2));
  }
}