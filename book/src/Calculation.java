5class Calculation {
  public void add( int a, int b) 
 {
   int c = a + b;
   System.out.println("����������ӵ� "+ c);
  }
  public void add( float a, float b)
  {
    float c = a + b;
    System.out.println("������������ӵ�"+c);
  }
  public void add( String a, String b) 
  {
    String c = a + b;
    System.out.println("�����ַ�����ӵ� "+ c);
  }
  public void add(fushu a,fushu b)
  {
       fushu f=new fushu(a.getReal()+b.getReal(),a.getImag()+b.getImag());
       System.out.println("����������ӵ� "+f);
  }
} 
