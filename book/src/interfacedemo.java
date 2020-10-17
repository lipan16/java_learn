interface Computable
{
   int M=10;//静态常量
   int f(int x);//抽象方法
   public abstract int g(int x,int y);//抽象方法
}
class A implements Computable//实现接口
{
  public int f(int x)
  { 
    return M+2*x;
  }
  public int g(int x,int y){return M*(x+y);}
}
class B implements Computable//实现接口
{
  public int f(int x){return x*x*x;}
  public int g(int x,int y){return x*y*M;}
}
public class interfacedemo
{
  public static void main(String[] args)
  {
    A a=new A();//可换为Computable a=new A();a是接口定义的引用，指向实现接口的类创建的对象：A()
    B b=new B();//可换为Computable b=new B();接口能定义引用但不能创建对象
    System.out.println(a.M);
    System.out.println(""+a.f(20)+", "+a.g(12,2));
    System.out.println(b.M);
    System.out.println(""+b.f(20)+", "+b.g(12,2));
  }
}