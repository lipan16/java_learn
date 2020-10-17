import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.util.Scanner;
class Driver//驾驶员类
{	
	private String name;//姓名
	private char sex;//性别
	private String nationality;//国籍
	private String address;//住址
	private String birthday;//出生日期
	private String lssueDate;//初次领证日期
	private String class1;//准驾车型
	private String validfrom;//有效日期
	private int validfor;//有效期限
	private String filenumber;//档案编号
	Scanner keyin=new Scanner(System.in);

    Driver()//默认构造方法
	{
		name="姚观槐";
		sex='M';
		nationality="中国";
		address="广东省阳江市阳西县上洋镇居民委员会建设中路65号";
		birthday="1992-01-10";
		lssueDate="2012-12-20";
	    class1="C1";
	    validfrom="2012-12-20";
	    validfor=6;
        filenumber="440710418572";
	}
    Driver(String n,char s,String na,String a,String b,String l,String c,String vm,int vr,String f)//带参构造方法
	{
		name=n;
		sex=(s=='F')?s:'M';//过滤数据
		nationality=na;
		address=a;
		birthday=b;
		lssueDate=l;
	    class1=c;
	    validfrom=vm;
	    validfor=(vr==6||vr==10)?vr:6;;
        filenumber=f;
	}

	//get方法，set方法，有些敏感信息不提供set方法
	public String getName(){return name;}
	public void setName(String n){name=n;}
	public char getSex(){return sex;}
	public void setSex(char s){sex=(s=='F')?s:'M';}//过滤数据
	public String getNationality(){return nationality;}
	public void setNationality(String m){nationality=m;}
	public String getAddress(){return address;}
	public void setAddress(String a){address=a;}
	public String getBirthday(){return birthday;}
	public String getLssueDate(){return lssueDate;}
	public String getClass1(){return class1;}
	public String getValidfrom(){return validfrom;}
    public int getValidfor(){return validfor;}
	public void setValidfor(int vr){validfor=(vr==6||vr==10)?vr:6;}//过滤数据
	public String getFilenumber(){return filenumber;}

	public void input()//输入方法
	{
		System.out.print("请输入姓名：");
		name=keyin.nextLine();
		do{
			System.out.print("请性别：");
			sex=keyin.nextLine().charAt(0);
		}while(sex!='M'&&sex!='m'&&sex!='F'&&sex!='f');//过滤数据
		System.out.print("请输入国籍：");
		nationality=keyin.nextLine();
		System.out.print("请输入地址：");
		address=keyin.nextLine();
		System.out.print("请输入出生日期：");
		birthday=keyin.nextLine();
		System.out.print("请输入初次领证日期：");
		lssueDate=keyin.nextLine();
		System.out.print("请输入准驾车型：");
		class1=keyin.nextLine();
		System.out.print("请输入有效起始日期：");
		validfrom=keyin.nextLine();
		do{
			System.out.print("请输入有效期限(6/10)：");
			validfor=keyin.nextInt();
		}while(validfor!=6&&validfor!=10);//过滤数据
		System.out.print("请输入证件编号：");
		filenumber=keyin.next();
	}
	public void display()//输出方法
	{
		System.out.println(toString());
	}
	public String toString()
	{
		String str="============================================";
		str+="\n姓名："+name;
		str+="\n性别："+sex;
		str+="\n国籍："+nationality;
		str+="\n地址："+address;
		str+="\n出生日期："+birthday;
		str+="\n初次领证日期："+lssueDate;
		str+="\n准驾车型："+class1;
		str+="\n有效起始日期："+validfrom;
		str+="\n有效期限："+validfor;
		str+="\n证件编号："+filenumber;
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
	public void photo(String args)//照片加载
	{
		Toolkit imgtool=Toolkit.getDefaultToolkit();
		Image myimg=imgtool.getImage(args);
	    PhotoTest.displayImage(myimg);
	}
}
class Car//汽车类
{
	private String vehicleNo;//汽车号牌
	private String vehicleType;//汽车类型
	private String owner;//所有人
	private String address;//住址
	private String engineNo;//发动机号码
	private String VIN;//车辆识别代码
	private String date;//生产日期
	private float COT;//油箱容量
	private float gasoline;//当前油量
	private float weight;//重量
	private float deadweight;//载重量
	private String photo;//外观图片
	private float viameter;//总路程
	private float[] lucheng=new float[3];//路程
	private float[] youhao=new float[3];//油耗
	private float v,a;//速度,加速度
	private float[] t=new float[3];//时间
	Scanner keyin=new Scanner(System.in);

