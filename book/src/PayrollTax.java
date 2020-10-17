import java.util.Scanner;
/**
*��������˰��˰˵��(2013)
*Ӧ��˰�� = ����н˰���� - �۳�������* ����˰�� - ����۳���
*
*��ע����н˰���� = ��������ʵ���� + ��������
*
*��������˰˰�ʱ�(����3500)
*���� 	ȫ��Ӧ��˰���ö� 	˰�ʣ�%�� 	����۳���
*1 	������1500Ԫ 			3 	0
*2 	����1500Ԫ��4500Ԫ�Ĳ��� 	10 	105
*3 	����4500Ԫ��9000Ԫ�Ĳ��� 	20 	555
*4 	����9000Ԫ��35000Ԫ�Ĳ��� 	25 	1005
*5 	����35000Ԫ��55000Ԫ�Ĳ��� 	30 	2755
*6 	����55000Ԫ��80000Ԫ�Ĳ��� 	35 	5505
*7 	����80000Ԫ�Ĳ��� 		45 	13505
*/
class TaxPolicy { //����˰�����߳���ͷ�װ
    public static int getDeduct(double income){
        income=income-3500;
        if(income<=1500) return 0;
        else if(income<=4500) return 105;
        else if(income<=9000) return 555;
        else if(income<35000) return 1005;
        else if(income<55000) return 2755;
        else if(income<80000) return 5505;
        else return 13505;
    }
    public static int taxRate(double income){
        income=income-3500;
        if(income<=1500) return 3;
        else if(income<=4500) return 10;
        else if(income<=9000) return 20;
        else if(income<35000) return 25;
        else if(income<55000) return 30;
        else if(income<80000) return 35;
        else return 45;
    } 
}
/**
* ��Ա����󣬳�������ʺš������������Լ�����һ��
*/
class Employee { // ��Ա��  
    private String staff_no;       //���ʺ�  
    private String name;     
    private double salary;      // Ӧ������  
    private double insurancesandfund;  // "����һ��"����  
    Employee(String ID,String name){ //��2�����Ĺ��췽��  
        this.staff_no = ID;  
        this.name = name;  
    }     
    Employee(String ID,String name,double salary,double insurancesandfund){  //��4�����Ĺ��췽��  
        this.staff_no = ID;  
        this.name = name;  
        this.salary = salary;  
        this.insurancesandfund = insurancesandfund;  
    }  
    public String getStaff_no() {  
        return staff_no;  
    }  
    public String getName() {  
        return name;  
    }  
    public double getSalary() {  
        return salary;  
    }  
    public double getInsurancesandfund() {  
        return insurancesandfund;  
    }  
    public void setStaff_no(String iD) {  
        staff_no = iD;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public void setSalary(double salary) {  
        this.salary = salary;  
    }  
    public void setInsurancesandfund(double insure) {  
        this.insurancesandfund = insure;  
    }  
    public double getTax(){
        return (salary-insurancesandfund-3500)*TaxPolicy.taxRate(salary)/100.0-TaxPolicy.getDeduct(salary);
        
    }
    public double getRealIncome(){
        return salary-getTax()-insurancesandfund; 
    }
}
/**
* ���������
*/
public class PayrollTax{ 
    public static void main(String[] args){
        Employee emp1=new Employee("1001","����",6581,812.82);
        Employee emp2=new Employee("1002","����");
        System.out.println("���:"+emp1.getStaff_no()+"������:"+emp1.getName()+" ��Ӧ��˰����:"+emp1.getTax()+",˰�������ǣ�"+emp1.getRealIncome());  
        Scanner mykey=new Scanner(System.in);
        System.out.print("���������ĵ�Ӧ�����ʣ�");
        double s=mykey.nextDouble();
        System.out.print("���������ĵ�����һ��");
        double insurance=mykey.nextDouble();
        emp2.setSalary(s);
        emp2.setInsurancesandfund(insurance);
        System.out.println("���:"+emp2.getStaff_no()+"������:"+emp2.getName()+" ��Ӧ��˰����:"+emp2.getTax()+",˰�������ǣ�"+emp2.getRealIncome());  
     }  
}  