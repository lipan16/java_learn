import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.util.Scanner;
class Driver//��ʻԱ��
{	
	private String name;//����
	private char sex;//�Ա�
	private String nationality;//����
	private String address;//סַ
	private String birthday;//��������
	private String lssueDate;//������֤����
	private String class1;//׼�ݳ���
	private String validfrom;//��Ч����
	private int validfor;//��Ч����
	private String filenumber;//�������
	Scanner keyin=new Scanner(System.in);

    Driver()//Ĭ�Ϲ��췽��
	{
		name="Ҧ�ۻ�";
		sex='M';
		nationality="�й�";
		address="�㶫ʡ���������������������ίԱ�Ὠ����·65��";
		birthday="1992-01-10";
		lssueDate="2012-12-20";
	    class1="C1";
	    validfrom="2012-12-20";
	    validfor=6;
        filenumber="440710418572";
	}
    Driver(String n,char s,String na,String a,String b,String l,String c,String vm,int vr,String f)//���ι��췽��
	{
		name=n;
		sex=(s=='F')?s:'M';//��������
		nationality=na;
		address=a;
		birthday=b;
		lssueDate=l;
	    class1=c;
	    validfrom=vm;
	    validfor=(vr==6||vr==10)?vr:6;;
        filenumber=f;
	}

	//get������set��������Щ������Ϣ���ṩset����
	public String getName(){return name;}
	public void setName(String n){name=n;}
	public char getSex(){return sex;}
	public void setSex(char s){sex=(s=='F')?s:'M';}//��������
	public String getNationality(){return nationality;}
	public void setNationality(String m){nationality=m;}
	public String getAddress(){return address;}
	public void setAddress(String a){address=a;}
	public String getBirthday(){return birthday;}
	public String getLssueDate(){return lssueDate;}
	public String getClass1(){return class1;}
	public String getValidfrom(){return validfrom;}
    public int getValidfor(){return validfor;}
	public void setValidfor(int vr){validfor=(vr==6||vr==10)?vr:6;}//��������
	public String getFilenumber(){return filenumber;}

	public void input()//���뷽��
	{
		System.out.print("������������");
		name=keyin.nextLine();
		do{
			System.out.print("���Ա�");
			sex=keyin.nextLine().charAt(0);
		}while(sex!='M'&&sex!='m'&&sex!='F'&&sex!='f');//��������
		System.out.print("�����������");
		nationality=keyin.nextLine();
		System.out.print("�������ַ��");
		address=keyin.nextLine();
		System.out.print("������������ڣ�");
		birthday=keyin.nextLine();
		System.out.print("�����������֤���ڣ�");
		lssueDate=keyin.nextLine();
		System.out.print("������׼�ݳ��ͣ�");
		class1=keyin.nextLine();
		System.out.print("��������Ч��ʼ���ڣ�");
		validfrom=keyin.nextLine();
		do{
			System.out.print("��������Ч����(6/10)��");
			validfor=keyin.nextInt();
		}while(validfor!=6&&validfor!=10);//��������
		System.out.print("������֤����ţ�");
		filenumber=keyin.next();
	}
	public void display()//�������
	{
		System.out.println(toString());
	}
	public String toString()
	{
		String str="============================================";
		str+="\n������"+name;
		str+="\n�Ա�"+sex;
		str+="\n������"+nationality;
		str+="\n��ַ��"+address;
		str+="\n�������ڣ�"+birthday;
		str+="\n������֤���ڣ�"+lssueDate;
		str+="\n׼�ݳ��ͣ�"+class1;
		str+="\n��Ч��ʼ���ڣ�"+validfrom;
		str+="\n��Ч���ޣ�"+validfor;
		str+="\n֤����ţ�"+filenumber;
		str+="\n============================================";
		return str;
	}
	public boolean equals(Driver another)
	{
		if(another==null)
			return false;
		else
			if(this==another)
			return true;
		else
			if(this.name==another.name&&this.sex==another.sex&&this.nationality==another.nationality&&this.address==another.address&&this.birthday==another.birthday&&this.lssueDate==another.lssueDate&&this.class1==another.class1&&this.validfrom==another.validfrom&&this.validfor==another.validfor&&this.filenumber==another.filenumber)
			return true;
		else
			return false;
	}
	public void photo(String args)//��Ƭ����
	{
		Toolkit imgtool=Toolkit.getDefaultToolkit();
		Image myimg=imgtool.getImage(args);
	    PhotoTest.displayImage(myimg);
	}
}
class Car//������
{
	private String vehicleNo;//��������
	private String vehicleType;//��������
	private String owner;//������
	private String address;//סַ
	private String engineNo;//����������
	private String VIN;//����ʶ�����
	private String date;//��������
	private float COT;//��������
	private float gasoline;//��ǰ����
	private float weight;//����
	private float deadweight;//������
	private String photo;//���ͼƬ
	private float viameter;//��·��
	private float[] lucheng=new float[3];//·��
	private float[] youhao=new float[3];//�ͺ�
	private float v,a;//�ٶ�,���ٶ�
	private float[] t=new float[3];//ʱ��
	Scanner keyin=new Scanner(System.in);

