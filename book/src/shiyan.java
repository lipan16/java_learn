/**创建对象时总的加载过程
* 加载要创建的类及其直接或间接父类
* 类加载的同时加载静态成员，包括静态代码块的执行、静态成员变量的初始化
* 类加载完成后，开始创建对象。首先加载非静态的成员，包括非静态代码块的执行、非静态成员变量的初始化
* 最后执行构造器，生成对象
* 
* 把一个引用定义成static的，就必须在定义的时候就对其对象进行初始化
* 静态代码块只能定义在类里面，不能定义在方法里面。只能访问类的静态成员，而不允许访问实例成员。静态代码块里的变量都是局部变量，只在块内有效
* 静态方法只允许访问静态成员
*/

class shiyan extends father
{
	static {int i=1;}
	static int i=2;

	static int j=2;
	static {int j=1;}

	public shiyan()
	{
		super();//放在第二句报错   构造方法-->父类构造方法(super)
		System.out.println("儿子");
	}
	public static void add()
	{
		System.out.print("调用静态方法 ");
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
		//Boolean 变量为引用变量，占4个字节

	    //如果我们没有提供构造方法，编译器会提供一个默认的构造方法，我们定义了构造方法，编译器不再提供任何构造方法
		new gouzao();//调用gouzao类中无参构造方法。如果gouzao类中无构造方法，编译不报错。如果gouzao类中只有有参的构造方法，编译报错
		new shiyan();
		add();//如果ij在代码块中，编译报错，代码快中的变量为局部变量，静态方法只允许访问静态成员变量    静态变量-->静态方法

		System.out.println(i);//2
		System.out.println(j);//2    静态块-->静态变量
		//静态的变量，方法，代码块不需要创建对象就存在
		//执行 静态代码块-->静态变量-->静态方法--->构造方法-->父类构造方法(super)
		
		//对象是类的实例化，引用是用来存储开始地址
		//浅层复制的时候，一个对象仅仅在引用另外一个对象。属性没被clone。而深层复制将属性也一并clone. 
		//Java对象的浅层复制是指Java对象A本身被clone成新对象B,但A的属性没有被clone处理，只是把A的各个属性所指的对象赋值到B对应的属性上，A与B的相同属性都引用到同一个对象。
		//Java对象的深层复制是指Java对象A本身被clone成新对象B，同时A的属性也是被clone成新对象，赋值到A的各个属性上去，A与B的相同属性都引用到不同的对象；
		//java方法的参数是值传递，java支持链表操作
	}
}
class gouzao
{
	public gouzao()
	{
		System.out.println("这是默认构造方法");
	}
}
class father
{
	public father()
	{
		System.out.println("父类的默认构造方法");
	}
}