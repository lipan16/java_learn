// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   abstractshape.java

import java.awt.Graphics;

class circle extends shape
{

	point c;
	int r;

	circle(point point1, int i)
	{
		c = point1;
		r = i;
	}

	public void drawme(Graphics g)
	{
		g.drawOval(c.x - r, c.y - r, 2 * r, 2 * r);
	}

	public double area()
	{
		return 3.1415899999999999D * (double)r * (double)r;
	}

	public double length()
	{
		return 6.2831799999999998D * (double)r;
	}

	public String getName()
	{
		return "circle ";
	}
}
