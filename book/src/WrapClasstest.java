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
		Double d=new Double(1.0);//将值封装到相应的对象
		Integer ii=new Integer("32");
		Double dd=new Double("3.14D");//将字符串封装到相应的对象

		int a=Integer.parseInt("123");//把字符串"123"转化为int型
		float f1=Float.valueOf("22.3f");//把字符串"22.3f"转化为float型
		System.out.println(dd);
		int myint=a+i-3;//JDK1.5以后允许基本类型和封装类型进行混合数字运算
		System.out.println(myint);
	}
}