package arraylist;

import java.util.Scanner;


public class arraylist_test {
	public void list_test() {
		persondao pd = new persondao();
		while (true) {
			System.out.println("*****************************************");
			System.out.println("*             ͨѶ¼����                                    *");
			System.out.println("*---------------------------------------*");
			System.out.println("*               1.���                  *");
			System.out.println("*               2.ɾ��                  *");
			System.out.println("*               3.�޸�                  *");
			System.out.println("*               4.��ѯ                  *");
			System.out.println("*               5.�˳�                  *");
			System.out.println("*****************************************");
			System.out.println("�밴��ѡ�񣡣���");
			@SuppressWarnings("resource")
			int s = new Scanner(System.in).nextInt();
			switch (s) {
			case 1:
				pd.insertperson();break;
			case 2:
				pd.delpersonbyid();break;
			case 3:
				pd.modifyperson();break;
			case 4:
				person per = pd.queryperson();
				System.out.println(per.toString());break;
			case 5:
				System.out.println("�˳��ɹ�");
				System.exit(0);break;
			}
		}
	}

}
