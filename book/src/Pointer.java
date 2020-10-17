class Pointer
{
	private double x;
	private double y;
	Pointer()
	{
		x=0;
		y=0;
	}
	Pointer(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
	public double getX()
	{
		return x;
	}
	public void setX(double x)
	{
		this.x=x;
	}
	public double getY()
	{
		return y;
	}
	public void setY(double y)
	{
		this.y=y;
	}
	public String toString()
	{
		String str="("+x+","+y+")";
		return str;
	}
	public boolean equals(Pointer p)
	{
		if(p==this)
			return true;
		else if(p==null)
			return false;
		else if(this.x==p.x&&this.y==p.y)
			return true;
		else 
			return false;
	}
	public void display()
	{
		System.out.println(toString());
	}
	public static double distance(Pointer p,Pointer q)
	{
		
		  return Math.sqrt((q.x-p.x)*(q.x-p.x)+(q.y-p.y)*(q.y-p.y));
	}
}