public class Base
{
	public int publicVarOfBase=1;//public访问级别
	private int privateVarOfBase=1;//private访问级别
	int defaultVarOfBase=1;//默认访问级别
	protected void methodOfBase(){}//protected访问级别
}
public class Sub extends Base
{
	public void methodOfSub(){
		publicVarOfBase=2;//合法，可以访问Base类的public类型的变量
		privateVarOfBase=2;//合法，可以访问Base类的默认访问级别的变量
		defaultVarOfBase=2;//非法，不能访问Base类的private类型的变量
		methodOfBase();//合法，可以访问Base类的protected类型的变量
	}
	public static void main(String args[]){
		Sub sub=new Sub();
		sub.publicVarOfBase=3;//合法，Sub类继承Base类的public类型的变量
		sub.privateVarOfBase=3;//非法，Sub类不能继承Base类的private类型的变量
		sub.defaultVarOfBase=3;//合法，Sub类继承了Base类的默认访问级别的变量
		sub.methodOfBase();//合法，Sub类继承了Base类的protected类型的方法
		sub.methodOfSub();//合法，这是Sub类本身的实例方法
	}
}