	Car()//Ĭ�Ϲ��췽��
	{
		vehicleNo="��E48920";//��������
		vehicleType="С�ͽγ�";//��������
		owner="���ܲ�";//������
		address="�ӱ�ʡ��̨��ƽ����ƽ�����ƴ�113��";//סַ
		engineNo="C375857";//����������
		VIN="LHGFE1351F1066000";//����ʶ�����
		date="2015-09-29";//��������
		COT=50;//��������
	    gasoline=0;//��ǰ����
		weight=1610;//������
		deadweight=1500;//������
		viameter=0;//��·��
	}
	Car(String v,String ve,String o,String a,String e,String V,String d,float C,float g,float w,float dw,float vi)//���ι��췽��
	{
		vehicleNo=v;//��������
		vehicleType=ve;//��������
		owner=o;//������
		address=a;//סַ
		engineNo=e;//����������
		VIN=V;//����ʶ�����
		date=d;//��������
		COT=C;//��������
		gasoline=(g>0)?g:0;//��ǰ����
		weight=w;//������
		deadweight=dw;//������
		viameter=vi;//��·��
	}
	
	//get������set��������Щ������Ϣ���ṩset����
	public String getVehicleNo(){return vehicleNo;}
	public void setVehicleNo(String v){vehicleNo=v;}
	public String getVehicleType(){return vehicleType;}
	public String getOwner(){return owner;}
	public void setOwner(String o){owner=o;}
	public String getAddress(){return address;}
	public void setAddress(String a){address=a;}
	public String getEngineNo(){return engineNo;}
	public String getVIN(){return VIN;}
	public String getDate(){return date;}
	public float getCOT(){return COT;}
	public float getGasoline(){return gasoline;}
	public void setGasoline(float g){gasoline=g;}
	public float getWeighte(){return weight;}
	public float getDeadweight(){return deadweight;}
	public void setDeadweight(float dw){deadweight=dw;}
	public float getViameter(){return viameter;}
	public void setViameter(float vi){viameter=vi;}

