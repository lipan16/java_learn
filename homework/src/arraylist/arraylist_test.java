package arraylist;

import java.util.Scanner;


public class arraylist_test {
	public void list_test() {
		persondao pd = new persondao();
		while (true) {
			System.out.println("*****************************************");
			System.out.println("*             通讯录测试                                    *");
			System.out.println("*---------------------------------------*");
			System.out.println("*               1.添加                  *");
			System.out.println("*               2.删除                  *");
			System.out.println("*               3.修改                  *");
			System.out.println("*               4.查询                  *");
			System.out.println("*               5.退出                  *");
			System.out.println("*****************************************");
			System.out.println("请按键选择！！！");
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
				System.out.println("退出成功");
				System.exit(0);break;
			}
		}
	}

}
