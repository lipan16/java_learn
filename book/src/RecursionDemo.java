public class RecursionDemo {
   public long fac(int n)
   {
      if(n==0)   //��ֹ����
        return 1;
      else
        return(n*fac(n-1)); //�ݹ鹫ʽ
   }
   public long fbnc(int n)
   {
      if(n==0||n==1)   //��ֹ����
        return 1;
      else
        return(fbnc(n-1)+fbnc(n-2));  //�ݹ鹫ʽ
   }
   public static void main(String[] args)
   {
      RecursionDemo rcs=new RecursionDemo();  //����Ĭ�Ϲ��췽����������
      System.out.println("5!="+rcs.fac(5));   //���ö����fac()����
      System.out.println("f(20)="+rcs.fbnc(20));  //���ö����fbnc()����
   }
}