class Staticmethod{
  public static int add(int x,int y){//静态方法
    return x+y;
  }
  public static void main(String[] args)
  {
    int result=Staticmethod.add(10,20);  //调用静态方法，类层次的方法一装入就有，不需要创建对象
    System.out.println("result= "+result);
  }
}