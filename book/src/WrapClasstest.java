class WrapClasstest
{
	public static void main(String[] args)
	{
		Boolean bln=new Boolean(true);
		Byte b=new Byte((byte)1);
		Character c=new Character('c');
		Short s=new Short((short)32);
		Integer i=new Integer(45);
		Long l=new Long(20L);
		Float f=new Float(1.0f);
		Double d=new Double(1.0);//��ֵ��װ����Ӧ�Ķ���
		Integer ii=new Integer("32");
		Double dd=new Double("3.14D");//���ַ�����װ����Ӧ�Ķ���

		int a=Integer.parseInt("123");//���ַ���"123"ת��Ϊint��
		float f1=Float.valueOf("22.3f");//���ַ���"22.3f"ת��Ϊfloat��
		System.out.println(dd);
		int myint=a+i-3;//JDK1.5�Ժ�����������ͺͷ�װ���ͽ��л����������
		System.out.println(myint);
	}
}