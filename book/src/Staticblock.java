class Staticblock
{
  static int[] values=new int[10];   //��̬�����Ա
  static//static �����
  {
     System.out.println("���г�ʼ����");
     for(int i=0;i<values.length;i++)
         values[i]=(int)(100*Math.random());
  }
  void listValues()
  {
     System.out.println();
     for(int i=0;i<values.length;i++)
     {
        System.out.print("  "+values[i]);//����Ҫ��������
     }
  }
  public static void main(String[] args)
  {
    Staticblock test=new Staticblock();
    System.out.println("\n ��һ������");
    test.listValues();

    test=new Staticblock();
    System.out.println("\n �ڶ�������");
    test.listValues();
  }
}