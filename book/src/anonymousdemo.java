class Anonymousedemo {
   Anonymousedemo(){
      System.out.println("Ĭ�Ϲ��췽��!");
   }
   Anonymousedemo(int x){
      System.out.println("��һ�������Ĺ��췽����");
   }
   void method(){
     System.out.println("һ��Ա����");
   }
   public static void main(String[] args)
   {
     new Anonymousedemo().method();   //�����������󲢵��ó�Ա����
     Anonymousedemo a=new Anonymousedemo(){
        System.out.println("��ʼ������");
        void method(){
          System.out.println("�������еĳ�Ա����");
        }
     };
     a.method(); 
   }
}