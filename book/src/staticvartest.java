class staticvartest
{
   int a;
   static int b;
   staticvartest(){a=20;b=30;}
   public static void main(String args[] )
   {
       staticvartest ss=new staticvartest();
       staticvartest sb=new staticvartest();
       ss.a=60;ss.b=80;//staticvartest.b=80;
       sb.a=100;staticvartest.b=10000;//ss.b=10000;
       System.out.println("a="+ss.a);
       System.out.println("b="+b);//类名直接访问staticvartest.b
       System.out.println("a="+sb.a);
       System.out.println("b="+staticvartest.b);
   }
}
