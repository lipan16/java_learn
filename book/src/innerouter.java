class innerouter{
  private class inner{//内部类，私有访问级别
    private String name;
    private int age;
    public int step;
    inner(String s,int a)
    {
      name=s;
      age=a;
      step=0;
    }
    public void run()
    {
      step++;
    }
  }
  public static void main (String args[])
  {
    innerouter a=new innerouter();//创建外部对象类
    innerouter.inner d=a.new inner("Tom",3);//创建内部对象类
    d.step=25;//访问内部类属性
    d.run();//调用内部类方法
    System.out.println(d.step);
   }
}