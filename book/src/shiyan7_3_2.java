import java.io.*;
import java.util.Scanner;

class shiyan7_3_2 {
	public static void main(String[] args) {
		int x, y;
		matrix m1 = new matrix();
		matrix m2 = new matrix();
		m1.value();
		m2.value();
		m1.mult(m2);
		try {
			/*FileWriter fw=new FileWriter("Matrixout.txt");
			FileReader fr=new FileReader("Matrixin.txt");
			fw.write(m1.x+"\t"+m1.y+"\n");
			for(int i=0;i<m1.x;i++)
			{
				for(int j=0;j<m1.y;j++)
				fw.write(m1.a[i][j]+"\t");
				fw.write("\n");
			}
			fw.close();

			x=fr.read();
			y=fr.read();
			m2.setXY(x,y);
			for(int i=0;i<x;i++)
				for(int j=0;j<y;j++)
				m2.a[i][j]=fr.read();
			System.out.println(m2.toString());
			fr.close();*/
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("Matrixout1.txt"));//写数据到流
			dos.writeInt(m1.x);
			dos.writeUTF("\t");
			dos.writeInt(m1.y);
			dos.writeUTF("\n");
			for (int i = 0; i < m1.x; i++) {
				for (int j = 0; j < m1.y; j++) {
					dos.writeInt(m1.a[i][j]);
					dos.writeUTF("\t");
				}
				dos.writeUTF("\n");
			}
			dos.close();

			DataInputStream dis = new DataInputStream(new FileInputStream("Matrixout1.txt"));//从流读数据
			System.out.println("显示文件");
			System.out.print(x = dis.readInt());
			System.out.print("\t");
			dis.readUTF();
			System.out.print(y = dis.readInt());
			dis.readUTF();
			System.out.println();
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					System.out.print(dis.readInt() + "\t");
					dis.readUTF();
				}
				System.out.println();
				dis.readUTF();
			}
			dis.close();

			m1.addsub(m2);//加减法
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件没有找到");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class matrix {
	int x, y;
	int a[][];

	public matrix() {
	}

	public matrix(int m, int n) {
		x = m > 0 ? m : 1;
		y = n > 0 ? n : 1;
		a = new int[x][y];
		for (int i = 0; i < x; i++)
			for (int j = 0; j < y; j++)
				a[i][j] = 0;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int[][] getA() {
		return a;
	}

	public int getAA(int i, int j) {
		return a[i][j];
	}

	public void setXY(int m, int n) {
		x = m > 0 ? m : 1;
		y = n > 0 ? n : 1;
		a = new int[x][y];
		for (int i = 0; i < x; i++)
			for (int j = 0; j < y; j++)
				a[i][j] = 0;
	}

	public boolean equals(matrix another) {
		if (another == null)
			return false;
		else if (another == this)
			return true;
		else {
			for (int i = 0; i < x; i++)
				for (int j = 0; j < y; j++)
					if (a[i][j] != another.a[i][j])
						return false;
		}
		return true;
	}

	public String toString() {
		String str = new String();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++)
				str = str + a[i][j] + "  ";
			str += "\n";
		}
		return str;
	}

	public void value()//输入矩阵的值
	{
		Scanner keyin = new Scanner(System.in);
		System.out.print("请输入矩阵的行数：");
		x = keyin.nextInt();
		System.out.print("请输入矩阵的列数：");
		y = keyin.nextInt();
		a = new int[x][y];
		System.out.println("请输入" + (x * y) + "个数,给" + x + "*" + y + "的矩阵赋值.");
		for (int i = 0; i < x; i++)
			for (int j = 0; j < y; j++)
				a[i][j] = keyin.nextInt();
	}

	public void addsub(matrix m) throws ArithmeticException//加减法
	{
		if (this.x != m.x || this.y != m.y)
			throw new ArithmeticException("加减异常");
		int[][] b = new int[this.x][this.y];
		int[][] c = new int[this.x][this.y];

		for (int i = 0; i < this.x; i++)//加法
			for (int j = 0; j < this.y; j++)
				b[i][j] = this.a[i][j] + m.a[i][j];
		System.out.println("两数组的和：");
		for (int i = 0; i < this.x; i++) {
			for (int j = 0; j < this.y; j++)
				System.out.print(b[i][j] + "\t");
			System.out.println();
		}

		for (int i = 0; i < this.x; i++)//减法
			for (int j = 0; j < this.y; j++)
				b[i][j] = this.a[i][j] - m.a[i][j];
		System.out.println("两数组的差：");
		for (int i = 0; i < this.x; i++) {
			for (int j = 0; j < this.y; j++)
				System.out.print(b[i][j] + "\t");
			System.out.println();
		}
	}

	public void mult(matrix m) throws ArithmeticException//乘法
	{
		if (this.y != m.x)
			throw new ArithmeticException("乘法异常");
		int[][] b = new int[this.x][m.y];
		for (int i = 0; i < this.x; i++)
			for (int j = 0; j < m.y; j++)
				for (int k = 0; k < this.y; k++)
					b[i][j] = b[i][j] + this.a[i][k] * m.a[k][j];
		System.out.println("两数组的积：");
		for (int i = 0; i < this.x; i++) {
			for (int j = 0; j < m.y; j++)
				System.out.print(b[i][j] + "\t");
			System.out.println();
		}
	}
}