	Car()//默认构造方法
	{
		vehicleNo="翼E48920";//汽车号牌
		vehicleType="小型轿车";//汽车类型
		owner="武绍波";//所有人
		address="河北省邢台市平乡县平乡镇东闫村113号";//住址
		engineNo="C375857";//发动机号码
		VIN="LHGFE1351F1066000";//车辆识别代码
		date="2015-09-29";//生产日期
		COT=50;//油箱容量
	    gasoline=0;//当前油量
		weight=1610;//车重量
		deadweight=1500;//载重量
		viameter=0;//总路程
	}
	Car(String v,String ve,String o,String a,String e,String V,String d,float C,float g,float w,float dw,float vi)//带参构造方法
	{
		vehicleNo=v;//汽车号牌
		vehicleType=ve;//汽车类型
		owner=o;//所有人
		address=a;//住址
		engineNo=e;//发动机号码
		VIN=V;//车辆识别代码
		date=d;//生产日期
		COT=C;//油箱容量
		gasoline=(g>0)?g:0;//当前油量
		weight=w;//车重量
		deadweight=dw;//载重量
		viameter=vi;//总路程
	}
	
	//get方法，set方法，有些敏感信息不提供set方法
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

	public void input()//输入方法
	{
        System.out.print("请输入汽车号牌：");
        vehicleNo=keyin.nextLine();
        System.out.print("请输入车辆型号：");
        vehicleType=keyin.nextLine();
        System.out.print("请输入所有人：");
        owner=keyin.nextLine();
        System.out.print("请输入地址：");
        address=keyin.nextLine();
        System.out.print("请输入发动机号码：");
        engineNo=keyin.nextLine();
        System.out.print("请输入车辆识别号：");
        VIN=keyin.nextLine();
        System.out.print("请输入生产日期：");
		date=keyin.nextLine();
        System.out.print("请输入油箱容量/L：");
        COT=keyin.nextFloat();
        do{
			System.out.print("请输入当前油量/L：");//过滤数据
			gasoline=keyin.nextFloat();
		}while(gasoline<0||gasoline>COT);
        System.out.print("请输入重量/kg：");
        weight=keyin.nextFloat();
        System.out.print("请输入载重量kg/：");
        deadweight=keyin.nextFloat();
        System.out.print("请输入总行程公里数：");
        viameter=keyin.nextFloat();
	}	
	public void display()//输入方法
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
        str+="\n汽车号牌："+vehicleNo+"\n车辆类型："+vehicleType;
        str+="\n所有人："+owner+"\n住址："+address;
        str+="\n发动机型号："+engineNo+"\n车辆识别号："+VIN+"\n生产日期："+date;
        str+="\n油箱容量："+COT+"L\n当前油量："+gasoline;
		str+="L\n重量："+weight+"kg\n载重量："+deadweight+"kg\n总行程："+viameter/1000+"km";                 
        str+="\n============================================";
        return str;
    }
	public void jiasu(float v0)//加速方法
	{
		if(gasoline/COT<0.1)
		{
			System.out.println("当前油量："+gasoline+"L油量小于10%，请加油");
			jiayou();
		}
		do{
			System.out.print("请输入加速度(0~10)：");
			a=keyin.nextFloat();
		}while(a<0||a>10);//过滤数据
		do{
			System.out.print("请输入加速时间：");
			t[0]=keyin.nextFloat();
		}while(t[0]<0||(v0+a*t[0])>120/3.6);//过滤数据
		v=v0+a*t[0];
		lucheng[0]=lucheng[0]+v0*t[0]+a*t[0]*t[0]/2;
		youhao[0]=youhao(lucheng[0],a,t[0]);
		System.out.println("此时速度："+v*3.6+"km/h\t\t加速时间："+t[0]+"s    行程："+lucheng[0]/1000+"km");
	}
	public void yunsu(float v0)//匀速方法
	{
		if(gasoline/COT<0.1)
		{
			System.out.println("当前油量："+gasoline+"L油量小于10%，请加油");
			jiayou();
		}
		do{
			System.out.print("请输入匀速时间：");
			t[1]=keyin.nextFloat();
		}while(t[1]<0);
		lucheng[1]=v0*t[1];
		youhao[1]=youhao(lucheng[1],0,t[1]);
		System.out.println("此时速度："+v0*3.6+"km/h\t\t匀速时间："+t[1]+"s    行程"+lucheng[1]/1000+"km");
	}
	public void jiansu(float v0)//减速方法
	{
		if(gasoline/COT<0.1)
		{
			System.out.println("当前油量："+gasoline+"L油量小于10%，请加油");
			jiayou();
		}
		do{
			System.out.print("请输入加速度(-10~0)：");
			a=keyin.nextFloat();
		}while(a<-10||a>0);//过滤数据
	    do{
			System.out.print("请输入减速时间：");
			t[2]=keyin.nextFloat();
		}while(t[2]<0||(v0+a*t[2])<0);//过滤数据
		v=v0+a*t[2];
		lucheng[2]=lucheng[2]+v0*t[2]+a*t[2]*t[2]/2;
		youhao[2]=youhao(lucheng[2],a,t[2]);
		System.out.println("此时速度："+v*3.6+"km/h\t\t加速时间："+t[2]+"s    行程"+lucheng[2]/1000+"km");
	}
	public void xingshi(Address m1,Address m2)//行驶方法
	{
		System.out.println("车启动中>>>");
		System.out.println("从"+m1.getSheng()+"省"+m1.getShi()+"市"+m1.getXian()+"县"+m1.getXiang()+"\t经纬度坐标：("+m1.getX()+","+m1.getY()+")");
		System.out.println("到"+m2.getSheng()+"省"+m2.getShi()+"市"+m2.getXian()+"县"+m2.getXiang()+"\t经纬度坐标：("+m2.getX()+","+m2.getY()+")");
		jiasu(0);
		yunsu(v);
		jiansu(v);
		viameter=lucheng[0]+lucheng[1]+lucheng[2];//总路程
		gasoline=gasoline-youhao[0]-youhao[1]-youhao[2];//当前油量
		tingche();
		kexingshijuli();
		System.out.println();
	}
	public void tingche()//停车方法
	{
		v=0;
		System.out.println("驾驶结束本次驾驶耗油："+(COT-gasoline)+"L\n平均每公里耗油："+(COT-gasoline)*1000/viameter+"L/km");
	}
	public float youhao(float l,float a,float t)//油耗方法
	{
		return l/10000+Math.abs(a)/1000*t;
	}
	public void jiayou()//加油方法
	{
		char a;
		float b;
		do{
			System.out.print("是否加满(Y/N)?");
			a=keyin.next().charAt(0);
		}while(a!='Y'&&a!='N'&&a!='y'&&a!='n');
		if(a=='Y'||a=='y')
		{
			System.out.println("正在为您加油，请缴费："+(COT-gasoline)*6.2);
			gasoline=COT;
		}
		else
		{
			do{
				System.out.print("请输入您要加都少油(0~"+(COT-gasoline)+")/L");
				b=keyin.nextFloat();
			}while(b<0||b>COT-gasoline);
			System.out.println("正在为您加油，请缴费："+b*6.2);
			gasoline=gasoline+b;
		}
	}
	public void kexingshijuli()//可行驶距离估计
	{
		System.out.println("根据上一次的平均每公里耗油估计可行驶距离："+Math.abs(gasoline*viameter/(COT-gasoline)/1000)+"km");
	}
	public void photo(String args)//照片加载
	{
		Toolkit imgtool=Toolkit.getDefaultToolkit();
		Image myimg=imgtool.getImage(args);
	    PhotoTest.displayImage(myimg);
	}
	public static final String getDesigner()
	{
		String str="设计者：李攀    学号：320160939611    班级：计算机二班";
		return str;
	}
	public static void main(String[] args) 
	{
		Address a1=new Address();//默认构造方法
		Address a2=new Address("湖南","邵阳","洞口","杨林",110,27);//带参构造方法
		Address a3=new Address();//输入参数
		Car c1=new Car();//默认构造方法
		Car c2=new Car("粤S-885PT","SUV","李攀","湖南省邵阳市洞口县杨林乡","320160939611","Y1000000","2017-5-1",50,0,1500,2000,0);//带参构造方法
		Car c3=new Car();//用户输入参数
		Driver d1=new Driver();//默认构造方法
		Driver d2=new Driver("李攀",'M',"中国","湖南省邵阳市洞口县杨林乡","1998-12-17","2017-4-20","SUV","2017-4-20",6,"320160939611");//带参构造方法
		Driver d3=new Driver();//输入参数
		System.out.println("开始输入参数");
		a3.input();
		c3.input();
		d3.input();
		System.out.println("\n\n输出默认构造方法创建对象内容");
		a1.display();
		c1.display();
		d1.display();
		System.out.println("\n\n输出带参构造方法创建对象内容");
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
class Address//地址类
{
    private String sheng;//省
	private String shi;//市
	private String xian;//县
    private String xiang;//乡
    private float x;//经度
    private float y;//纬度
    Address()//默认构造方法
	{
		sheng="广东";
		shi="阳江";
		xian="阳西";
		xiang="上洋居民委员会建设中路65号";
		x=104;
		y=38;
	}
    Address(String a,String b,String c,String d,float e,float f)//带参构造方法
	{
		sheng=a;
		shi=b;
		xian=c;
		xiang=d;
		x=(0<=e&&e<=180)?e:104;//过滤数据，未考虑东西经南北纬
		y=(0<=f&&f<=90)?f:38;//过滤数据，未考虑东西经南北纬
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
    public void setX(float m){x=(0<=m&&m<=180)?m:104;}//过滤数据，未考虑东西经南北纬
    public void setY(float n){y=(0<=n&&n<=90)?n:38;}//过滤数据，未考虑东西经南北纬
	Scanner keyin=new Scanner(System.in);

	public void input()//输入方法
	{
		System.out.print("请输入省：");
        sheng=keyin.nextLine();
		System.out.print("请输入市：");
        shi=keyin.nextLine();
        System.out.print("请输入县：");
        xian=keyin.nextLine();
        System.out.print("请输入乡：");
        xiang=keyin.nextLine();
		do{
			System.out.print("请输入经度(0~180)：");
			x=keyin.nextFloat();
		}while(x<0||x>180);//过滤数据，未考虑东西经南北纬
		do{
			System.out.print("请输入纬度(0~90)：");
			y=keyin.nextFloat();
		}while(y<0||y>90);//过滤数据，未考虑东西经南北纬	
	}
	public void display()//输出方法
	{
		System.out.println(toString());
	}
	public String toString()
	{
		String str="============================================";
		str+="\n住址："+sheng+"省"+shi+"市"+xian+"县"+xiang+"\n经纬度坐标：("+x+","+y+")";
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
	public void photo(String args)//照片加载
	{
		Toolkit imgtool=Toolkit.getDefaultToolkit();
	    Image myimg=imgtool.getImage(args);
		PhotoTest.displayImage(myimg);
	}
}
class PhotoTest//照片类
{
    public static void displayImage(Image img)
	{
       JFrame frame =new JFrame("图片显示");
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