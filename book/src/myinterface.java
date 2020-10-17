interface myinterface//定义接口，接口中只存在公有的抽象方法，公有的静态常量。编译器会自动添加这些修饰符
{
	public abstract void add(int x, int y);//抽象方法
	public abstract void volume(int x,int y, int z);//抽象方法
	public static final double price = 1450.00;//静态常量
    public static final int counter = 5;//静态常量
}
