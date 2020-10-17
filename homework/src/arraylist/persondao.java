package arraylist;

import java.util.*;

public class persondao {
	ArrayList<person> al = new ArrayList<person>();

	public void insertperson() {
		person p = new person();
		boolean bl = false;
		for (int i = 0; i < al.size(); i++) {
			if ((p.getName()).equals(al.get(i).getName())) {
				bl = true;
				break;
			}
		}
		if (bl)
			System.out.println("该联系人已添加");
		else {
			al.add(p);
			System.out.println("添加联系人成功");
		}
	}

	public void delpersonbyid() {
		System.out.print("请输入要删除联系人的姓名|Pid|Tel：");
		@SuppressWarnings("resource")
		Scanner keyin = new Scanner(System.in);
		String pnt = keyin.nextLine();
		boolean bl = false;
		for (int i = 0; i < al.size(); i++) {
			if ((al.get(i).getPid().equals(pnt)) || (al.get(i).getName().equals(pnt))
					|| (al.get(i).getTel().equals(pnt))) {
				bl = true;
				al.remove(i);
			}
		}
		if (bl)
			System.out.println("已删除联系人");
		else
			System.out.println("联系人表中无此联系人");
	}

	public void modifyperson() {
		System.out.print("请输入要修改联系人的姓名|Pid|Tel：");
		@SuppressWarnings("resource")
		Scanner keyin = new Scanner(System.in);
		String pnt = keyin.nextLine();
		boolean bl = false;
		for (int i = 0; i < al.size(); i++) {
			if ((al.get(i).getPid().equals(pnt)) || (al.get(i).getName().equals(pnt))
					|| (al.get(i).getTel().equals(pnt))) {
				bl = true;
				al.get(i).modify();
			}
		}
		if (bl)
			System.out.println("已更新联系人");
		else
			System.out.println("联系人表中无此联系人");
	}

	public person queryperson() {

		System.out.print("请输入要查询联系人的姓名|Pid|Tel：");
		@SuppressWarnings("resource")
		Scanner keyin = new Scanner(System.in);
		String pnt = keyin.nextLine();
		boolean bl = false;
		int p = 0;
		for (int i = 0; i < al.size(); i++) {
			if ((al.get(i).getPid().equals(pnt)) || (al.get(i).getName().equals(pnt))
					|| (al.get(i).getTel().equals(pnt))) {
				bl = true;
				p = i;
			}
		}
		if (bl) {
			System.out.println("找到联系人信息：");
			return al.get(p);
		} else {
			System.out.println("联系人表中无此联系人");
			return null;
		}
	}
}
