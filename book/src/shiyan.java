/**��������ʱ�ܵļ��ع���
* ����Ҫ�������༰��ֱ�ӻ��Ӹ���
* ����ص�ͬʱ���ؾ�̬��Ա��������̬������ִ�С���̬��Ա�����ĳ�ʼ��
* �������ɺ󣬿�ʼ�����������ȼ��طǾ�̬�ĳ�Ա�������Ǿ�̬������ִ�С��Ǿ�̬��Ա�����ĳ�ʼ��
* ���ִ�й����������ɶ���
* 
* ��һ�����ö����static�ģ��ͱ����ڶ����ʱ��Ͷ��������г�ʼ��
* ��̬�����ֻ�ܶ����������棬���ܶ����ڷ������档ֻ�ܷ�����ľ�̬��Ա�������������ʵ����Ա����̬�������ı������Ǿֲ�������ֻ�ڿ�����Ч
* ��̬����ֻ������ʾ�̬��Ա
*/

class shiyan extends father
{
	static {int i=1;}
	static int i=2;

	static int j=2;
	static {int j=1;}

	public shiyan()
	{
		super();//���ڵڶ��䱨��   ���췽��-->���๹�췽��(super)
		System.out.println("����");
	}
	public static void add()
	{
		System.out.print("���þ�̬���� ");
		System.out.println(i+j);
	}
	/*public ShalloyCopy clone()
	{
		ShallowCopy t=null;
		try
		{
			t=(ShallowCopy)super.clone();
			t.brith=(Data)t.brith.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return t;
	}*/
	public static void main(String[] args)
	{
		Boolean b1=new Boolean(false);
		System.out.println(b1.toString());
		boolean b2=false;
		System.out.println(b2);//.toString());
		//Boolean ����Ϊ���ñ�����ռ4���ֽ�

	    //�������û���ṩ���췽�������������ṩһ��Ĭ�ϵĹ��췽�������Ƕ����˹��췽���������������ṩ�κι��췽��
		new gouzao();//����gouzao�����޲ι��췽�������gouzao�����޹��췽�������벻�������gouzao����ֻ���вεĹ��췽�������뱨��
		new shiyan();
		add();//���ij�ڴ�����У����뱨��������еı���Ϊ�ֲ���������̬����ֻ������ʾ�̬��Ա����    ��̬����-->��̬����

		System.out.println(i);//2
		System.out.println(j);//2    ��̬��-->��̬����
		//��̬�ı���������������鲻��Ҫ��������ʹ���
		//ִ�� ��̬�����-->��̬����-->��̬����--->���췽��-->���๹�췽��(super)
		
		//���������ʵ�����������������洢��ʼ��ַ
		//ǳ�㸴�Ƶ�ʱ��һ�������������������һ����������û��clone������㸴�ƽ�����Ҳһ��clone. 
		//Java�����ǳ�㸴����ָJava����A����clone���¶���B,��A������û�б�clone����ֻ�ǰ�A�ĸ���������ָ�Ķ���ֵ��B��Ӧ�������ϣ�A��B����ͬ���Զ����õ�ͬһ������
		//Java�������㸴����ָJava����A����clone���¶���B��ͬʱA������Ҳ�Ǳ�clone���¶��󣬸�ֵ��A�ĸ���������ȥ��A��B����ͬ���Զ����õ���ͬ�Ķ���
		//java�����Ĳ�����ֵ���ݣ�java֧���������
	}
}
class gouzao
{
	public gouzao()
	{
		System.out.println("����Ĭ�Ϲ��췽��");
	}
}
class father
{
	public father()
	{
		System.out.println("�����Ĭ�Ϲ��췽��");
	}
}