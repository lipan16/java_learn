class PointerTest 
{
	public static void main(String[] args) 
	{
		Pointer a=new Pointer(2,4);
		Pointer b=new Pointer(2,3);
		a.display();
		b.display();
		System.out.println(Pointer.distance(a,b));
	}
}
