class A
{
   int a;
   public A(){a=29;}
   public void print()
   {
      System.out.println("a="+a);
      B myb=new B();   //ʹ���ڲ��ഴ������ new B()==this.new B()
	  myb.b=45;
      myb.display();
   }
   class B    //�ڲ���
   {
      int b;
      B(){b=78;}
      public void display()
      {
        System.out.println("a="+a);   //����ֱ�ӷ����ⲿ��ĳ�Ա����
        System.out.println("b="+b);
      }
   }
}
class innertest
{
   public static void main(String[] args)
   {
      A mya=new A();
      mya.print();
      A.B innerobj=new A().new B();   //���������д����ڲ������ �ȴ����ⲿ���ٴ����ڲ���
      innerobj.display();  
   }
}