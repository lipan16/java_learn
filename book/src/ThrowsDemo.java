class ThrowsDemo
{
   public static void main(String [] args)
   {
       Person zhangsan=new Person();
       try
       {
           zhangsan.setName("张三");
           zhangsan.setAge(-20);
           zhangsan.display();
       }
       catch(Exception e)
       {
          System.out.println(e.getMessage());
       }
   }
}
class Person
{
  private int age;
  private String name;
  public int getAge(){return age;}
  public String getName(){return name;}
  public void setAge(int a) throws Exception//声明方法可能会抛出异常
  {
    if(a<0)
       throw new Exception("出现异常：年龄不能小于零!");//抛出异常
    if(a>150)
       throw new Exception("出现异常：年龄大于150的概率很小！");//抛出异常
    age=a;
  }
  public void setName(String nn){name=nn;}
  public void display()
  {
    System.out.println("我叫"+name+"\n"+"我今年"+age+"岁！");
  }
}