	public void input()//���뷽��
	{
        System.out.print("�������������ƣ�");
        vehicleNo=keyin.nextLine();
        System.out.print("�����복���ͺţ�");
        vehicleType=keyin.nextLine();
        System.out.print("�����������ˣ�");
        owner=keyin.nextLine();
        System.out.print("�������ַ��");
        address=keyin.nextLine();
        System.out.print("�����뷢�������룺");
        engineNo=keyin.nextLine();
        System.out.print("�����복��ʶ��ţ�");
        VIN=keyin.nextLine();
        System.out.print("�������������ڣ�");
		date=keyin.nextLine();
        System.out.print("��������������/L��");
        COT=keyin.nextFloat();
        do{
			System.out.print("�����뵱ǰ����/L��");//��������
			gasoline=keyin.nextFloat();
		}while(gasoline<0||gasoline>COT);
        System.out.print("����������/kg��");
        weight=keyin.nextFloat();
        System.out.print("������������kg/��");
        deadweight=keyin.nextFloat();
        System.out.print("���������г̹�������");
        viameter=keyin.nextFloat();
	}	
	public void display()//���뷽��
	{
		System.out.println(toString());
	}
	public boolean equals(Car C)
	{
		if(C==null)
			return false;
		else
			if(C==this)
			return true;
		else
			if(this.vehicleNo==C.vehicleNo&&this.vehicleType==C.vehicleType&&this.owner==C.owner&&this.address==C.address&&this.engineNo==C.engineNo&&this.VIN==C.VIN&&this.date==C.date&&this.COT==C.COT&&this.gasoline==C.gasoline&&this.weight==C.weight&&this.deadweight==C.deadweight&&this.viameter==C.viameter)
			return true;
		else
			return false;
	}
	public String toString()
	{
        String str="============================================";
        str+="\n�������ƣ�"+vehicleNo+"\n�������ͣ�"+vehicleType;
        str+="\n�����ˣ�"+owner+"\nסַ��"+address;
        str+="\n�������ͺţ�"+engineNo+"\n����ʶ��ţ�"+VIN+"\n�������ڣ�"+date;
        str+="\n����������"+COT+"L\n��ǰ������"+gasoline;
		str+="L\n������"+weight+"kg\n��������"+deadweight+"kg\n���г̣�"+viameter/1000+"km";                 
        str+="\n============================================";
        return str;
    }
	public void jiasu(float v0)//���ٷ���
	{
		if(gasoline/COT<0.1)
		{
			System.out.println("��ǰ������"+gasoline+"L����С��10%�������");
			jiayou();
		}
		do{
			System.out.print("��������ٶ�(0~10)��");
			a=keyin.nextFloat();
		}while(a<0||a>10);//��������
		do{
			System.out.print("���������ʱ�䣺");
			t[0]=keyin.nextFloat();
		}while(t[0]<0||(v0+a*t[0])>120/3.6);//��������
		v=v0+a*t[0];
		lucheng[0]=lucheng[0]+v0*t[0]+a*t[0]*t[0]/2;
		youhao[0]=youhao(lucheng[0],a,t[0]);
		System.out.println("��ʱ�ٶȣ�"+v*3.6+"km/h\t\t����ʱ�䣺"+t[0]+"s    �г̣�"+lucheng[0]/1000+"km");
	}
	public void yunsu(float v0)//���ٷ���
	{
		if(gasoline/COT<0.1)
		{
			System.out.println("��ǰ������"+gasoline+"L����С��10%�������");
			jiayou();
		}
		do{
			System.out.print("����������ʱ�䣺");
			t[1]=keyin.nextFloat();
		}while(t[1]<0);
		lucheng[1]=v0*t[1];
		youhao[1]=youhao(lucheng[1],0,t[1]);
		System.out.println("��ʱ�ٶȣ�"+v0*3.6+"km/h\t\t����ʱ�䣺"+t[1]+"s    �г�"+lucheng[1]/1000+"km");
	}
	public void jiansu(float v0)//���ٷ���
	{
		if(gasoline/COT<0.1)
		{
			System.out.println("��ǰ������"+gasoline+"L����С��10%�������");
			jiayou();
		}
		do{
			System.out.print("��������ٶ�(-10~0)��");
			a=keyin.nextFloat();
		}while(a<-10||a>0);//��������
	    do{
			System.out.print("���������ʱ�䣺");
			t[2]=keyin.nextFloat();
		}while(t[2]<0||(v0+a*t[2])<0);//��������
		v=v0+a*t[2];
		lucheng[2]=lucheng[2]+v0*t[2]+a*t[2]*t[2]/2;
		youhao[2]=youhao(lucheng[2],a,t[2]);
		System.out.println("��ʱ�ٶȣ�"+v*3.6+"km/h\t\t����ʱ�䣺"+t[2]+"s    �г�"+lucheng[2]/1000+"km");
	}
	public void xingshi(Address m1,Address m2)//��ʻ����
	{
		System.out.println("��������>>>");
		System.out.println("��"+m1.getSheng()+"ʡ"+m1.getShi()+"��"+m1.getXian()+"��"+m1.getXiang()+"\t��γ�����꣺("+m1.getX()+","+m1.getY()+")");
		System.out.println("��"+m2.getSheng()+"ʡ"+m2.getShi()+"��"+m2.getXian()+"��"+m2.getXiang()+"\t��γ�����꣺("+m2.getX()+","+m2.getY()+")");
		jiasu(0);
		yunsu(v);
		jiansu(v);
		viameter=lucheng[0]+lucheng[1]+lucheng[2];//��·��
		gasoline=gasoline-youhao[0]-youhao[1]-youhao[2];//��ǰ����
		tingche();
		kexingshijuli();
		System.out.println();
	}
	public void tingche()//ͣ������
	{
		v=0;
		System.out.println("��ʻ�������μ�ʻ���ͣ�"+(COT-gasoline)+"L\nƽ��ÿ������ͣ�"+(COT-gasoline)*1000/viameter+"L/km");
	}
	public float youhao(float l,float a,float t)//�ͺķ���
	{
		return l/10000+Math.abs(a)/1000*t;
	}
	public void jiayou()//���ͷ���
	{
		char a;
		float b;
		do{
			System.out.print("�Ƿ����(Y/N)?");
			a=keyin.next().charAt(0);
		}while(a!='Y'&&a!='N'&&a!='y'&&a!='n');
		if(a=='Y'||a=='y')
		{
			System.out.println("����Ϊ�����ͣ���ɷѣ�"+(COT-gasoline)*6.2);
			gasoline=COT;
		}
		else
		{
			do{
				System.out.print("��������Ҫ�Ӷ�����(0~"+(COT-gasoline)+")/L");
				b=keyin.nextFloat();
			}while(b<0||b>COT-gasoline);
			System.out.println("����Ϊ�����ͣ���ɷѣ�"+b*6.2);
			gasoline=gasoline+b;
		}
	}
	public void kexingshijuli()//����ʻ�������
	{
		System.out.println("������һ�ε�ƽ��ÿ������͹��ƿ���ʻ���룺"+Math.abs(gasoline*viameter/(COT-gasoline)/1000)+"km");
	}
	public void photo(String args)//��Ƭ����
	{
		Toolkit imgtool=Toolkit.getDefaultToolkit();
		Image myimg=imgtool.getImage(args);
	    PhotoTest.displayImage(myimg);
	}
	public static final String getDesigner()
	{
		String str="����ߣ�����    ѧ�ţ�320160939611    �༶�����������";
		return str;
	}
	public static void main(String[] args) 
	{
		Address a1=new Address();//Ĭ�Ϲ��췽��
		Address a2=new Address("����","����","����","����",110,27);//���ι��췽��
		Address a3=new Address();//�������
		Car c1=new Car();//Ĭ�Ϲ��췽��
		Car c2=new Car("��S-885PT","SUV","����","����ʡ�����ж�����������","320160939611","Y1000000","2017-5-1",50,0,1500,2000,0);//���ι��췽��
		Car c3=new Car();//�û��������
		Driver d1=new Driver();//Ĭ�Ϲ��췽��
		Driver d2=new Driver("����",'M',"�й�","����ʡ�����ж�����������","1998-12-17","2017-4-20","SUV","2017-4-20",6,"320160939611");//���ι��췽��
		Driver d3=new Driver();//�������
		System.out.println("��ʼ�������");
		a3.input();
		c3.input();
		d3.input();
		System.out.println("\n\n���Ĭ�Ϲ��췽��������������");
		a1.display();
		c1.display();
		d1.display();
		System.out.println("\n\n������ι��췽��������������");
		a2.display();
		c2.display();
		d2.display();
		System.out.println("\n");
		c3.xingshi(a1,a3);
		a3.display();
		c3.display();
		d3.display();
		System.out.println("a1==a2?="+a1.equals(a2));
		System.out.println("c1==c2?="+c1.equals(c2));
		System.out.println("d1==d2?="+d1.equals(d2));
		System.out.println("\n"+getDesigner());
		a1.photo(args[0]);
		c1.photo(args[1]);
		d1.photo(args[2]);
	}
}
class Address//��ַ��
{
    private String sheng;//ʡ
	private String shi;//��
	private String xian;//��
    private String xiang;//��
    private float x;//����
    private float y;//γ��
    Address()//Ĭ�Ϲ��췽��
	{
		sheng="�㶫";
		shi="����";
		xian="����";
		xiang="�������ίԱ�Ὠ����·65��";
		x=104;
		y=38;
	}
    Address(String a,String b,String c,String d,float e,float f)//���ι��췽��
	{
		sheng=a;
		shi=b;
		xian=c;
		xiang=d;
		x=(0<=e&&e<=180)?e:104;//�������ݣ�δ���Ƕ������ϱ�γ
		y=(0<=f&&f<=90)?f:38;//�������ݣ�δ���Ƕ������ϱ�γ
	}

