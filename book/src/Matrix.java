// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space
// Source File Name:   shiyan7_3_2.java

import java.util.Scanner;

class Matrix
{

	int x;
	int y;
	int a[][];

	public Matrix()
	{
	}

	public Matrix(int i, int j)
	{
		x = i <= 0 ? 1 : i;
		y = j <= 0 ? 1 : j;
		a = new int[x][y];
		for (int k = 0; k < x; k++)
		{
			for (int l = 0; l < y; l++)
				a[k][l] = 0;

		}

	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public int[][] getA()
	{
		return a;
	}

	public int getAA(int i, int j)
	{
		return a[i][j];
	}

	public void setXY(int i, int j)
	{
		x = i <= 0 ? 1 : i;
		y = j <= 0 ? 1 : j;
		a = new int[x][y];
		for (int k = 0; k < x; k++)
		{
			for (int l = 0; l < y; l++)
				a[k][l] = 0;

		}

	}

	public boolean equals(matrix matrix)
	{
		if (matrix == null)
			return false;
		if (matrix == this)
			return true;
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
				if (a[i][j] != matrix.a[i][j])
					return false;

		}

		return true;
	}

	public String toString()
	{
		String s = new String();
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
				s = (new StringBuilder()).append(s).append(a[i][j]).append("  ").toString();

			s = (new StringBuilder()).append(s).append("\n").toString();
		}

		return s;
	}

	public void value()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("����������������");
		x = scanner.nextInt();
		System.out.print("����������������");
		y = scanner.nextInt();
		a = new int[x][y];
		System.out.println((new StringBuilder()).append("������").append(x * y).append("����,��").append(x).append("*").append(y).append("�ľ���ֵ.").toString());
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
				a[i][j] = scanner.nextInt();

		}

	}

	public void addsub(matrix matrix)
		throws ArithmeticException
	{
		if (x != matrix.x || y != matrix.y)
			throw new ArithmeticException("�Ӽ��쳣");
		int ai[][] = new int[x][y];
		int ai1[][] = new int[x][y];
		for (int i = 0; i < x; i++)
		{
			for (int i1 = 0; i1 < y; i1++)
				ai[i][i1] = a[i][i1] + matrix.a[i][i1];

		}

		System.out.println("������ĺͣ�");
		for (int j = 0; j < x; j++)
		{
			for (int j1 = 0; j1 < y; j1++)
				System.out.print((new StringBuilder()).append(ai[j][j1]).append("\t").toString());

			System.out.println();
		}

		for (int k = 0; k < x; k++)
		{
			for (int k1 = 0; k1 < y; k1++)
				ai[k][k1] = a[k][k1] - matrix.a[k][k1];

		}

		System.out.println("������Ĳ");
		for (int l = 0; l < x; l++)
		{
			for (int l1 = 0; l1 < y; l1++)
				System.out.print((new StringBuilder()).append(ai[l][l1]).append("\t").toString());

			System.out.println();
		}

	}

	public void mult(matrix matrix)
		throws ArithmeticException
	{
		if (y != matrix.x)
			throw new ArithmeticException("�˷��쳣");
		int ai[][] = new int[x][matrix.y];
		for (int i = 0; i < x; i++)
		{
			for (int k = 0; k < matrix.y; k++)
			{
				for (int i1 = 0; i1 < y; i1++)
					ai[i][k] = ai[i][k] + a[i][i1] * matrix.a[i1][k];

			}

		}

		System.out.println("������Ļ���");
		for (int j = 0; j < x; j++)
		{
			for (int l = 0; l < matrix.y; l++)
				System.out.print((new StringBuilder()).append(ai[j][l]).append("\t").toString());

			System.out.println();
		}

	}
}
