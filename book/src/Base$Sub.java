public class Base
{
	public int publicVarOfBase=1;//public���ʼ���
	private int privateVarOfBase=1;//private���ʼ���
	int defaultVarOfBase=1;//Ĭ�Ϸ��ʼ���
	protected void methodOfBase(){}//protected���ʼ���
}
public class Sub extends Base
{
	public void methodOfSub(){
		publicVarOfBase=2;//�Ϸ������Է���Base���public���͵ı���
		privateVarOfBase=2;//�Ϸ������Է���Base���Ĭ�Ϸ��ʼ���ı���
		defaultVarOfBase=2;//�Ƿ������ܷ���Base���private���͵ı���
		methodOfBase();//�Ϸ������Է���Base���protected���͵ı���
	}
	public static void main(String args[]){
		Sub sub=new Sub();
		sub.publicVarOfBase=3;//�Ϸ���Sub��̳�Base���public���͵ı���
		sub.privateVarOfBase=3;//�Ƿ���Sub�಻�ܼ̳�Base���private���͵ı���
		sub.defaultVarOfBase=3;//�Ϸ���Sub��̳���Base���Ĭ�Ϸ��ʼ���ı���
		sub.methodOfBase();//�Ϸ���Sub��̳���Base���protected���͵ķ���
		sub.methodOfSub();//�Ϸ�������Sub�౾���ʵ������
	}
}