	public String getSheng(){return sheng;}
	public String getShi(){return shi;}
    public String getXian(){return xian;}
    public String getXiang(){return xiang;}
    public float getX(){return x;}
    public float getY(){return y;}
    public void setSheng(String s){sheng=s;}
	public void setshi(String sh){shi=sh;}
    public void setXian(String xi){xian=xi;}
    public void setXiang(String xia){xiang=xia;}
    public void setX(float m){x=(0<=m&&m<=180)?m:104;}//�������ݣ�δ���Ƕ������ϱ�γ
    public void setY(float n){y=(0<=n&&n<=90)?n:38;}//�������ݣ�δ���Ƕ������ϱ�γ
	Scanner keyin=new Scanner(System.in);

	public void input()//���뷽��
	{
		System.out.print("������ʡ��");
        sheng=keyin.nextLine();
		System.out.print("�������У�");
        shi=keyin.nextLine();
        System.out.print("�������أ�");
        xian=keyin.nextLine();
        System.out.print("�������磺");
        xiang=keyin.nextLine();
		do{
			System.out.print("�����뾭��(0~180)��");
			x=keyin.nextFloat();
		}while(x<0||x>180);//�������ݣ�δ���Ƕ������ϱ�γ
		do{
			System.out.print("������γ��(0~90)��");
			y=keyin.nextFloat();
		}while(y<0||y>90);//�������ݣ�δ���Ƕ������ϱ�γ	
	}
	public void display()//�������
	{
		System.out.println(toString());
	}
	public String toString()
	{
		String str="============================================";
		str+="\nסַ��"+sheng+"ʡ"+shi+"��"+xian+"��"+xiang+"\n��γ�����꣺("+x+","+y+")";
		str+="\n============================================";
		return str;
	}
	public boolean equals(Address A)
	{
		if(A==null)
			return false;
		else
			if(this==A)
			return true;
		else
			if(this.sheng==A.sheng&&this.shi==A.shi&&this.xian==A.xian&&this.xiang==A.xiang)
			return true;
		else
			return false;
	}
	public void photo(String args)//��Ƭ����
	{
		Toolkit imgtool=Toolkit.getDefaultToolkit();
	    Image myimg=imgtool.getImage(args);
		PhotoTest.displayImage(myimg);
	}
}
class PhotoTest//��Ƭ��
{
    public static void displayImage(Image img)
	{
       JFrame frame =new JFrame("ͼƬ��ʾ");
       ImageIcon imgicon=new ImageIcon(img);
	   frame.setSize(1024,400);
	   //frame.setSize(imgicon.getIconWidth(),imgicon.getIconHeight());
       JLabel label = new JLabel();
       label.setIcon(imgicon);
       frame.add(label);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
}