class innerouter{
  private class inner{//�ڲ��࣬˽�з��ʼ���
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
    innerouter a=new innerouter();//�����ⲿ������
    innerouter.inner d=a.new inner("Tom",3);//�����ڲ�������
    d.step=25;//�����ڲ�������
    d.run();//�����ڲ��෽��
    System.out.println(d.step);
   }
}